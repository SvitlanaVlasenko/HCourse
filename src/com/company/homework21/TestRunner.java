package com.company.homework21;

import org.junit.platform.engine.discovery.ClassNameFilter;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class TestRunner {
    private SummaryGeneratingListener listener = new SummaryGeneratingListener();

    public <T> void run(Class<T> aClass) throws FileNotFoundException {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(DiscoverySelectors.selectClass(aClass))
                .build();

        launchResult(request);
    }
    public <T> void run(Class<?>... aClass) throws FileNotFoundException {
        for (Class<?> bClass : aClass) {
            LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                    .selectors(DiscoverySelectors.selectClass(bClass))
                    .build();
            launchResult(request);

        }
    }
    public void run(String className) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(DiscoverySelectors.selectClass(className))
                .build();

        launchResult(request);
    }

    public void run(String... classNames) {
        for (String className : classNames) {

            LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                    .selectors(DiscoverySelectors.selectClass(className))
                    .build();

            launchResult(request);
        }
    }

    public void run(String packagePath) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(DiscoverySelectors.selectPackage(packagePath))
                .filters(ClassNameFilter.includeClassNamePatterns(".*Test"))
                .build();

            launchResult(request);
    }
        private void launchResult(LauncherDiscoveryRequest request) {
            Launcher launcher = LauncherFactory.create();
            TestPlan testPlan = launcher.discover(request);
            launcher.registerTestExecutionListeners(listener);
            launcher.execute(request);
            TestExecutionSummary summary = listener.getSummary();
            summary.printTo(new PrintWriter(System.out));
//            try {
//                PrintWriter printWriter = new PrintWriter(new FileOutputStream("resultTest.txt", true));
//                summary.printTo(printWriter);
//            }catch (IOException e){
//                System.out.println(e.getMessage());
//            }
        }


}
