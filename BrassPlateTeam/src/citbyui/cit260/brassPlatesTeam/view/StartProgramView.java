/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

import buyi.cit460.brassPlatesTeam.control.GameControl;
import byui.cit260.brassPlatesTeam.model.Player;
import java.util.Scanner;

/**
 *
 * @author jamesrobison
 */
public class StartProgramView extends View{
   
    public StartProgramView() {
    
        //promptMessage = "Please enter your name"
        super("\nPlease enter your name: ");        
        //display the banner when view is created
        this.displayBanner();
        
        
        
        
    }

    private void displayBanner() {
        
        System.out.println(
                "\n****************************************************************"
              + "\n*                                                              *"
              + "\n* Welcome to The Quest for the Brass Plates!  This is a game   *"
              + "\n* of adventure, and peril as you navigate through a story      *"
              + "\n* about Nephi and his brothers, as they are sent on a quest    *"
              + "\n* to obtain a set of brass plates from the city of Jerusalem,  *"
              + "\n* and return to their family who are three days journey into   *"
              + "\n* the wilderness.  The success of your family’s journey        *"
              + "\n* depends upon your choices, and ultimately upon your obtain-  *"
              + "\n* ing the plates of brass.                                     *"
              + "\n* Their journey is filled with perilous and daunting tasks,    *"
              + "\n* and if you make the wrong choice you could find your quest   *"
              + "\n* at a most painful end.  You will be presented with           *"
              + "\n* obstacles, and a list of options that you can choose from.   *"
              + "\n* The success of your quest requires you to be resourceful,    *"
              + "\n* and think through each challenge presented using items that  *"
              + "\n* are provided to you throughout the game.  Choose wisely, and *"
              + "\n* don’t give up!  The story of Nephi is one of courage and     *"
              + "\n* obedience!  Only the stout of heart can make it through      *"
              + "\n* this quest alive, and return safely back to their family in  *"
              + "\n* the wilderness.                                              *"
              + "\n*                                                              *"
              + "\n* Good luck!!!                                                 *"
        );
    }
    
    @Override
    public boolean doAction(String value) {
        
        /* doAction(playersName): boolean
        BEGIN
         if the length of the playersName < 2 then
         display “Invalid name: The name must be > 1 character”
         return false

         create Player with specified name
         if unsuccessful then
         display “Invalid name: The name is too short”
         return false
         display customized welcome message
         display mainMenuView
         return true
        END 
        */
        if (value.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        //call createPlayer() control function
        Player player = GameControl.createPlayer(value);
        
        if (player == null) { //if unsuccessful
            System.out.println ("\nError creating the player.");
            return false;
        }
            
        //display next view
        this.displayNextView(player);
        
        return true; // success!
    }

    private void displayNextView(Player player) {
        // display a custom welcome message
        System.out.println("\n======================================="
                          + "\nWelcome aboard, " + player.getName() + "!"
                          + "\nWe hope you have a lot of fun!"
                          + "\n=======================================");
        
        // create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // display the main menu view
        mainMenuView.display();
    }
}