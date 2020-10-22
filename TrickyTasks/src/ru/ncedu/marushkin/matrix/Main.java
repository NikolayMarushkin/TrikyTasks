package ru.ncedu.marushkin.matrix;

import ru.ncedu.marushkin.matrix.exceptions.MatricesAreNotConsistentException;
import ru.ncedu.marushkin.matrix.exceptions.NotSquareMatrixException;
import ru.ncedu.marushkin.matrix.exceptions.WrongDimensionsOfMatricesException;
import ru.ncedu.marushkin.matrix.exceptions.ZeroDimensionMatrixException;
import ru.ncedu.marushkin.matrix.impl.MatrixWorkerImpl;
import ru.ncedu.marushkin.matrix.kramer.MatrixDeterminantCalculator;
import ru.ncedu.marushkin.matrix.pojo.Matrix;

public class Main {
    public static void main(String[] args) throws ZeroDimensionMatrixException, WrongDimensionsOfMatricesException, MatricesAreNotConsistentException, NotSquareMatrixException {
        double[][] a = {{1}} ;
//        double[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 3}} ;
//        System.out.println(a.length);
        MatrixWorkerImpl matrixWorkerImplm = new MatrixWorkerImpl();
//        System.out.println(matrixWorkerImplm.haveSameDimension(a, a));
//        System.out.println(matrixWorkerImplm.haveSameDimension(a, b));
//        matrixWorkerImplm.print(matrixWorkerImplm.add(a, a));
//        matrixWorkerImplm.print(matrixWorkerImplm.subtract(a, a));
//        matrixWorkerImplm.print(matrixWorkerImplm.multiply(a, b));



//        double[][] m1 = {{0.4, 0.5}, {6.5, 5.5}};
//        Matrix matrix1 = new Matrix(m1);
//        System.out.println(matrix1.getRow());
//        System.out.println(matrix1.getColumn());
//
//        double[][] m2 = {{0.4, 0.5}, {6.5, 5.5}};
//        Matrix matrix2 = new Matrix(m2);
//        System.out.println(matrix1.equals(matrix2));
//
//        double[][] m3 = {{0.4, 0.5}, {6.5, 5.501}};
//        Matrix matrix3 = new Matrix(m3);
//        System.out.println(matrix1.equals(matrix3));


        double m = MatrixDeterminantCalculator.process(a);
        matrixWorkerImplm.print(a);
        System.out.println(m);


    }
}
