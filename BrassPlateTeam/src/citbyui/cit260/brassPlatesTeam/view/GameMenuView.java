/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

import brassplateteam.BrassPlateTeam;
import buyi.cit460.brassPlatesTeam.control.MapControl;
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
                + "\nV - Display map               |"
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
        Item[] inventory = game.getInventory();
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
        Location[][] locations = map.getLocations();
        double nRows= map.getRowCount();
        double nColumns = map.getColumnCount();
        String line;
        
        System.out.println("\tBRASS PLATES MAP");
        
        System.out.println("\n--------------------------------------------");
        System.out.println("  1    2    3    4    5    6    7    8    9    10");
        
        System.out.println("Rows: " + nRows);
        System.out.println("Columns: " + nColumns);
        
         Location l= map.getLocations[0][0];
            System.out.println(l.getScene());
        for(int i = 0 ; i<=nRows ; i++){
            line=String.valueOf(i);
            if(i < (nRows-1)) line += " ";
            
            for (int j = 0; j<nColumns; j++) {
                l = map.getLocations[i][j];
                System.out.println(l.getScene());
                /*
                if(locations[i][j].getScene() == null) {
                    System.out.print(" ?? |");
                } else {
                    System.out.print(" " + locations[i][j].getScene().getMapSymbol() + " ");
                }
                System.out.print("|");*/
            }
            
        }
    }
}
