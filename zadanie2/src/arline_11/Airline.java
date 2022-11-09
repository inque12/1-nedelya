package arline_11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {
    private String destination;
    private String flightNumber;
    private String planeType;
    private Date departureTime;
    private DayOfWeek [] dayOfWeek;

    static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

    Airline(String destination, String flightNumber, String planeType, Date departureTime, DayOfWeek [] dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (DayOfWeek day : dayOfWeek) {
            strBuilder.append(day);
            strBuilder.append(", ");
        }
        return String.format("Пункт назначения: %s, рейс #: %s, тип самолета: %s, вылет: %s, день недели: %s\b\b.",
                destination, flightNumber, planeType, ft.format(departureTime), strBuilder.toString());
    }

    String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    DayOfWeek[] getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek[] dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}