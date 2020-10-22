package ru.ncedu.marushkin.matrix.pojo;

import java.util.Arrays;
import java.util.Objects;

/**
 * Class for work with rectangle matrices
 */
public class Matrix {
    private int row;
    private int column;
    private double[][] elements;

    public Matrix(double[][] elements) {
        setElements(elements);
        setRow(elements == null ? 0 : elements.length);
        setColumn(row == 0 ? 0 : elements[0].length);
    }

    public int getRow() {
        return row;
    }

    private void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    private void setColumn(int column) {
        this.column = column;
    }

    public double[][] getElements() {
        return elements;
    }

    private void setElements(double[][] elements) {
        this.elements = elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Matrix matrix = (Matrix) o;
        if (row != matrix.row || column != matrix.column) {
            return false;
        }
        for (int i = 0; i < elements.length; i++) {
            if (!Arrays.equals(elements[i], matrix.elements[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(row, column);
        result = 31 * result;
        for (int i = 0; i < elements.length; i++) {
            result += Arrays.hashCode(elements[i]);
        }
        return result;
    }
}
