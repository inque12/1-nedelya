package arline_11;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        FlightSchedule flightSchedule = new FlightSchedule("Minsk (MSQ)", new ArrayList<>());
        flightSchedule.addAirline("Берлин (SXF)", "B2 891", "Embraer RJ-175",
                Airline.ft.parse("12:15"), new DayOfWeek[]{DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});
        flightSchedule.addAirline("Москва (ZIA)", "B2 971", "Boeing 737-500",
                Airline.ft.parse("8:15"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Москва (ZIA)", "B2 973", "Boeing 737-300",
                Airline.ft.parse("18:05"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Москва (DME)", "B2 993", "Boeing 737-500",
                Airline.ft.parse("19:45"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.TUESDAY,
                        DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY});
        flightSchedule.addAirline("Москва (SVO)", "SU 1833", "Sukhoi Superjet 100-95",
                Airline.ft.parse("20:30"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Москва (VKO)", "UT 776", "Boeing 737-500",
                Airline.ft.parse("17:55"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Брюссель (CRL)", "B2 817", "Embraer 175",
                Airline.ft.parse("8:40"), new DayOfWeek[]{DayOfWeek.WEDNESDAY});
        flightSchedule.addAirline("Брюссель (CRL)", "B2 817", "Embraer 175",
                Airline.ft.parse("9:35"), new DayOfWeek[]{DayOfWeek.THURSDAY, DayOfWeek.SATURDAY});
        flightSchedule.addAirline("Брюссель (CRL)", "B2 817", "Embraer 175",
                Airline.ft.parse("13:00"), new DayOfWeek[]{DayOfWeek.MONDAY});
        flightSchedule.addAirline("Париж (CDG)", "B2 863", "Embraer 195",
                Airline.ft.parse("14:50"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});


        System.out.println("Список рейсов с пунктом назначения Брюссель (CRL):");
        ArrayList<Airline> airlinesToBrussels = flightSchedule.airlinesToDestination("Брюссель (CRL)");
        for (Airline airline : airlinesToBrussels) {
            System.out.println(airline);
        }

        System.out.println("\nСписок рейсов, вылетающих в воскресенье:");
        ArrayList<Airline> airlinesOnSunday = flightSchedule.flightDays(DayOfWeek.SUNDAY);
        for (Airline airline : airlinesOnSunday) {
            System.out.println(airline);
        }

        System.out.println("\nСписок рейсов, вылетающих после 13:00 вторника:");
        Date time = Airline.ft.parse("13:00");
        ArrayList<Airline> airlinesOnTuesday = flightSchedule.flightDays(DayOfWeek.MONDAY, time);
        for (Airline airline : airlinesOnTuesday) {
            System.out.println(airline);
        }
    }
}