package vizsga_pelda;

import java.time.LocalDate;
import persistance.PlaneTripController;
import vizsga_pelda.trippackage.planeClass;
import vizsga_pelda.trippackage.tripByPlane;

/**
 * @author --G--
 */
public class Vizsga_Pelda {

    public static void main(String[] args) {
        PlaneTripController ctrl = new PlaneTripController();
        tripByPlane trip;
        trip = new tripByPlane("Prága", "Malaga",
                planeClass.BUSSINES, "Malaga", "Juan Carlito", 567, LocalDate.
                        of(
                                2023, 07, 13), 4);
//        ctrl.insert(trip);
        ctrl.update(trip);
    }

}
