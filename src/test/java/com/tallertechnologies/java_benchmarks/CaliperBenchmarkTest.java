package com.tallertechnologies.java_benchmarks;

import org.junit.Test;

import com.google.caliper.Runner;
import com.google.caliper.SimpleBenchmark;

/**
 * This simple test is just to make sure that each benchmark
 * runs without throwing any exception (for instance if the 
 * JIT is optmizing away the code) and to print the results
 * of the benchmark to the console.
 * @author "Jose Luis Ordiales Coscia <jlordiales@gmail.com>"
 *
 */
public abstract class CaliperBenchmarkTest {
    
    protected abstract Class<? extends SimpleBenchmark> getBenchmarkClass();

    @Test
    public void test() {
        new Runner().run(getBenchmarkClass().getName());
    }

}
