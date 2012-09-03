package com.tallertechnologies.java_benchmarks.primitives;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class PrimitivesBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return PrimitivesBenchmark.class;
    }

}
