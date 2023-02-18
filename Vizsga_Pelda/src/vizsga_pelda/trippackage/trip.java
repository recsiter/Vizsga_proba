package vizsga_pelda.trippackage;

import java.time.LocalDate;
import java.util.Date;
import javax.naming.spi.DirStateFactory;

/**
 * @author G
 */
public class trip implements Comparable<trip> {

    private String toGo;
    private String passangerName;
    private int price;
    private LocalDate tripDate;
    private int numberOfNights;

    protected trip(String toGo, String passangerName, int price,
            LocalDate tripDate,
            int numberOfNights) {
        this.toGo = toGo;
        this.passangerName = passangerName;
        this.price = price;
        this.tripDate = tripDate;
        this.numberOfNights = numberOfNights;
    }

    public trip() {
    }

//<editor-fold defaultstate="collapsed" desc="propertitts">
    public String getToGo() {
        return toGo;
    }

    public void setToGo(String toGo) {
        if (toGo.length() <= 0) {
            throw new IllegalArgumentException("Nem lehet üres!");
        }
        this.toGo = toGo;
    }

    public String getPassangerName() {
        return passangerName;
    }

    public void setPassangerName(String passangerName) {
        if (passangerName.length() <= 0) {
            throw new IllegalArgumentException("Nem lehet üres!");
        }
        this.passangerName = passangerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100 || price > 100000) {
            throw new IllegalArgumentException("min100 max 100000 eur");
        }
        this.price = price;
    }

    public LocalDate getTripDate() {

        return tripDate;
    }

    public void setTripDate(LocalDate tripDate) {
        if (tripDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException(
                    "Nem lehet korábbi a mai dátumnál");
        }
        this.tripDate = tripDate;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        if (numberOfNights <= 0) {
            throw new IllegalArgumentException("Legalább egy napra foglalhatsz");
        }
        this.numberOfNights = numberOfNights;
    }
//</editor-fold>

    public int lastMinute(int percentage) {
        int result = 0;
        if (percentage < 100 && percentage > 0) {
            result = ((100 - percentage) / 100) * price;

        }
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final trip other = (trip) obj;
        return this.price == other.price;
    }

    @Override
    public int compareTo(trip o) {
        return (int) (price - o.getPrice());

    }

}
