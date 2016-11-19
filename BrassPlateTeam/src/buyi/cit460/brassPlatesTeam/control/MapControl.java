/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.brassPlatesTeam.control;

import byui.cit260.brassPlatesTeam.model.Map;
import byui.cit260.brassPlatesTeam.model.Scene;

/**
 *
 * @author camilaortega
 */
public class MapControl {

    public static void moveActorsToStartingLocation(Map map) {
        System.out.println("\n***called moveActorsToStartingLocation() in MapControl***");
    }

    public static Map createMap() {
        
        //create a new map
        Map map = new Map(20, 20);
        
        //create scene
        Scene scene = createScenes();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scene);
        
        return map;
    }

    private static Scene createScenes() {
        System.out.println("\n***called createScenes() in MapControl***");
        return null;
    }
    
}
