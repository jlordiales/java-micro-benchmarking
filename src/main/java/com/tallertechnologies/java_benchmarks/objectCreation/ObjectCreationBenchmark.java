package com.tallertechnologies.java_benchmarks.objectCreation;

import java.util.ArrayList;
import java.util.List;

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;

public class ObjectCreationBenchmark extends SimpleBenchmark {
	@Param({ "2", "20", "2000", "20000" })
	int listSize;
	private List<String> list;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		list = new ArrayList<String>();
		for (int i = 0; i < listSize; i++) {
			list.add("benchmark");
		}
	}

	public void timeCreateList(int reps) {
		for (int rep = 0; rep < reps; ++rep) {
			list = new ArrayList<String>();
			list.add("create list");
		}
	}

	public void timeReuseList(int reps) {
		for (int rep = 0; rep < reps; ++rep) {
			list.clear();
			list.add("create list");
		}
	}
}
