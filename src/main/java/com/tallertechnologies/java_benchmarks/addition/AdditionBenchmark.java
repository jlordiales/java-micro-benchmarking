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

package com.tallertechnologies.java_benchmarks.addition;

import com.google.caliper.SimpleBenchmark;

/**
 * What do various kinds of addition cost?
 * The loop index is summed on each iteration to prevent
 * the compiler from optimizing the code away
 */
public class AdditionBenchmark extends SimpleBenchmark {
    public int timeAddConstantToLocalInt(int reps) {
        int result = 0;
        for (int i = 0; i < reps; ++i) {
            result += i + 123;
        }
        return result;
    }

    public int timeAddTwoLocalInts(int reps) {
        int result = 0;
        final int constant = 123;
        for (int i = 0; i < reps; ++i) {
            result += i + constant;
        }
        return result;
    }

    public long timeAddConstantToLocalLong(int reps) {
        long result = 0;
        for (int i = 0; i < reps; ++i) {
            result += 123L + i;
        }
        return result;
    }

    public long timeAddTwoLocalLongs(int reps) {
        long result = 0;
        final long constant = 123L;
        for (int i = 0; i < reps; ++i) {
            result += constant + i;
        }
        return result;
    }

    public float timeAddConstantToLocalFloat(int reps) {
        float result = 0.0f;
        for (int i = 0; i < reps; ++i) {
            result += 123.0f + i;
        }
        return result;
    }

    public float timeAddTwoLocalFloats(int reps) {
        float result = 0.0f;
        final float constant = 123.0f;
        for (int i = 0; i < reps; ++i) {
            result += constant + i;
        }
        return result;
    }

    public double timeAddConstantToLocalDouble(int reps) {
        double result = 0.0;
        for (int i = 0; i < reps; ++i) {
            result += 123.0 + i;
        }
        return result;
    }

    public double timeAddTwoLocalDoubles(int reps) {
        double result = 0.0;
        final double constant = 123.0;
        for (int i = 0; i < reps; ++i) {
            result += constant + i;
        }
        return result;
    }
}
