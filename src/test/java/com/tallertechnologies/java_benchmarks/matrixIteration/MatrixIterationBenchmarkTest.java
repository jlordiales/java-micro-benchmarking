package com.tallertechnologies.java_benchmarks.matrixIteration;

import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.CaliperBenchmarkTest;

public class MatrixIterationBenchmarkTest extends CaliperBenchmarkTest {

    @Override
    protected Class<? extends SimpleBenchmark> getBenchmarkClass() {
        return MatrixIterationBenchmark.class;
    }

}
