package zadanie4;

import zadanie4.entity.Calendar;

/**
 * 3. Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных
 * и праздничных днях.
 */
public class CalendarRunner {

    public static void main(String[] args) {

        Calendar calendar = new Calendar(2019);

        calendar.addHoliday(2022, 10, 1);
        calendar.addHoliday(2021, 1, 12);

        calendar.getAllHolidays();

        calendar.printHolidays();
    }
}