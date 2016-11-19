/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.brassPlatesTeam.model;

import java.io.Serializable;
/**
 *
 * @author camilaortega
 */
public class BrassPlates implements Serializable {
    
    private String description;
    private String owner;
    private Game game;
    
    public BrassPlates(){
        this.description= "\nThese are the Brass Plates Nephi and his brothers"
                         + "\nwere asked to look for in Jerusalem.";
        this.owner= "Laban";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
}