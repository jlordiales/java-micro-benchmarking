package com.tallertechnologies.java_benchmarks.hashedCollections;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class HashedCollectionsBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return HashedCollectionsBenchmark.class;
    }

}
