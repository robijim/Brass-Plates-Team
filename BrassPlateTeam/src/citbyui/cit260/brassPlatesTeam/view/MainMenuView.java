/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

import byui.cit260.brassPlatesTeam.exceptions.GameControlException;
import brassplateteam.BrassPlateTeam;
import buyi.cit460.brassPlatesTeam.control.GameControl;

/**
 *
 * @author camilaortega
 */
public class MainMenuView extends View {
    
    public MainMenuView(){
        super("\n"
            + "\n-------------------------------"
            + "\n| Main Menu                   |"
            + "\n-------------------------------"
            + "\nN- Start a new game           |"
            + "\nC- Continue saved game        |"
            + "\nS- Save game                  |"
            + "\nL- Location                   |"
            + "\nZ- Laban's House              |"               
            + "\nR- Roll dice                  |"
            + "\nH- Help                       |"
            + "\nG- Game menu                  |"
            + "\nQ- Quit                       |"
            + "\n-------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        /*BEGIN
        convert choice to upper case
        SWITCH choice
                         “N”: Start a new game
                         “G”: Get and start a saved game
                         “H”: Display the help menu
                         “S”: Display the save game view
                         DEFAULT: DISPLAY “Invalid selection”
        ENDSWITCH
        RETURN false
        END*/
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "N": //create and start a new game
                this.startNewGame();
                break;
            case "C": //get and start an existing game
               this.startExistingGame();
               break;
            case "H": //display the help menu
             this.displayHelpMenu();
             break;
            case "L": //display the location menu
             this.displayLocationMenu();
             break;
            case "Z": //display Laban's house menu
             this.displayLabansHouseMenu();
             break;
            case "R": //display the help menu
             this.displayCastLotsView();
             break;
            case "G": //save the current game
               this.displayGameView();
               break;
            case "S": //save the current game
               this.saveGame();
               break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame(){
        //create a new game
        GameControl.createNewGame(BrassPlateTeam.getPlayer());      
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    private void startExistingGame() {
       //prompt for and get the name of the file to save game in 
        this.console.println("\n\nEnter the file path for file where the game "
                             + "is to be saved.");
        String filePath = this.getInput();
        
        try{
        // save the game to the specified file
        GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
        ErrorView.display("MainMenuView", ex.getMessage());
       
        }
        //display the gameMenu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        //creta e new game
        GameControl.displayHelpMenuView();
        
        //display the game menu
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        //prompt for and get the name of the file to save game in 
        this.console.println("\n\nEnter the file path for file where the game "
                             + "is to be saved.");
        String filePath = this.getInput();
        
        try{
        // save the game to the specified file
        GameControl.saveGame(BrassPlateTeam.getCurrentGame(), filePath);
        } catch (Exception ex) {
        ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayLocationMenu() {
        GameControl.displayLocationMenuView();
        
        LocationMenuView gameMenu = new LocationMenuView();
        gameMenu.display();
    }
    private void displayCastLotsView() {
        GameControl.displayCastLotsView();
        
        CastLotsView castLotsMenu = new CastLotsView();
        castLotsMenu.display();
    }
    
    private void displayGameView() {
        GameControl.displayGameView();
        
        //display the gameMenu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

   private void displayLabansHouseMenu() {
        GameControl.displayLabansHouseMenuView();
        
        LabansHouseMenuView labansHouse = new LabansHouseMenuView();
        labansHouse.display();
    }
    
}
