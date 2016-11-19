/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.brassPlatesTeam.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author camiortega
 */

public class Map implements Serializable{
    private String direction;
    private double rowCount;
    private String columnCount;
    private Location[][] locations;

    private Game[] game;
    private int nRows;
    private int nColumns;
    
    public Map(int nRows, int nColumns) {
        if(nRows<1 || nColumns<1) {
            System.out.println("The number of rows and columns must be greater than 0.");
            return;
        }
        this.nRows = nRows;
        this.nColumns = nColumns;
        this.locations = new Location[nRows] [nColumns];
        for (int row = 0; row<nRows; row++) {
            for (int column = 0; column<nColumns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                locations[row][column] = location;
            }
        }
    }
    

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public String getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(String columnCount) {
        this.columnCount = columnCount;
    }
    
    @Override
    public String toString() {
        return "map=" + direction + "Map{" + '}';
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public Location[][] getLocation() {
        return locations;
    }

    public void setLocation(Location[][] location) {
        this.locations = location;
    }
    
}