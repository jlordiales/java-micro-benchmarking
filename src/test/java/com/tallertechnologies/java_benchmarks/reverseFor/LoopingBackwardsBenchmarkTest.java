package com.tallertechnologies.java_benchmarks.reverseFor;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class LoopingBackwardsBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return LoopingBackwardsBenchmark.class;
    }

}
