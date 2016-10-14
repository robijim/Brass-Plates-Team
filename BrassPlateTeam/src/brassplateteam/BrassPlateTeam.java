/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brassplateteam;

import byui.cit260.brassPlatesTeam.model.Game;
import byui.cit260.brassPlatesTeam.model.Inventory;
import byui.cit260.brassPlatesTeam.model.Item;
import byui.cit260.brassPlatesTeam.model.LocationTypeScene;
import byui.cit260.brassPlatesTeam.model.ResourceTypeScene;
import byui.cit260.brassPlatesTeam.model.Scene;
import byui.cit260.brassPlatesTeam.model.Player;
import byui.cit260.brassPlatesTeam.model.Actor;
import byui.cit260.brassPlatesTeam.model.Map;


/**
 *
 * @author JosephKH
 */
public class BrassPlateTeam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // related to Inventory
        Player playerOne = new Player();
        
        playerOne.setName("Bob Hope");
        playerOne.setBestTime(5.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
 
        Actor actorOne = new Actor();
        
        actorOne.setName("Nephi");
        actorOne.setDescription("Righteous");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo); 
        
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("Jerusalem");
        sceneOne.setTravelTime(3.0);
        sceneOne.setBlockedLocation("Blocked");
        sceneOne.setAvailableLocation("Available");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        ResourceTypeScene resourceSceneOne = new ResourceTypeScene();
        
        resourceSceneOne.setAmountAvailable(50.0);
        resourceSceneOne.setResourceType("Inheritance");
        
        String resourceSceneOneInfo = resourceSceneOne.toString();
        System.out.println(resourceSceneOneInfo);
        
        LocationTypeScene locationSceneOne = new LocationTypeScene();
        
        locationSceneOne.setDescription("Lehi's House");
        
        String locationSceneInfo = locationSceneOne.toString();
        System.out.println(locationSceneInfo);
        
        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setItemType("important");
        inventoryOne.setAmountCollected(2);
        inventoryOne.setAmountNeeded(4);
        
        String inventoryInfo = inventoryOne.toString();      
        System.out.println(inventoryInfo);
        
        // related to Game.
        
        Game gameOne = new Game();
        
        gameOne.setTotalTime(7.0);
        
        String gameInfo = gameOne.toString();      
        System.out.println(gameInfo);
        
        // related to Item.
  
        Item itemOne = new Item();
        
        itemOne.setName("The plates of brass");
        
        String itemInfo = itemOne.toString();      
        System.out.println(itemInfo);
        
        Map mapOne;
        mapOne = new Map();
        
        mapOne.setDirection("Desert");
        boolean mapInfo = false;
        System.out.println(mapInfo);
        
    }
    
}
