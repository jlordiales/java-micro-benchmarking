package com.tallertechnologies.java_benchmarks.stringConcatenation;

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;

public class StringConcatenationBenchmark extends SimpleBenchmark {
    @Param({ "2", "20", "2000", "5000" })
    int size;

    public String timeConcatenation(int reps) {
        String ret = "";
        for (int rep = 0; rep < reps; ++rep) {
            ret = "";
            for (long i = 0; i < size; i++) {
                ret = ret + "a";
            }
        }
        return ret;
    }

    public String timeStringBuilder(int reps) {
        StringBuilder builder = null;
        for (int rep = 0; rep < reps; ++rep) {
            builder = new StringBuilder(size);
            for (long i = 0; i < size; i++) {
                builder.append("a");
            }
        }
        return builder.toString();
    }
}
