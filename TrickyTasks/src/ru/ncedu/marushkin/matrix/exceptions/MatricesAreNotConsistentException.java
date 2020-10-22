package ru.ncedu.marushkin.matrix.exceptions;

public class MatricesAreNotConsistentException extends Exception {
    public MatricesAreNotConsistentException() {
        super("Matrices are not consistent. Please check data.");
    }
}
