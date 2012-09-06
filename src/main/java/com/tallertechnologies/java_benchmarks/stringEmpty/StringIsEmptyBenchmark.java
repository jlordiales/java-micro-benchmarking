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

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;

public class StringIsEmptyBenchmark extends SimpleBenchmark {
    @Param
    Method method;
    
    public enum Method {
        IS_EMPTY {
            @Override
            boolean empty(String s) {
                return s.isEmpty();
            }
        },LENGTH_ZERO {
            @Override
            boolean empty(String s) {
                return s.length() == 0;
            }
        },EQUALS_EMPTY {
            @Override
            boolean empty(String s) {
                return "".equals(s);
            }
        };        
        abstract boolean empty(String s);
    }
    
    public void timeEmpty(int reps) {
        boolean result = true;
        for (int i = 0; i < reps; ++i) {
            result &= !(method.empty(String.valueOf(i)));
        }
        if (!result) {
            throw new RuntimeException();
        }
    }
}
