package com.tallertechnologies.java_benchmarks.fieldAccess;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class FieldAccessBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return FieldAccessBenchmark.class;
    }

}
