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

package com.tallertechnologies.java_benchmarks.arrayCopy;

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;

public class ArrayCopyBenchmark extends SimpleBenchmark {
    @Param({ "20", "200", "2000", "20000" })
    int arraySize;
    char[] src;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        src = new char[arraySize];
    }

    public void timeManualArrayCopy(int reps) {
        for (int rep = 0; rep < reps; ++rep) {
            final char[] dst = new char[arraySize];
            for (int i = 0; i < arraySize; ++i) {
                dst[i] = src[i];
            }
        }
    }

    public void timeSystemArrayCopy(int reps) {
        for (int rep = 0; rep < reps; ++rep) {
            final char[] dst = new char[arraySize];
            System.arraycopy(src, 0, dst, 0, arraySize);
        }
    }
}
