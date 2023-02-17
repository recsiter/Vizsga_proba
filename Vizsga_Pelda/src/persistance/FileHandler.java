package persistance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;

/**
 * @author G
 */
public class FileHandler {

    private static String PATH
            = "C:\\Users\\csomo\\Documents\\NetBeansProjects\\"
            + "VizsgaPelda\\MVizsga0826\\Vizsga_Pelda\\src\\persistance\\planeTrips";
    private static String DELIMITER = ",";
    private String[] DELIMITER_PATTERN = {DELIMITER, ""};

    public static List<List<String>> readIn(String path) throws IOException {
        List<List<String>> result = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH));
            List<String> row;
            while (reader.readLine() != null) {
                row = makerow(reader.readLine());
                result.add(row);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandler.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    private static List<String> makerow(String readLine) {
        String[] rowStrings = readLine.split(DELIMITER);
        List<String> result = new ArrayList<>(Arrays.asList(rowStrings));
        return result;
    }

}
