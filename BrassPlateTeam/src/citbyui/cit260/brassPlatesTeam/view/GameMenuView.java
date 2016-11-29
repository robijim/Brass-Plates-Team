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
                + "\nV - Display map               |"
                + "\nK - Measure plank             |"
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
            case "K": //know the goal of the quest
             this.measurePlank();
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
        
        System.out.println("\tBRASS PLATES MAP");
        
        System.out.println("\n---------------------------------------------------");
        System.out.println("  1    2    3    4    5    6    7    8    9    10");
        System.out.println("\n---------------------------------------------------");
        
        for(int i = 1 ; i < 20 ; i++){
            
            if(i <= (20 - 1) && i != 0){
                System.out.print(i);
            }
            
            for (int j = 0; j < 20; j++) {
                
                if(locations[i][j].getScene().getMapSymbol() == null) {
                    System.out.print("??|");
                } else {
                    System.out.print(" " + locations[i][j].getScene().getMapSymbol() + " ");
                }
                System.out.print("|");
            }
            System.out.print("\n");
            
            System.out.println("\n---------------------------------------------------");
        }
    }

    private Double measurePlank() {
        
        displayPlankBanner();
        Double number = null;
    
        while (number == null){
            String value = this.getInput();
            value = value.trim().toUpperCase();
            if(value.equals('K'))
                break;
            //parse and convert number from text to double
            try{
                number = Double.parseDouble(value);
            }
            catch(NumberFormatException nf){
                System.out.println("Try again or press 'Q' to quit."
                                    + "You must enter a valid number");
            }
            }
        return number;
    }

    private void displayPlankBanner() {
        System.out.println(
                "\n****************************************************************"
              + "\n* Enter a valid number of planks                               *"
              + "\n****************************************************************"
        );
    }
}
