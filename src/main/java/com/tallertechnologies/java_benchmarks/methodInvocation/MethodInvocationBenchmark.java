package com.tallertechnologies.java_benchmarks.methodInvocation;

import com.google.caliper.SimpleBenchmark;

public class MethodInvocationBenchmark extends SimpleBenchmark {
    private int field;

    public int getField() {
        return field;
    }

    public int timeGetter(int reps) {
        int result = 0;
        for (int i = 0; i < reps; ++i) {
            result += getField() + i;
        }
        return result;
    }

    public int timeDirectAccess(int reps) {
        int result = 0;
        for (int i = 0; i < reps; ++i) {
            result += field + i;
        }
        return result;

    }
}
