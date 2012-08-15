/*
 * Copyright (C) 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tallertechnologies.java_benchmarks.hashedCollections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

import com.google.caliper.SimpleBenchmark;

/**
 * How do the various hash maps compare?
 */
public class HashedCollectionsBenchmark extends SimpleBenchmark {

	private HashMap<String, String> map;
	private Hashtable<String, String> mapTable;
	private LinkedHashMap<String, String> mapLinked;
	private ConcurrentHashMap<String, String> mapConcurrent;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		map = new HashMap<String, String>();
		mapTable = new Hashtable<String, String>();
		mapLinked = new LinkedHashMap<String, String>();
		mapConcurrent = new ConcurrentHashMap<String, String>();

		map.put("hello", "world");
		mapTable.put("hello", "world");
		mapLinked.put("hello", "world");
		mapConcurrent.put("hello", "world");
	}

	public void timeHashMapGet(int reps) {
		for (int i = 0; i < reps; ++i) {
			map.get("hello");
		}
	}

	public void timeHashMapGet_Synchronized(int reps) {
		for (int i = 0; i < reps; ++i) {
			synchronized (map) {
				map.get("hello");
			}
		}
	}

	public void timeHashtableGet(int reps) {
		for (int i = 0; i < reps; ++i) {
			mapTable.get("hello");
		}
	}

	public void timeLinkedHashMapGet(int reps) {
		for (int i = 0; i < reps; ++i) {
			mapLinked.get("hello");
		}
	}

	public void timeConcurrentHashMapGet(int reps) {
		for (int i = 0; i < reps; ++i) {
			mapConcurrent.get("hello");
		}
	}
}
