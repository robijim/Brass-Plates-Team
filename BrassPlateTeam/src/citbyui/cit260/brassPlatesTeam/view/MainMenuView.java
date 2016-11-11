/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

import brassplateteam.BrassPlateTeam;
import java.util.Scanner;

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
            + "\nR- Roll dice                   |"
            + "\nH- Help                       |"
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
            case "L": //display the help menu
             this.displayLocationMenu();
             break;
            case "R": //display the help menu
             this.displayCastLotsView();
             break;
            case "S": //save the current game
               this.saveGame();
               break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
            //creta e new game
        System.out.println("\n*** startNewGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        //creta e new game
        GameControl.displayHelpMenuView();
        
        //display the game menu
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }

    private void displayLocationMenu() {
        GameControl.displayLocationMenuView();
        
        LocationMenuView gameMenu = new LocationMenuView();
        gameMenu.displayLocationMenuView();
    }
    private void displayCastLotsView() {
        GameControl.displayCastLotsView();
        
        CastLotsView castLotsMenu = new CastLotsView();
        castLotsMenu.displayCastLotsView();
    }
}
