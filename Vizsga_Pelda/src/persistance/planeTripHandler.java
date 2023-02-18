package persistance;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vizsga_pelda.trippackage.trip;
import vizsga_pelda.trippackage.tripByPlane;

/**
 * @author G
 */
public class planeTripHandler {

    public static List<tripByPlane> getTripByPlanes() {
        List<tripByPlane> result = new ArrayList<>();
        PlaneTripController plContr = new PlaneTripController();
        try {
            result = plContr.makeTripsFromStringList(
                    FileHandler.readIn(FileHandler.PATH));
        } catch (IOException ex) {
            Logger.getLogger(planeTripHandler.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

}
