package com.tallertechnologies.java_benchmarks.listAsQueue;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class ListAsQueueBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return ListAsQueueBenchmark.class;
    }

}
