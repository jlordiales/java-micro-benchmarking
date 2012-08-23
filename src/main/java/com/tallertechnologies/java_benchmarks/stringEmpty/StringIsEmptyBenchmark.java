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

package com.tallertechnologies.java_benchmarks.stringEmpty;

import com.google.caliper.SimpleBenchmark;

public class StringIsEmptyBenchmark extends SimpleBenchmark {
    public void timeIsEmpty_NonEmpty(int reps) {
        boolean result = true;
        for (int i = 0; i < reps; ++i) {
            result &= !(String.valueOf(i).isEmpty());
        }
        if (!result) {
            throw new RuntimeException();
        }
    }

    public void timeLengthEqualsZero(int reps) {
        boolean result = true;
        for (int i = 0; i < reps; ++i) {
            result &= !(String.valueOf(i).length() == 0);
        }
        if (!result) {
            throw new RuntimeException();
        }
    }

    public void timeEqualsEmpty(int reps) {
        boolean result = true;
        for (int i = 0; i < reps; ++i) {
            result &= !(String.valueOf(i).equals(""));
        }
        if (!result) {
            throw new RuntimeException();
        }
    }
}
