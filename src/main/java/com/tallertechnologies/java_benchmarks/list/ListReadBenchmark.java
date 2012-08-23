package com.tallertechnologies.java_benchmarks.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;

public class ListReadBenchmark extends SimpleBenchmark {
    @Param({ "2000", "10000", "20000" })
    int size;
    private ArrayList<Integer> arrayList = null;
    private LinkedList<Integer> linkedList = null;
    private Vector<Integer> vector = null;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        arrayList = new ArrayList<Integer>();
        linkedList = new LinkedList<Integer>();
        vector = new Vector<Integer>();
        for (int i = 0; i < size; i++) {
            arrayList.add(size % 2);
            linkedList.add(size % 2);
            vector.add(size % 2);
        }
    }

    public int timeIterateArray(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            for (final int each : arrayList) {
                ret += each;
            }
        }
        return ret;
    }

    public int timeIterateLinked(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            for (final int each : linkedList) {
                ret += each;
            }
        }
        return ret;
    }

    public int timeIterateVector(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            for (final int each : vector) {
                ret += each;
            }
        }
        return ret;
    }

    public int timeReadFirstArray(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            ret += arrayList.get(0) + i;
        }
        return ret;
    }

    public int timeReadFirstLinked(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            ret += linkedList.get(0) + i;
        }
        return ret;
    }

    public int timeReadFirstVector(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            ret += vector.get(0) + i;
        }
        return ret;
    }

    public int timeReadLastArray(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            ret += arrayList.get(size - 1) + i;
        }
        return ret;
    }

    public int timeReadLastLinked(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            ret += linkedList.get(size - 1) + i;
        }
        return ret;
    }

    public int timeReadLastVector(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            ret += vector.get(size - 1) + i;
        }
        return ret;
    }

    public int timeReadMiddleArray(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            ret += arrayList.get(size / 2) + i;
        }
        return ret;
    }

    public int timeReadMiddleLinked(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            ret += linkedList.get(size / 2) + i;
        }
        return ret;
    }

    public int timeReadMiddleVector(int reps) {
        int ret = 0;
        for (int i = 0; i < reps; i++) {
            ret += vector.get(size / 2) + i;
        }
        return ret;
    }
}
