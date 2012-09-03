package com.tallertechnologies.java_benchmarks.interfaceConcrete;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class VirtualVersusInterfaceBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return VirtualVersusInterfaceBenchmark.class;
    }

}
