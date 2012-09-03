package com.tallertechnologies.java_benchmarks.stringEmpty;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class StringIsEmptyBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return StringIsEmptyBenchmark.class;
    }

}
