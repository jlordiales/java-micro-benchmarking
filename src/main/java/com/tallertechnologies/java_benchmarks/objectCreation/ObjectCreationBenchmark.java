package com.tallertechnologies.java_benchmarks.objectCreation;

import java.util.ArrayList;
import java.util.List;

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;

public class ObjectCreationBenchmark extends SimpleBenchmark {
    @Param({ "20", "200", "2000" })
    int listSize;
    private List<String> list;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        list = new ArrayList<String>();
    }

    public void timeCreateList(int reps) {
        for (int rep = 0; rep < reps; ++rep) {
            for (int i = 0; i < listSize; i++) {
                list = new ArrayList<String>();
                list.add("create list");
            }
        }
    }

    public void timeReuseList(int reps) {
        for (int rep = 0; rep < reps; ++rep) {
            for (int i = 0; i < listSize; i++) {
                list.clear();
                list.add("reuse list");
            }
        }
    }
}
