package ru.ncedu.marushkin.date.exceptions;

public class DateIsNotValidException extends Exception {
    public DateIsNotValidException(){
        super("Date is not valid exception. Check data please.");
    }
}
