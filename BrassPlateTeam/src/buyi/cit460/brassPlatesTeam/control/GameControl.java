/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.brassPlatesTeam.control;

import byui.cit260.brassPlatesTeam.model.Player;

/**
 *
 * @author camilaortega
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        System.out.println("\n*** createPlayer() function called ***");
        return new Player();
    }
    
}
