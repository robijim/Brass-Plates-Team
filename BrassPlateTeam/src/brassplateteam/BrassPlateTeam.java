/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brassplateteam;

import byui.cit260.brassPlatesTeam.model.Game;
import byui.cit260.brassPlatesTeam.model.Player;
import citbyui.cit260.brassPlatesTeam.view.StartProgramView;

/*import byui.cit260.brassPlatesTeam.model.Game;
import byui.cit260.brassPlatesTeam.model.Inventory;
import byui.cit260.brassPlatesTeam.model.Item;
import byui.cit260.brassPlatesTeam.model.LocationTypeScene;
import byui.cit260.brassPlatesTeam.model.ResourceTypeScene;
import byui.cit260.brassPlatesTeam.model.Scene;
import byui.cit260.brassPlatesTeam.model.Player;
import byui.cit260.brassPlatesTeam.model.Actor;
import byui.cit260.brassPlatesTeam.model.Map;*/

/**
 *
 * @author JosephKH
 */
public class BrassPlateTeam {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        //Create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();   
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BrassPlateTeam.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        BrassPlateTeam.player = player;
    }
    
}
