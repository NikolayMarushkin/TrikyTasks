package ru.ncedu.marushkin.matrix;

import ru.ncedu.marushkin.matrix.exceptions.MatricesAreNotConsistentException;
import ru.ncedu.marushkin.matrix.exceptions.WrongDimensionsOfMatricesException;
import ru.ncedu.marushkin.matrix.exceptions.ZeroDimensionMatrixException;

public interface IMatrixWorker {
   public void print(double[][] m);
   public boolean haveSameDimension(double[][] m1, double[][] m2) throws ZeroDimensionMatrixException;
   public double[][] add(double[][] m1, double[][] m2) throws ZeroDimensionMatrixException, WrongDimensionsOfMatricesException;
   public double[][] subtract(double[][] m1, double[][] m2) throws ZeroDimensionMatrixException, WrongDimensionsOfMatricesException;
   public double[][] multiply(double[][] m1, double[][] m2) throws ZeroDimensionMatrixException, MatricesAreNotConsistentException;
}
