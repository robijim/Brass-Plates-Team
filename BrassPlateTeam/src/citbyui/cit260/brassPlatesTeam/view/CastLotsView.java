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

    public static CastLotsView rollDice;

    //Display a menu with options used to cast lots or in other words roll the dice.  There are 4 numbers corresponding each corresponding to the characters.  Laman is eldest or #1, Lemuel is #2, Sam is #3, and Nephi is #4.
    public CastLotsView() {
              super("\n-------------------------------"
                   +"\nCast Lots Menu                 "
                   +"\n-------------------------------"
                   +"\nR- Roll Dice                   "
                   +"\nQ- Exit to Main Menu           "
                   +"\n-------------------------------");
    }

    public CastLotsView(CastLotsView rollDice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            /*case "Q": //return to main menu
               this.returnToMainMenu();
               break;*/
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

        private int rollDice() {
            int toss = (int) ((Math.random()*6) +1);
//int toss = (int) ((Math.random()*6) +1);
       int result = 0; 
            if(toss == 4) {
                result = toss-3;
                    if(toss == 3) {
                        result = toss-2;
                            if(toss == 2) {
                                result = toss-1;
                                    if(toss == 1) {
                                        System.out.println("And the lot fell upon Laman, and he went in alone unto the house of Laban.");
                                        if(toss == 6 || toss == 5) {
                                            result = -1;
                                            System.out.println("Must roll a 4 for Nephi, a 3 for Samm, a 2 for Lemuel, or a 1 for Laman" + "Please roll again.");
                                    ;
                                }
                            }
                        }
                }
                }
        return result;
                }
}
                /*Random toss = new Random(4);
                //for (toss=1; toss<5; toss++) {               
                    //int result;
                switch (toss) {
                    case 1: 
                        System.out.println("And the lot fell upon Laman, and he went in unto the house of Laban");
                    break;
                    case 2:
                        ;
                    break;
                    case 3: toss - 2;
                    break;
                    
                    case 4: toss - 3;
                    default: 
                        System.out.println("Try again!");-1
                }
            }
        }*/
        /*private void returnToMainMenu() {
            System.out.println("returnToMainMenu has been called");
        }*/
        
    
