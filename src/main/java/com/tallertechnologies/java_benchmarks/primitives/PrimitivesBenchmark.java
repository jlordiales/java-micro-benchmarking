package com.tallertechnologies.java_benchmarks.primitives;

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;

public class PrimitivesBenchmark extends SimpleBenchmark {
    @Param({ "20", "200", "2000" })
    int limit;

    public long timeNonPrimitive(int reps) {
        Long ret = 0L;
        for (int rep = 0; rep < reps; ++rep) {
            for (long i = 0; i < limit; i++) {
                ret += i;
            }
        }
        return ret;
    }

    public long timePrimitive(int reps) {
        long ret = 0L;
        for (int rep = 0; rep < reps; ++rep) {
            for (long i = 0; i < limit; i++) {
                ret += i;
            }
        }
        return ret;
    }
}
