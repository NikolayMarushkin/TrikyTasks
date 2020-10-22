package ru.ncedu.marushkin.matrix.exceptions;

public class WrongDimensionsOfMatricesException extends Exception {
    public WrongDimensionsOfMatricesException() {
        super("Wrong dimensions of matrices. Please check data.");
    }
}
