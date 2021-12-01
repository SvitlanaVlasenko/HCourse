package com.company.homework13;

import java.util.*;

/**
 * Пример хранения:
 * /path/to/file -> [files.txt, firstApp.java]
 */
public class FileNavigator {
    private Map<String, List<FileData>> files = new HashMap<>();

    /**
     * @throws IllegalArgumentException - when key-path is not equal to passed file path
     */
    public void add(String path, FileData data) {
        if (!path.equals(data.getPath())) {
            throw new IllegalArgumentException(
                    String.format("Target path -> [%s] and file path -> [%s] are not equal.", path, data.getPath())
            );
        }

        if (files.containsKey(path)) {
            files.get(path).add(data);
        } else {
            List<FileData> batchOfFiles = new ArrayList<>();
            batchOfFiles.add(data);
            files.put(path, batchOfFiles);
        }
    }

    public List<FileData> find(String path) {
        return files.containsKey(path) ? files.get(path) : Collections.emptyList();
    }

    public List<FileData> filterBySize(byte maxSize) {
        List<FileData> filteredFiles = new ArrayList<>();

        for (List<FileData> batchOfFiles: files.values()) {
            for (FileData file: batchOfFiles) {
                if (file.getSize() <= maxSize) {
                    filteredFiles.add(file);
                }
            }
        }

        return filteredFiles;
    }

    public void remove(String path) {
        files.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortedFiles = new ArrayList<>();

        for (List<FileData> batchOfFiles : files.values()) {
            sortedFiles.addAll(batchOfFiles);
        }

        Collections.sort(sortedFiles);
        return sortedFiles;
    }

    public List<FileData> sortBySize2() {
        List<FileData> sortedFiles = new ArrayList<>();

        for (List<FileData> batchOfFiles : files.values()) {
            sortedFiles.addAll(batchOfFiles);
        }

        Collections.sort(sortedFiles, new Comparator<FileData>() {
            @Override
            public int compare(FileData o1, FileData o2) {
                return o1.getSize() - o2.getSize();
            }
        });
        return sortedFiles;
    }
}