package com.tallertechnologies.java_benchmarks.arrayListIteration;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class ArrayListIterationBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return ArrayListIterationBenchmark.class;
    }

}
