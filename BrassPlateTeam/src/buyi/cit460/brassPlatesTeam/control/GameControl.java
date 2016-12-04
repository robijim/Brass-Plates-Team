/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.brassPlatesTeam.control;

import brassplateteam.BrassPlateTeam;
import byui.cit260.brassPlatesTeam.exceptions.GameControlException;
import byui.cit260.brassPlatesTeam.exceptions.MapControlException;
import byui.cit260.brassPlatesTeam.model.BrassPlates;
import byui.cit260.brassPlatesTeam.model.Game;
import byui.cit260.brassPlatesTeam.model.Item;
import byui.cit260.brassPlatesTeam.model.Location;
import byui.cit260.brassPlatesTeam.model.Map;
import byui.cit260.brassPlatesTeam.model.Player;
import byui.cit260.brassPlatesTeam.model.Scene;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camilaortega
 */
public class GameControl {

    public static Player createPlayer(String name) 
                    throws GameControlException{
        if (name == null) {
            throw new GameControlException("Name cannot be blank.");
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
    public static void saveGame(Game game, String filePath)
    throws GameControlException{
     
        try (FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(game); //write teh game object out to file 
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
    }
    
  
    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        BrassPlateTeam.setCurrentGame(game); //save in BrassPlate
        
        game.setPlayer(player); //save player in game
        
        //create the inventory and save in the game
        Item[] inventory = GameControl.createInventoryList();
        game.setInventory(inventory);
        
        Map map = MapControl.createMap(); // create new map
        game.setMap(map); //save map
        
        BrassPlates brassplates= new BrassPlates();//create new Brass Plate
        game.setBrassplates(brassplates); //save in game
        
        try{
            // move actors to starting position in the map
            MapControl.moveActorsToStartingLocation(map);
        } catch (MapControlException mce){
            System.out.println(mce.getMessage());
        }
    }

    public static void displayHelpMenuView() {
        System.out.println("\n*** displayHelpMenuView function called ***");
    }

   public static void displayLocationMenuView() {
        System.out.println("\n*** displayLocationMenuView function called ***");
    }

   public static void displayCastLotsView() {
        System.out.println("\n***displayCastLotsMenuView function called***");   
    }

    public static void displayGameView() {
        System.out.println("\n***displayGameView function called***");
    }

    public static void displayLabansHouseMenuView() {
        System.out.println("\n***displayLabansHouseMenuView function called***");
    }

    static void displayObtainThePlatesView() {
        System.out.println("\n***displayObtainThePlatesView function called***");   
    }
     
    public static Item[] createInventoryList() {
        
        Item[] inventory = new Item[4];
        
        Item plank = new Item();
        plank.setDescription("plank");
        plank.setQuantityInStock(0);
        plank.setRequiredAmount(0);
        inventory[Item.Index.plank.ordinal()] = plank;
        
        Item gold = new Item();
        gold.setDescription("gold");
        gold.setQuantityInStock(0);
        gold.setRequiredAmount(0);
        inventory[Item.Index.gold.ordinal()] = gold;
        
        Item silver = new Item();
        silver.setDescription("silver");
        silver.setQuantityInStock(0);
        silver.setRequiredAmount(0);
        inventory[Item.Index.silver.ordinal()] = silver;
        
        Item container = new Item();
        container.setDescription("container");
        container.setQuantityInStock(0);
        container.setRequiredAmount(0);
        inventory[Item.Index.container.ordinal()] = container;
        
        return inventory;
    }

    public static void getSavedGame(String filePath)
        throws GameControlException{
        Game game= null;
 
     
        try (FileInputStream fips = new FileInputStream(filePath)){
      ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); //read teh game object from file
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        // close output file 
        BrassPlateTeam.setCurrentGame(game);// save in BrassPlateTeam
    }
}
    


