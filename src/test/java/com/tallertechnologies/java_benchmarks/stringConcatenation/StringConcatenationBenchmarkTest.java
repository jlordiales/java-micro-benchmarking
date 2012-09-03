package com.tallertechnologies.java_benchmarks.stringConcatenation;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class StringConcatenationBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return StringConcatenationBenchmark.class;
    }

}
