/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

import java.util.Scanner;

/**
 *
 * @author jamesrobison
 */
public class CastLotsView {

    //Display a menu with options used to cast lots or in other words roll the dice.  There are 4 numbers corresponding each corresponding to the characters.  Laman is eldest or #1, Lemuel is #2, Sam is #3, and Nephi is #4.
    private String menu;
    public CastLotsView() {
        this.menu = "\n-------------------------------"
                   +"\nCast Lots Menu                 "
                   +"\n-------------------------------"
                   +"\nR- Roll Dice                   "
                   +"\nE- Exit and continue quest     "
                   +"\n-------------------------------";
    }
    
    public void displayCastLotsView(){
        boolean done = false; //set flag to not done
        
        do{
            //prompt for and get players name
            String CastLotsOption = this.getCastLotsOption();
            if (CastLotsOption.toUpperCase().equals("E")) //user wants to return to continue quest
                return; //exit Cast Lots View
            
            //do the requested action and display the next view
            done = this.doAction(CastLotsOption);
            
        } while (!done);
    }

    //Each time a number is picked a dialogue will be created either prompting the player to roll the dice again or will give an account of the success of the failure of the person who just attempted the desired quest.     //When the players number is called, the view will display a message to the user that it is the player's turn to complete the quest.

    private String getCastLotsOption() {
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
END  */
      Scanner keyboard = new Scanner(System.in); //get infile for keyboard
      String value = ""; //value to be returned
      boolean valid = false; //initialize to not valid
      
      while (!valid) { //loop while an invalid value is entered
          System.out.println("\n" + this.menu);
          
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

    private boolean doAction(String choice) {
        /*BEGIN
        convert choice to upper case
        SWITCH choice
                         “R”: Roll dice
                         “E”: Return to Main Menu
                         DEFAULT: DISPLAY “Invalid selection”
        ENDSWITCH
        RETURN false
        END*/
        choice = choice.toUpperCase(); //convert choice to upper case
        switch (choice) {
            case "R": //roll dice
                this.rollDice();
                break;
            case "E": //get and start an existing game
               this.returnToMainMenu();
               break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

        private void rollDice() {
            System.out.println("***rollDice function has been called***");
        }

        private void returnToMainMenu() {
            System.out.println("returnToMainMenu has been called");
        }
        
    }