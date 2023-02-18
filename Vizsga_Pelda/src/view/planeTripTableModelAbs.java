package view;

import java.util.List;
import javax.swing.table.AbstractTableModel;

import vizsga_pelda.trippackage.tripByPlane;

/**
 * @author G
 */
public class planeTripTableModelAbs extends AbstractTableModel {

    private String[] columnNames;
    private List tripListinner;

    public planeTripTableModelAbs(List<tripByPlane> tripList) {
        this.tripListinner = tripList;
        columnNames = new String[]{"AirportFrom", "AirportTo", "FlyingClass",
            "ToGo", "PassangerName", "Price", "TripDate", "NumberOfNights"};
    }

    @Override
    public int getRowCount() {
        return tripListinner.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        tripByPlane temp = (tripByPlane) tripListinner.get(rowIndex);
        String value = String.valueOf(temp.getPassangerName());
        switch (columnIndex) {
            case 1:
                value = temp.getAirportFrom();
                break;
            case 2:
                value = temp.getAirportTo();
                break;
            case 3:
                value = String.valueOf(temp.getFlyingClass());
                break;
            case 4:
                value = temp.getToGo();
                break;

            case 5:
                value = String.valueOf(temp.getPrice());
                break;
            case 6:
                value = String.valueOf(temp.getTripDate());
                break;
            case 7:
                value = String.valueOf(temp.getNumberOfNights());
                break;

        }
        return value;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

}
