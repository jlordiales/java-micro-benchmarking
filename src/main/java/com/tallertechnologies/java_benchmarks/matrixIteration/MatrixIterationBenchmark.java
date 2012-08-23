package com.tallertechnologies.java_benchmarks.matrixIteration;

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;

public class MatrixIterationBenchmark extends SimpleBenchmark {
    @Param({ "20", "200", "2000" })
    int matrixSize;
    int[][] matrix;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        matrix = new int[matrixSize][matrixSize];
    }

    public int timeIterateCols(int reps) {
        int result = 0;
        for (int rep = 0; rep < reps; ++rep) {
            for (int i = 0; i < matrixSize; i++) {
                for (int j = 0; j < matrixSize; j++) {
                    result = matrix[j][i];
                }
            }
        }
        return result;
    }

    public int timeIterateRows(int reps) {
        int result = 0;
        for (int rep = 0; rep < reps; ++rep) {
            for (int i = 0; i < matrixSize; i++) {
                for (int j = 0; j < matrixSize; j++) {
                    result = matrix[i][j];
                }
            }
        }
        return result;
    }
}
