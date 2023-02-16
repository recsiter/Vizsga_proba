package vizsga_pelda.trippackage;

import java.time.LocalDate;

/**
 * @author G
 */
public class tripByPlane extends trip {

    private String airportFrom;
    private String airportTo;
    private planeClass flyingClass;

    public tripByPlane(String airportFrom, String airportTo,
            planeClass flyingClass, String toGo, String passangerName, int price,
            LocalDate tripDate, int numberOfNights) {
        super(toGo, passangerName, price, tripDate, numberOfNights);
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.flyingClass = flyingClass;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }

    public planeClass getFlyingClass() {
        return flyingClass;
    }

    public void setFlyingClass(planeClass flyingClass) {
        this.flyingClass = flyingClass;
    }

}
