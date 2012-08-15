package com.tallertechnologies.java_benchmarks;

import com.google.caliper.Runner;
import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.stringConcatenation.StringConcatenationBenchmark;
import com.tallertechnologies.java_benchmarks.stringEmpty.StringIsEmptyBenchmark;

/**
 * Hello world!
 * 
 */
public class BenchmarkRunner {
	private static final Class<? extends SimpleBenchmark> BENCHMARK_CLASS = StringIsEmptyBenchmark.class;

	public static void main(String[] args) {
		new Runner().run("-Jvmtype=-client", "--warmupMillis", "6000", "--trials", "3",
				BENCHMARK_CLASS.getName());
	}
}
