package ru.ncedu.marushkin.matrix.exceptions;

public class ZeroDimensionMatrixException extends Exception {
    public ZeroDimensionMatrixException() {
        super("Zero dimension of matrix. Please check your data.");
    }
}
