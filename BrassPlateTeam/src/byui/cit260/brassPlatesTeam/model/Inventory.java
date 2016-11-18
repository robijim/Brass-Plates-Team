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
 * @author JosephKH
 */
public class Inventory implements Serializable {
    
    //class instance variables
    private String itemType;
    private double amountCollected;
    private double amountNeeded;
    
    private Actor actor;
    private Item[] item;
    
    public Inventory() {
    }
    
    

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(double amountCollected) {
        this.amountCollected = amountCollected;
    }

    public double getAmountNeeded() {
        return amountNeeded;
    }

    public void setAmountNeeded(double amountNeeded) {
        this.amountNeeded = amountNeeded;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.itemType);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.amountCollected) ^ (Double.doubleToLongBits(this.amountCollected) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.amountNeeded) ^ (Double.doubleToLongBits(this.amountNeeded) >>> 32));
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.amountCollected) != Double.doubleToLongBits(other.amountCollected)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountNeeded) != Double.doubleToLongBits(other.amountNeeded)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "itemType=" + itemType + ", amountCollected=" + amountCollected + ", amountNeeded=" + amountNeeded + '}';
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }
    
}
