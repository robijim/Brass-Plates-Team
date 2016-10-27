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
public class StartProgramView {
   
    private String promptMessage;
    
    public StartProgramView() {
    
        //promptMessage = "Please enter your name"
        this.promptMessage = "\nPlease enter your name: ";        
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

    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(playersName);
        } while (!done);
        
    }

    private String getPlayersName() {
      /*getInput(): value
BEGIN
 WHILE a valid value has not been entered
 DISPLAY a message prompting the user to enter a value
 GET the value entered from keyboard
 Trim front and trailing blanks off of the value
 IF the length of the value is blank THEN
 DISPLAY “Invalid value: The value cannot be blank”
 CONTINUE
 ENDIF
 BREAK
 ENDWHILE
 RETURN value
END */
      Scanner keyboard = new Scanner(System.in); //get infile for keyboard
      String value = ""; //value to be returned
      boolean valid = false; //initialize to not valid
      
      while (!valid) { //loop while an invalid value is entered
          System.out.println("\n" + this.promptMessage);
          
          value = keyboard.nextLine(); //get next line typed on keyboard
          value = value.trim(); //trim off leading and trailing blanks
          if (value.length() < 1) { // value is blank
              System.out.println("\nInvalid value: value can not be blank");
              continue;
          }
          
          break; //end the loop
      }
      
      return value; //return the value entered
    }

    private boolean doAction(String playersName) {
        
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
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
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
        mainMenuView.displayMainMenuView();
    }
}