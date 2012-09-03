package com.tallertechnologies.java_benchmarks.arrayCopy;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class ArrayCopyBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return ArrayCopyBenchmark.class;
    }

}
