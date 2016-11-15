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
public class CastLotsView extends View {

    //Display a menu with options used to cast lots or in other words roll the dice.  There are 4 numbers corresponding each corresponding to the characters.  Laman is eldest or #1, Lemuel is #2, Sam is #3, and Nephi is #4.
    public CastLotsView() {
              super("\n-------------------------------"
                   +"\nCast Lots Menu                 "
                   +"\n-------------------------------"
                   +"\nR- Roll Dice                   "
                   +"\nQ- Exit to Main Menu           "
                   +"\n-------------------------------");
    }

    //Each time a number is picked a dialogue will be created either prompting the player to roll the dice again or will give an account of the success of the failure of the person who just attempted the desired quest.     //When the players number is called, the view will display a message to the user that it is the player's turn to complete the quest.
    @Override
    public boolean doAction(String value) {
        /*BEGIN
        convert choice to upper case
        SWITCH choice
                         “R”: Roll dice
                         “Q”: Return to Main Menu
                         DEFAULT: DISPLAY “Invalid selection”
        ENDSWITCH
        RETURN false
        END*/
        value = value.toUpperCase(); //convert choice to upper case
        switch (value) {
            case "R": //roll dice
                this.rollDice();
                break;
            case "Q": //get and start an existing game
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