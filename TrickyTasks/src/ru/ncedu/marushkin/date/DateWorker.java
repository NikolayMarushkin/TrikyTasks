package ru.ncedu.marushkin.date;

import ru.ncedu.marushkin.date.exceptions.DateIsNotValidException;

public interface DateWorker {
    boolean isLeapYear(int year); //Определяет високосный год или нет.
    boolean isValidDate(int year, int month, int day); //Осуществляет проверку даты на корректность.
    int getDayOfWeek(int year, int month, int day) throws DateIsNotValidException; //Возвращает номер дня недели, где 0 – MON, 6- SUN (Можно сделать enum – ом )
    String toString(int year, int month, int day) throws DateIsNotValidException; //Форматирует дату в красивом виде. Например Tuesday 14 Feb 2012
    int countDays(int year, int month, int day) throws DateIsNotValidException; //Вычисляет сколько дней прошло с данной даты по сегодняшнюю

}
