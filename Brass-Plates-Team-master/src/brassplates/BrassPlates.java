/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brassplates;

import byui.cit260.brassPlates.model.Actor;
import byui.cit260.brassPlates.model.Location;
import byui.cit260.brassPlates.model.Player;
import byui.cit260.brassPlates.model.ResourceTypeScene;
import byui.cit260.brassPlates.model.Scene;

/**
 *
 * @author jamesrobison
 */
public class BrassPlates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
    }
}
