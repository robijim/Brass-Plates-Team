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
 * @author jamesrobison
 */
public class Scene implements Serializable{
    public enum SceneType {
        start,
        desert,
        cityGate,
        labansHouse1,
        resource,
        labansHouse2,
        armor,
        treasury,
        finish;
    }
    public enum MapSymbol {
        ST,
        DS,
        CG,
        LH2,
        RS,
        LH2,
        AS,
        TS,
        FS;
    }
    
    private String description;
    private double travelTime;
    private String blockedLocation;
    private String availableLocation;
    public String mapSymbol;
    
    
    public Scene() {
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(String blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getAvailableLocation() {
        return availableLocation;
    }

    public void setAvailableLocation(String availableLocation) {
        this.availableLocation = availableLocation;
    }

    /*@Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", blockedLocation=" + blockedLocation + ", availableLocation=" + availableLocation + '}';
    }*/

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.blockedLocation);
        hash = 59 * hash + Objects.hashCode(this.availableLocation);
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.availableLocation, other.availableLocation)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", blockedLocation=" + blockedLocation + ", availableLocation=" + availableLocation + '}';
    }

    public void setBlockedLocation(boolean b) {
        System.out.println("\n*** setBlockedLocation function called ***");
    }

    public String getMapSymbol() {
       return mapSymbol;
    }
    
    public void setMapSymbol(String getMapSymbol) {
        this.mapSymbol = mapSymbol;
    }


    
}
