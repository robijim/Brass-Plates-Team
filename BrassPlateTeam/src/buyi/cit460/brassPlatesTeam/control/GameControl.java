/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.brassPlatesTeam.control;

import brassplateteam.BrassPlateTeam;
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

    static void assignScenesToLocations(Map map, Scene scene) {
        System.out.println("\n***called assignScenesToLocations() in MapControl***");
    }
}
