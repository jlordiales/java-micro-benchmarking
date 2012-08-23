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

package com.tallertechnologies.java_benchmarks.arrayIteration;

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;

/**
 * How do various ways of iterating through an array compare?
 */
public class ArrayIterationBenchmark extends SimpleBenchmark {
    @Param({ "2", "20", "2000", "200000" })
    int max;
    private Foo[] mArray;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mArray = new Foo[max];
        for (int i = 0; i < max; ++i) {
            mArray[i] = new Foo();
        }
    }

    public int timeArrayIteration(int reps) {
        int sum = 0;
        for (int rep = 0; rep < reps; ++rep) {
            sum = 0;
            for (int i = 0; i < max; i++) {
                sum += mArray[i].mSplat;
            }
        }
        return sum;
    }

    public int timeArrayIterationCached(int reps) {
        int sum = 0;
        for (int rep = 0; rep < reps; ++rep) {
            sum = 0;
            final Foo[] localArray = mArray;
            final int len = localArray.length;

            for (int i = 0; i < len; i++) {
                sum += localArray[i].mSplat;
            }
        }
        return sum;
    }

    public int timeArrayIterationForEach(int reps) {
        int sum = 0;
        for (int rep = 0; rep < reps; ++rep) {
            sum = 0;
            for (final Foo a : mArray) {
                sum += a.mSplat;
            }
        }
        return sum;
    }
}
