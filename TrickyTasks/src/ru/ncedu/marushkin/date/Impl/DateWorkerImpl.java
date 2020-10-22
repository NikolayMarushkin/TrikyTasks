package ru.ncedu.marushkin.date.Impl;

import ru.ncedu.marushkin.date.DateWorker;
import ru.ncedu.marushkin.date.exceptions.DateIsNotValidException;

public class DateWorkerImpl implements DateWorker {
    @Override
    public boolean isLeapYear(int year) {
        boolean result = false;
        if (year % 4 == 0) {
            result = true;
        }
        if (year % 100 == 0 && year % 400 != 0) {
            result = false;
        }
        return result;
    }

    @Override
    public boolean isValidDate(int year, int month, int day) {
        if (year < 0) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > 31) {
            return false;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                if (day > 29) {
                    return false;
                }
            }
            else {
                if (day > 28) {
                    return false;
                }
            }
        }
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day > 31) {
                return false;
            }
        }
        else {
            if (day > 30) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int getDayOfWeek(int year, int month, int day) throws DateIsNotValidException {
        int dayOfWeek = 0;
        if (isValidDate(year, month, day)) {
            if (month < 3) {
                --year;
                month += 10;
            }
            else {
                month -= 2;
            }
            dayOfWeek = ((day + 31 * month / 12 + year + year / 4 - year / 100 + year / 400) % 7);
        }
        else {
            throw new DateIsNotValidException();
        }
        return (dayOfWeek + 6) % 7;
    }

    @Override
    public String toString(int year, int month, int day) throws DateIsNotValidException {
        String dayOfWeek = "";
        switch (getDayOfWeek(year, month, day)) {
            case 0:
                dayOfWeek = "Monday ";
                break;
            case 1:
                dayOfWeek = "Tuesday ";
                break;
            case 2:
                dayOfWeek = "Wednesday ";
                break;
            case 3:
                dayOfWeek = "Thursday ";
                break;
            case 4:
                dayOfWeek = "Friday ";
                break;
            case 5:
                dayOfWeek = "Saturday ";
                break;
            case 6:
                dayOfWeek = "Sunday ";
                break;
        }

        String nameDayOfWeek = "";
        switch (month) {
            case 1:
                nameDayOfWeek = " Jan ";
                break;
            case 2:
                nameDayOfWeek = " Feb ";
                break;
            case 3:
                nameDayOfWeek = " Mar ";
                break;
            case 4:
                nameDayOfWeek = " Apr ";
                break;
            case 5:
                nameDayOfWeek = " May ";
                break;
            case 6:
                nameDayOfWeek = " June ";
                break;
            case 7:
                nameDayOfWeek = " July ";
                break;
            case 8:
                nameDayOfWeek = " Aug ";
                break;
            case 9:
                nameDayOfWeek = " Sept ";
                break;
            case 10:
                nameDayOfWeek = " Oct ";
                break;
            case 11:
                nameDayOfWeek = " Nov ";
                break;
            case 12:
                nameDayOfWeek = " Dec ";
                break;
        }
        return dayOfWeek + day + nameDayOfWeek + year;
    }

    @Override
    public int countDays(int year, int month, int day) throws DateIsNotValidException {
        int result = 0;
        if (isValidDate(year, month, day)){
            int curYear = (int)(System.currentTimeMillis() / (1000L * 60 * 60 * 24 * 365) + 1970);
            int curDay = (int)(System.currentTimeMillis() / (1000L * 60 * 60 * 24));

            for (int i = 1970; i < curYear; i++) {
                if (isLeapYear(i)) {
                    curDay -= 366;
                }
                else {
                    curDay -= 365;
                }
            }

            int minYear = Math.min(curYear, year);
            for (int i = 0; i < Math.abs(year - curYear); i++) {
                if (isLeapYear(minYear + i)) {
                    result += 366;
                }
                else {
                    result += 365;
                }
            }

            int countDaysFromInputDate = 0;
            for (int i = 1; i < month; i++) {
                switch (i) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        countDaysFromInputDate += 31;
                        break;
                    case 2:
                        if (isLeapYear(year)) {
                            countDaysFromInputDate += 29;
                        }
                        else {
                            countDaysFromInputDate += 28;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        countDaysFromInputDate += 30;
                        break;
                }
            }
            countDaysFromInputDate += (day - 1);
            if (curYear > year) {
                result = -(result + curDay - countDaysFromInputDate);
            } else {
                result -= Math.abs(countDaysFromInputDate - curDay);
            }
        }
        else {
            throw new DateIsNotValidException();
        }
        return result;
    }
}
