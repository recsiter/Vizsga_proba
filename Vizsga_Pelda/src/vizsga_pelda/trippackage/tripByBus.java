package vizsga_pelda.trippackage;

import java.time.LocalDate;

/**
 * @author G
 */
public class tripByBus extends trip {

    private String meetLocation;
    private boolean isToilet;

    public tripByBus(String meetLocation, boolean isToilet, String toGo,
            String passangerName, int price, LocalDate tripDate,
            int numberOfNights) {
        super(toGo, passangerName, price, tripDate, numberOfNights);
        this.meetLocation = meetLocation;
        this.isToilet = isToilet;
    }

}
