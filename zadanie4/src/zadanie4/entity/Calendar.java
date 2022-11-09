package zadanie4.entity;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

    private int year;
    private List<Holiday> holidays;
    private LocalDate date;

    public Calendar(int year) {
        setYear(year);
        date = LocalDate.ofYearDay(getYear(), 1);
        holidays = new ArrayList<>();
    }

    public void setYear(int year) {
        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public int getYear() {
        return year;
    }

    public void getAllHolidays() {
        for (int i = 1; i < date.lengthOfYear(); i++) {
            date = LocalDate.ofYearDay(year, i);
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                addHoliday(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
            }
        }
    }

    private class Holiday {

        private LocalDate date;

        private Holiday(LocalDate date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Праздник{" + date.getDayOfMonth() + ", " + date.getMonth() + ", " + date.getYear() + '}';
        }
    }

    public boolean addHoliday(int year, int month, int dayOfMonth) {
        LocalDate date = LocalDate.of(year, month, dayOfMonth);
        Holiday holiday = new Holiday(date);
        return holidays.add(holiday);
    }

    public boolean removeHoliday(int year, int month, int dayOfMonth) {
        LocalDate date = LocalDate.of(year, month, dayOfMonth);
        Holiday holiday = new Holiday(date);
        return holidays.remove(holiday);
    }

    public void printHolidays() {
        if (holidays.isEmpty()) {
            System.out.println("У него нет праздников!");
            return;
        }

        for (Holiday holiday : holidays) {
            System.out.println(holiday);
        }
    }
}