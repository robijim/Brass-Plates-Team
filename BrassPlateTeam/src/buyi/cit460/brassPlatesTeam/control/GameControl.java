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
        Location[][] location = map.getLocations();
        
        //start point
        location[0][0].setScene(scene[SceneType.start.ordinal()]);
        location[0][1].setScene(scene[SceneType.desert.ordinal()]);
        location[0][2].setScene(scene[SceneType.cityGate.ordinal()]);
        location[0][3].setScene(scene[SceneType.labansHouse1.ordinal()]);
        location[0][4].setScene(scene[SceneType.resource.ordinal()]);
        location[0][5].setScene(scene[SceneType.labansHouse2.ordinal()]);
        location[0][6].setScene(scene[SceneType.armor.ordinal()]);
        location[0][7].setScene(scene[SceneType.treasury.ordinal()]);
        location[0][8].setScene(scene[SceneType.finish.ordinal()]);
    }
}
