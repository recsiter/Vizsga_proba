package persistance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
    private static String[] DELIMITER_PATTERN = {DELIMITER, ""};

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

    public static void writeOut(List<List<String>> listList) {
        String writeable = createwriteable(listList);
        writeToFile(writeable, PATH);
    }

    private static String createwriteable(List<List<String>> listList) {
        StringBuilder builder = new StringBuilder();
        String[] ROW_DELIMITER = {System.lineSeparator(), ""};
        for (int i = 0; i < listList.size(); i++) {
            createOneRow(builder, listList.get(i));
            builder.append(ROW_DELIMITER[(i + 1) / listList.size()]);
        }
        return builder.toString();
    }

    private static void createOneRow(StringBuilder builder, List<String> row) {
        for (int i = 0; i < row.size(); i++) {
            builder.append(row.get(i));
            builder.append(DELIMITER_PATTERN[(i + 1) / row.size()]);
        }

    }

    private static void writeToFile(String writeable, String PATH) {
        try ( FileWriter writer = new FileWriter(PATH);) {
            writer.write(writeable);
        } catch (IOException ex) {
            Logger.getLogger(FileHandler.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

}
