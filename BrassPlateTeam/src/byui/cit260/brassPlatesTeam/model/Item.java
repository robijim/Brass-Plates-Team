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
public class Item implements Serializable{
    
    //class instance variable
    private String description;
    
    private Inventory inventory;
    private Game game;
    private Location location;
    
   
    public Item() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.description);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
        
    }

    @Override
    public String toString() {
        return "Item{" + "item=" + description + '}';
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
        
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setQuantityInStock(int i) {
        System.out.println("\n*** setQuantityInStock function called ***");
    }

    public void setRequiredAmount(int i) {
        System.out.println("\n*** setRequiredAmount function called ***");
    }

    public Object getRequiredAmount() {
        System.out.println("\n*** getRequiredAmount function called ***");
        return null;
    }

    public Object getQuantityInStock() {
        System.out.println("\n*** getQuantityInStock function called ***");
        return null;
    }
    
}
