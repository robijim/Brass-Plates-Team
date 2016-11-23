/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.brassPlatesTeam.control;

import brassplateteam.BrassPlateTeam;
import byui.cit260.brassPlatesTeam.model.Location;
import byui.cit260.brassPlatesTeam.model.Map;
import byui.cit260.brassPlatesTeam.model.Player;
import byui.cit260.brassPlatesTeam.model.Scene;

/**
 *
 * @author camilaortega
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        BrassPlateTeam.setPlayer(player); //save the player
        return player;
    }
    
    static void assignScenesToLocations(Map map, Scene[] scene) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scene[SceneType.start.ordinal()]);
        locations[0][1].setScene(scene[SceneType.desert.ordinal()]);
        locations[0][2].setScene(scene[SceneType.cityGate.ordinal()]);
        locations[0][3].setScene(scene[SceneType.labansHouse1.ordinal()]);
        locations[0][4].setScene(scene[SceneType.resource.ordinal()]);
        locations[0][5].setScene(scene[SceneType.labansHouse2.ordinal()]);
        locations[0][6].setScene(scene[SceneType.armor.ordinal()]);
        locations[0][7].setScene(scene[SceneType.treasury.ordinal()]);
        locations[0][8].setScene(scene[SceneType.finish.ordinal()]);
    }
}
