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
public class HelpMenuView {
    private String menu;
    
    public HelpMenuView(){
        this.menu = "\n"
                    + "\n-------------------------------"
                    + "\n| Help Menu                   |"
                    + "\n-------------------------------"
                    + "\nH- How to play                |"
                    + "\nT- Traveling through the game |"
                    + "\nK- Know the goal of the quest |"
                    + "\nQ- Quit                       |"
                    + "\n-------------------------------";
    }
    /**
     * display the help menu view
     */
    public void displayHelpMenuView(){
        boolean done = false; //set flag to not done
        
        do{
            //prompt for and get help menu option
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("Q")) //user wants to exit
                return; //exit game
            
            //do the requested action and display the next view
            done = this.doAction(helpMenuOption);
            
        } while (!done);
    }

    private String getHelpMenuOption() {
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
                         “H”: How to play
                         “T”: Traveling through the game
                         “K”: Know the goal of the quest
                         DEFAULT: DISPLAY “Invalid selection”
        ENDSWITCH
        RETURN false
        END*/
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
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
