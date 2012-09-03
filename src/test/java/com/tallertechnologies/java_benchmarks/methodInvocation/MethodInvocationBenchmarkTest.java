package com.tallertechnologies.java_benchmarks.methodInvocation;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class MethodInvocationBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return MethodInvocationBenchmark.class;
    }

}
