package persistance;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vizsga_pelda.trippackage.planeClass;
import vizsga_pelda.trippackage.trip;
import vizsga_pelda.trippackage.tripByPlane;

/**
 * @author G
 */
public class PlaneTripController implements Controller {

    private String PATH = "C:\\Users\\csomo\\Documents\\NetBeansProjects\\"
            + "VizsgaPelda\\MVizsga0826\\Vizsga_Pelda\\src\\persistance\\planeTrips";

    @Override

    public void insert(trip trip) {

        try {
            List<List<String>> readIn = FileHandler.readIn(PATH);
            List<String> row = createRowFromTrip(trip);
            readIn.add(row);
            FileHandler.writeOut(readIn);
        } catch (IOException ex) {
            Logger.getLogger(PlaneTripController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(trip trip) {
        try {
            List<List<String>> readIn = FileHandler.readIn(PATH);
            List<tripByPlane> planeList = makeTripsFromStringList(readIn);
            deleteTripFromList(planeList, trip);
            List<List<String>> writeable = tripListToStringList(planeList);

        } catch (IOException ex) {
            Logger.getLogger(PlaneTripController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(trip trip) {

    }

    private List<String> createRowFromTrip(trip trip) {
        List<String> result = new ArrayList<>();
        if (trip instanceof tripByPlane planeTrip) {
            result.add(planeTrip.getAirportFrom());
            result.add(planeTrip.getAirportTo());
            result.add(String.valueOf(planeTrip.getFlyingClass()));
            result.add(planeTrip.getToGo());
            result.add(planeTrip.getPassangerName());
            result.add(String.valueOf(planeTrip.getPrice()));
            result.add(String.valueOf(planeTrip.getTripDate()));

        }
        return result;

    }

    private List<tripByPlane> makeTripsFromStringList(List<List<String>> readIn) {
        List<tripByPlane> planeTrips = new ArrayList<>();
        for (int i = 0; i < readIn.size(); i++) {
            tripByPlane onetrip = createOnePlaneTrip(readIn.get(i));
            planeTrips.add(onetrip);

        }
        return planeTrips;
    }

    private tripByPlane createOnePlaneTrip(List<String> list) {
        String airport = list.get(0);
        String airportTo = list.get(1);
        planeClass planeClass1;
        planeClass1 = planeClass.valueOf(list.get(2));
        String toGo = list.get(3);
        String passangername = list.get(4);
        int price = Integer.parseInt(list.get(5));
        LocalDate date = LocalDate.parse(list.get(6));
        int numberOfNight = Integer.parseInt(list.get(7));

        tripByPlane result = new tripByPlane(airport, airportTo, planeClass1,
                toGo, passangername, price, date, numberOfNight);
        return result;
    }

    private void deleteTripFromList(List<tripByPlane> planeList, trip trip) {
        for (int i = 0; i < planeList.size();) {
            if (trip instanceof tripByPlane planeTrip && planeTrip.equals(i)) {
                planeList.remove(i);
            } else {
                i++;
            }

        }
    }

    private List<List<String>> tripListToStringList(List<tripByPlane> planeList) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < planeList.size(); i++) {
            result.add(createRowFromTrip(planeList.get(i)));

        }
        return result;
    }

}
