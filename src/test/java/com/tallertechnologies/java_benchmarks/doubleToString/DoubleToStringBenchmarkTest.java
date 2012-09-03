package com.tallertechnologies.java_benchmarks.doubleToString;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class DoubleToStringBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return DoubleToStringBenchmark.class;
    }

}
