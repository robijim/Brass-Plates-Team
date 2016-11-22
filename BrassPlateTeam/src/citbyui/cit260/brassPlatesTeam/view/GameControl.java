/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

import brassplateteam.BrassPlateTeam;
import buyi.cit460.brassPlatesTeam.control.MapControl;
import byui.cit260.brassPlatesTeam.model.Actor;
import byui.cit260.brassPlatesTeam.model.BrassPlates;
import byui.cit260.brassPlatesTeam.model.Game;
import byui.cit260.brassPlatesTeam.model.Item;
import byui.cit260.brassPlatesTeam.model.Map;
import byui.cit260.brassPlatesTeam.model.Player;

/**
 *
 * @author camilaortega
 */
public class GameControl {
    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        BrassPlateTeam.setCurrentGame(game); //save in BrassPlate
        
        game.setPlayer(player); //save player in game
        
        //create the inventory and save in the game
        Item[] item = GameControl.createInventoryList();
        game.setItem(item);
        
        Map map = MapControl.createMap(); // create new map
        game.setMap(map); //save map
        
        BrassPlates brassplates= new BrassPlates();//create new Brass Plate
        game.setBrassplates(brassplates); //save in game
        
        // move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }

    static void displayHelpMenuView() {
        System.out.println("\n*** displayHelpMenuView function called ***");
    }

    static void displayLocationMenuView() {
        System.out.println("\n*** displayLocationMenuView function called ***");
    }

    static void displayCastLotsView() {
        System.out.println("\n***displayCastLotsMenuView function called***");   
    }

    static void displayGameView() {
        System.out.println("\n***displayGameView function called***");
    }

    static void displayLabansHouseMenuView() {
        System.out.println("\n***displayLabansHouseMenuView function called***");
    }

    static void displayObtainThePlatesView() {
        System.out.println("\n***displayObtainThePlatesView function called***");   
    }
    
    public enum Index {
        plank,
        gold,
        silver,
        container;
    }
     
    public static Item[] createInventoryList() {
        
        Item[] inventory = 
            new Item[4];
        
        Item plank = new Item();
        plank.setDescription("plank");
        plank.setQuantityInStock(0);
        plank.setRequiredAmount(0);
        inventory[Index.plank.ordinal()] = plank;
        
        Item gold = new Item();
        gold.setDescription("gold");
        gold.setQuantityInStock(0);
        gold.setRequiredAmount(0);
        inventory[Index.gold.ordinal()] = gold;
        
        Item silver = new Item();
        silver.setDescription("silver");
        silver.setQuantityInStock(0);
        silver.setRequiredAmount(0);
        inventory[Index.silver.ordinal()] = silver;
        
        Item container = new Item();
        container.setDescription("container");
        container.setQuantityInStock(0);
        container.setRequiredAmount(0);
        inventory[Index.container.ordinal()] = container;
        
        return inventory;
    }
}
