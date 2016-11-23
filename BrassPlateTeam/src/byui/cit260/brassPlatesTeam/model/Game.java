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
public class Game implements Serializable{
    
    //class instance variables
    private double totalTime;
    
    private Map map;
    private Player player;
    private Actor[] actor;
    private Item[] inventory;
    private BrassPlates brassplates;
    
    public Game() {
    }
    
    

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.totalTime);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + '}';
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public BrassPlates getBrassplates() {
        return brassplates;
    }

    public void setBrassplates(BrassPlates brassplates) {
        this.brassplates = brassplates;
    }
    
    
}
