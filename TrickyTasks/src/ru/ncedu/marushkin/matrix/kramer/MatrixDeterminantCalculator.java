package ru.ncedu.marushkin.matrix.kramer;

import ru.ncedu.marushkin.matrix.exceptions.NotSquareMatrixException;
import ru.ncedu.marushkin.matrix.exceptions.ZeroDimensionMatrixException;
import ru.ncedu.marushkin.matrix.impl.MatrixWorkerImpl;

public class MatrixDeterminantCalculator extends MatrixWorkerImpl {
    public static double process(double[][] matrix) throws ZeroDimensionMatrixException, NotSquareMatrixException {
        double determinant = 0;
        if ( matrix.length == 0) {
            throw new ZeroDimensionMatrixException();
        }
        if (matrix.length != matrix[0].length) {
            throw new NotSquareMatrixException();
        }
        switch (matrix.length) {
            case 1:
                determinant = matrix[0][0];
                break;
            case 2:
                determinant += matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
                break;
            default:
                for (int d = 0; d < matrix.length; d++) {
                    determinant += matrix[0][d] * Math.pow(-1, d) * process(copyPartMatrix(matrix, d));
                }
        }
        return determinant;
    }

    private static double[][] copyPartMatrix (double[][] matrix, int d) {
        double[][] calcMatrix = new double[matrix.length - 1][matrix.length - 1];
        for (int i = 1; i < matrix.length; i++) {
            int k = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (j != d) {
                    calcMatrix[i - 1][k] = matrix[i][j];
                    k++;
                }
            }
        }
        return calcMatrix;
    }
}
