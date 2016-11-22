/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

import brassplateteam.BrassPlateTeam;
import byui.cit260.brassPlatesTeam.model.Game;
import byui.cit260.brassPlatesTeam.model.Item;
import byui.cit260.brassPlatesTeam.model.Location;
import byui.cit260.brassPlatesTeam.model.Map;

/**
 *
 * @author camilaortega
 */
public class GameMenuView extends View{
    
    public GameMenuView(){
        super("\n"
                + "\n-------------------------------"
                + "\n| Game Menu                   |"
                + "\n-------------------------------"
                + "\nA - Access map                |"
                + "\nI - Inventory                 |"
                + "\nM - Move to location          |"
                + "\nF - Search current location   |"
                + "\nP - Pick up item              |"
                + "\nD - Drop item                 |"
                + "\nS - Save and Continue         |"
                + "\nQ- Quit                       |"
                + "\n-------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "A":
                this.accessGame();
                break;
            case "I":
               this.viewInventory();
               break;
            case "V":
               this.displayMap();
               break;
            case "M": //know the goal of the quest
             this.moveLocation();
             break;
             case "F":
                this.searchLocation();
                break;
            case "P":
               this.pickItem();
               break;
            case "D": //know the goal of the quest
             this.dropItem();
             break;
             case "S": //know the goal of the quest
             this.saveAndContinue();
             break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void accessGame() {
        System.out.println("\n*** accessGame function called ***");
    }

    private void viewInventory() {
        StringBuilder line;
        Game game = BrassPlateTeam.getCurrentGame();
        Item[] inventory = game.getItem();
        System.out.println("\n  LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                             ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());
        
        //for each inventory item
        for(Item item : inventory) {
            line = new StringBuilder("                         ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getQuantityInStock());
            
        }
    }

    private void moveLocation() {
        System.out.println("\n*** moveLocation function called ***");
    }

    private void searchLocation() {
        System.out.println("\n*** searchLocation function called ***");
    }

    private void pickItem() {
        System.out.println("\n*** pickItem function called ***");
    }

    private void dropItem() {
        System.out.println("\n*** dropItem function called ***");
    }

    private void saveAndContinue() {
        System.out.println("\n*** saveAndContinue function called ***");
    }

    private void displayMap() {
        
        Game game = BrassPlateTeam.getCurrentGame();
        Map map = game.getMap();
        Location[][] location = map.getLocations();
        
        System.out.println("\tBRASS PLATES QUEST");
        
        System.out.println("\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10 \t11");
        
        int nRows= map.nRows;
        int nColumns = map.nColumns;
        
        for(int i = 0 ; i<=nRows ; i++){
            System.out.println("\n---------------------------------------------");
            
            System.out.print("\n" + nRows);
            
            for (int j = 0; j<=nColumns; j++){
                System.out.print("| ");
                
                  .location = [map.nRows] [map.nColumns];
            }
        }
    }
    
}
