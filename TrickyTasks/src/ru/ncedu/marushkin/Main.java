package ru.ncedu.marushkin;

import ru.ncedu.marushkin.date.Impl.DateWorkerImpl;
import ru.ncedu.marushkin.date.exceptions.DateIsNotValidException;

public class Main {
    public static void main(String[] args) throws DateIsNotValidException {
        DateWorkerImpl dateWorker = new DateWorkerImpl();
//        System.out.println(dateWorker.isLeapYear(1));
//        System.out.println(dateWorker.isLeapYear(1999));
//        System.out.println(dateWorker.isLeapYear(1996));
//        System.out.println(dateWorker.isLeapYear(2000));
//        System.out.println(dateWorker.isLeapYear(2100));
//        System.out.println(dateWorker.isLeapYear(2099));

//        System.out.println("1 " + dateWorker.isValidDate(0, 1, 1));
//        System.out.println("2 " + dateWorker.isValidDate(1, 0, 1));
//        System.out.println("3 " + dateWorker.isValidDate(1, 13, 1));
//        System.out.println("4 " + dateWorker.isValidDate(1, 12, 1));
//        System.out.println("5 " + dateWorker.isValidDate(1999, 2, 29));
//        System.out.println("6 " + dateWorker.isValidDate(2000, 2, 29));
//        System.out.println("7 " + dateWorker.isValidDate(2019, 4, 30));
//        System.out.println("8 " + dateWorker.isValidDate(2019, 4, 31));
//        System.out.println("9 " + dateWorker.isValidDate(32, 8, 0));
//        System.out.println("10 " + dateWorker.isValidDate(32, 8, 32));
//        System.out.println("11 " + dateWorker.isValidDate(2100, 2, 29));
//        System.out.println("12 " + dateWorker.isValidDate(2100, 2, 28));

//        System.out.println(dateWorker.getDayOfWeek(2020, 10,19));
//        System.out.println(dateWorker.getDayOfWeek(1995, 5,24));
//        System.out.println(dateWorker.getDayOfWeek(1894, 12,1));
//
//        System.out.println(dateWorker.toString(2020, 10,19));
//        System.out.println(dateWorker.toString(1995, 5,24));
//        System.out.println(dateWorker.toString(1894, 12,1));

        System.out.println(dateWorker.countDays(2252, 7,4));
        System.out.println(dateWorker.countDays(2125, 2,28));
        System.out.println(dateWorker.countDays(2020, 10,19));
        System.out.println(dateWorker.countDays(1990, 5,24));
        System.out.println(dateWorker.countDays(1990, 11,2));
        System.out.println(dateWorker.countDays(1990, 3,17));
        System.out.println(dateWorker.countDays(1990, 12,1));
    }
}
