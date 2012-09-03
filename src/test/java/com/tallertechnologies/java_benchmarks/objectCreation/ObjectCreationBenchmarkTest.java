package com.tallertechnologies.java_benchmarks.objectCreation;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class ObjectCreationBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return ObjectCreationBenchmark.class;
    }

}
