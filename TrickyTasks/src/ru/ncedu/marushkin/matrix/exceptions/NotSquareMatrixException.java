package ru.ncedu.marushkin.matrix.exceptions;

public class NotSquareMatrixException extends Exception {
    public NotSquareMatrixException(){
        super("Not square matrix. Please check data.");
    }
}
