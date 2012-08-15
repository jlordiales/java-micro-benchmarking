package com.tallertechnologies.java_benchmarks.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;

public class ListWriteBenchmark extends SimpleBenchmark {
	@Param({ "2", "20", "2000", "10000" })
	int size;
	private ArrayList<String> arrayList = null;
	private LinkedList<String> linkedList = null;
	private Vector<String> vector = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		arrayList = new ArrayList<String>();
		linkedList = new LinkedList<String>();
		vector = new Vector<String>();
		for (int i = 0; i < size; i++) {
			arrayList.add("A");
			linkedList.add("A");
			vector.add("A");
		}
	}

	public void timeWriteFirstArray(int reps) {
		for (int i = 0; i < reps; i++) {
			arrayList.add(0, "B");
			arrayList.remove(0);
		}
	}

	public void timeWriteFirstLinked(int reps) {
		for (int i = 0; i < reps; i++) {
			linkedList.add(0, "B");
			linkedList.remove(0);
		}
	}

	public void timeWriteFirstVector(int reps) {
		for (int i = 0; i < reps; i++) {
			vector.add(0, "B");
			vector.remove(0);
		}
	}

	public void timeWriteLastArray(int reps) {
		for (int i = 0; i < reps; i++) {
			arrayList.add("B");
			arrayList.remove(size);
		}
	}

	public void timeWriteLastLinked(int reps) {
		for (int i = 0; i < reps; i++) {
			linkedList.add("B");
			linkedList.remove(size);
		}
	}

	public void timeWriteLastVector(int reps) {
		for (int i = 0; i < reps; i++) {
			vector.add("B");
			vector.remove(size);
		}
	}

	public void timeWriteMiddleArray(int reps) {
		for (int i = 0; i < reps; i++) {
			arrayList.add(size / 2, "B");
			arrayList.remove(size / 2);
		}
	}

	public void timeWriteMiddleLinked(int reps) {
		for (int i = 0; i < reps; i++) {
			linkedList.add(size / 2, "B");
			linkedList.remove(size / 2);
		}
	}

	public void timeWriteMiddleVector(int reps) {
		for (int i = 0; i < reps; i++) {
			vector.add(size / 2, "B");
			vector.remove(size / 2);
		}
	}

}
