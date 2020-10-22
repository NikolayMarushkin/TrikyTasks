package ru.ncedu.marushkin.matrix.impl;

import ru.ncedu.marushkin.matrix.IMatrixWorker;
import ru.ncedu.marushkin.matrix.exceptions.MatricesAreNotConsistentException;
import ru.ncedu.marushkin.matrix.exceptions.WrongDimensionsOfMatricesException;
import ru.ncedu.marushkin.matrix.exceptions.ZeroDimensionMatrixException;

public class MatrixWorkerImpl implements IMatrixWorker {
    @Override
    public void print(double[][] m) {
        for (double[] row: m ) {
            for (double elem: row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

    @Override
    public boolean haveSameDimension(double[][] m1, double[][] m2) throws ZeroDimensionMatrixException {
        if (m1.length == 0 || m2.length == 0) {
            throw new ZeroDimensionMatrixException();
        }
        return m1.length == m2.length && m1[0].length == m2[0].length;
    }

    @Override
    public double[][] add(double[][] m1, double[][] m2) throws ZeroDimensionMatrixException, WrongDimensionsOfMatricesException {
        if (!haveSameDimension(m1, m2)) {
            throw new WrongDimensionsOfMatricesException();
        }
        double[][] resultMatrix = new double[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                resultMatrix[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return resultMatrix;
    }

    @Override
    public double[][] subtract(double[][] m1, double[][] m2) throws ZeroDimensionMatrixException, WrongDimensionsOfMatricesException {
        if (!haveSameDimension(m1, m2)) {
            throw new WrongDimensionsOfMatricesException();
        }
        double[][] resultMatrix = new double[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                resultMatrix[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return resultMatrix;
    }

    @Override
    public double[][] multiply(double[][] m1, double[][] m2) throws ZeroDimensionMatrixException, MatricesAreNotConsistentException {
        // l = m1.length, m = m1[0].length = m2.length, n = m2[0].length
        if (m1.length == 0 || m2.length == 0) {
            throw new ZeroDimensionMatrixException();
        }
        if (m1[0].length != m2.length) {
            throw new MatricesAreNotConsistentException();
        }
        double[][] resultMatrix = new double[m1.length][m2[0].length];
        for (int r = 0; r < m1[0].length; r++) {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2[0].length; j++) {
                    resultMatrix[i][j] += m1[i][r] * m2[r][j];
                }
            }
        }
        return resultMatrix;
    }
}
