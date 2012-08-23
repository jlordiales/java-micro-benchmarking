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

package com.tallertechnologies.java_benchmarks.arrayListIteration;

import java.util.ArrayList;
import java.util.Iterator;

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;
import com.tallertechnologies.java_benchmarks.arrayIteration.Foo;

/**
 * Is a hand-coded counted loop through an ArrayList cheaper than enhanced for?
 */
public class ArrayListIterationBenchmark extends SimpleBenchmark {
    @Param({ "2", "20", "2000", "20000" })
    int max;
    ArrayList<Foo> mList = null;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mList = new ArrayList<Foo>();
        for (int i = 0; i < max; ++i) {
            mList.add(new Foo());
        }
    }

    public int timeArrayListIterationIndexed(int reps) {
        int sum = 0;
        for (int rep = 0; rep < reps; ++rep) {
            sum = 0;
            for (int i = 0; i < mList.size(); ++i) {
                sum += mList.get(i).mSplat;
            }
        }
        return sum;
    }

    public int timeArrayListIterationForEach(int reps) {
        int sum = 0;
        for (int rep = 0; rep < reps; ++rep) {
            sum = 0;
            for (final Foo a : mList) {
                sum += a.mSplat;
            }
        }
        return sum;
    }

    public int timeIterator(int reps) {
        int sum = 0;
        for (int rep = 0; rep < reps; ++rep) {
            for (final Iterator<Foo> it = mList.iterator(); it.hasNext();) {
                sum += it.next().mSplat;
            }
        }
        return sum;
    }
}
