package persistance;

import vizsga_pelda.trippackage.trip;

/**
 *
 * @author --G--
 */
public interface Controller {

    void insert(trip trip);

    void delete(trip trip);

    void update(trip trip);
}
