package com.company.homework11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private List<Record> recordsList = new ArrayList<>();

    public void add(String name, String phone) {
        add(new Record(name, phone));
    }


    public void add(Record newRecord) {
        recordsList.add(newRecord);
    }

    public Record find(String name) {
        for (Record newRecord : recordsList) {
            if (newRecord.getName().equals(name)) {
                return (Record) recordsList;
            }
        }
        return null;
    }


}
