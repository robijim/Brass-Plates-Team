/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.brassPlates.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jamesrobison
 */
public class Location implements Serializable{
    private int rowNum;
    private int columnNum;
    private boolean visited;
    private int amountRemaining;
    private String name;

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getColumnNum() {
        return columnNum;
    }

    public void setColumnNum(int columnNum) {
        this.columnNum = columnNum;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Location{" + "rowNum=" + rowNum + ", columnNum=" + columnNum + ", visited=" + visited + ", amountRemaining=" + amountRemaining + ", name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.rowNum;
        hash = 83 * hash + this.columnNum;
        hash = 83 * hash + (this.visited ? 1 : 0);
        hash = 83 * hash + this.amountRemaining;
        hash = 83 * hash + Objects.hashCode(this.name);
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
        final Location other = (Location) obj;
        if (this.rowNum != other.rowNum) {
            return false;
        }
        if (this.columnNum != other.columnNum) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    public Location() {
    }
    
    
}
