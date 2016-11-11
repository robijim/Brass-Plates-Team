/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;
import java.util.Scanner;

/**
 *
 * @author camilaortega
 */
public class HelpMenuView extends View{
    
    public HelpMenuView(){
        super("\n"
                + "\n-------------------------------"
                + "\n| Help Menu                   |"
                + "\n-------------------------------"
                + "\nH- How to play                |"
                + "\nT- Traveling through the game |"
                + "\nK- Know the goal of the quest |"
                + "\nQ- Quit                       |"
                + "\n-------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        /*BEGIN
        convert choice to upper case
        SWITCH choice
                         “H”: How to play
                         “T”: Traveling through the game
                         “K”: Know the goal of the quest
                         DEFAULT: DISPLAY “Invalid selection”
        ENDSWITCH
        RETURN false
        END*/
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "H": //show how to play
                this.howToPlay();
                break;
            case "T": //guidelines for how to travel through the game
               this.travelingGame();
               break;
            case "K": //know the goal of the quest
             this.knowQuest();
             break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void howToPlay() {
        System.out.println("\n*** howToPlay function called ***");
    }

    private void travelingGame() {
        System.out.println("\n*** travelingGame function called ***");
    }

    private void knowQuest() {
        System.out.println("\n*** knowQuest function called ***");
    }
}
