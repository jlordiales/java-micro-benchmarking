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

package com.tallertechnologies.java_benchmarks.fieldAccess;

import com.google.caliper.SimpleBenchmark;

/**
 * What does field access cost?
 */
public class FieldAccessBenchmark extends SimpleBenchmark {

    private static class Inner {
        public int publicInnerIntVal=15;
        protected int protectedInnerIntVal=15;
        private int privateInnerIntVal=15;
        int packageInnerIntVal=15;
    }

    int intVal = 15;
    final int finalIntVal = 15;
    static int staticIntVal = 15;
    static final int staticFinalIntVal = 15;

    public int timeField(int reps) {
        int result = 0;
        for (int rep = 0; rep < reps; ++rep) {
            result += intVal + rep;
        }
        return result;
    }

    public int timeFieldFinal(int reps) {
        int result = 0;
        for (int rep = 0; rep < reps; ++rep) {
            result += finalIntVal + rep;
        }
        return result;
    }

    public int timeFieldStatic(int reps) {
        int result = 0;
        for (int rep = 0; rep < reps; ++rep) {
            result += staticIntVal + rep;
        }
        return result;
    }

    public int timeFieldStaticFinal(int reps) {
        int result = 0;
        for (int rep = 0; rep < reps; ++rep) {
            result += staticFinalIntVal + rep;
        }
        return result;
    }

    public int timeFieldCached(int reps) {
        int result = 0;
        final int cachedIntVal = this.intVal;
        for (int rep = 0; rep < reps; ++rep) {
            result += cachedIntVal + rep;
        }
        return result;
    }

    public int timeFieldPrivateInnerClassPublicField(int reps) {
        int result = 0;
        final Inner inner = new Inner();
        for (int rep = 0; rep < reps; ++rep) {
            result += inner.publicInnerIntVal + rep;
        }
        return result;
    }

    public int timeFieldPrivateInnerClassProtectedField(int reps) {
        int result = 0;
        final Inner inner = new Inner();
        for (int rep = 0; rep < reps; ++rep) {
            result += inner.protectedInnerIntVal + rep;
        }
        return result;
    }

    public int timeFieldPrivateInnerClassPrivateField(int reps) {
        int result = 0;
        final Inner inner = new Inner();
        for (int rep = 0; rep < reps; ++rep) {
            result += inner.privateInnerIntVal + rep;
        }
        return result;
    }

    public int timeFieldPrivateInnerClassPackageField(int reps) {
        int result = 0;
        final Inner inner = new Inner();
        for (int rep = 0; rep < reps; ++rep) {
            result += inner.packageInnerIntVal + rep;
        }
        return result;
    }
}
