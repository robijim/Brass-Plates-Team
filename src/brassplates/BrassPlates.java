/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brassplates;

import byui.cit260.brassPlates.model.Actor;
import byui.cit260.brassPlates.model.Player;

/**
 *
 * @author jamesrobison
 */
public class BrassPlates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        
        playerOne.setName("Bob Hope");
        playerOne.setBestTime(5.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    //public static void main(String[] args) 
        Actor actorOne = new Actor();
        
        actorOne.setName("Nephi");
        actorOne.setDescription("Righteous");
        actorOne.setCoordinates("Jerusalem");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
    }
}
