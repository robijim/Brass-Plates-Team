/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brassplates;

//import byui.cit260.brassPlates.model.worldMap;
import byui.cit260.brassPlates.model.Actor;
//import byui.cit260.brassPlates.model.Location;
import byui.cit260.brassPlates.model.Player;
//import byui.cit260.brassPlates.model.World;

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
 
        Actor actorOne = new Actor();
        
        actorOne.setName("Nephi");
        actorOne.setDescription("Righteous");
        actorOne.setCoordinates("Jerusalem");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        /*World worldMap = new worldMap();
        
        worldMap.setDirection(worldMap);
        worldMap.setColumnNum(3);
        worldMap.setRowNum(2);
        
        String worldMap = worldMap.toString();
        System.out.print
        
        
        
        
        Location myLocation = new Location();
        
        myLocation.setRowNum(2);
        myLocation.setColumnNum(3);
        myLocation.setVisited(true);
        myLocation.setAmountRemaining(10);
        myLocation.setName("Jerusalem");
        
        String myLocation = myLocation.toString();
        System.out.println(myLocation);
      */  
        
        
        
        
    }
}
