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
public class MainMenuView {
    private String menu;
    
    public MainMenuView(){
        this.menu = "\n"
                    + "\n-------------------------------"
                    + "\n| Main Menu                   |"
                    + "\n-------------------------------"
                    + "\nN- Start a new game           |"
                    + "\nC- Continue saved game        |"
                    + "\nS- Save game                  |"
                    + "\nQ- Quit                       |"
                    + "\n-------------------------------";
    }
    /**
     * display the start program view
     */
    public void displayMainMenuView(){
        boolean done = false; //set flag to not done
        
        do{
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to exit
                return; //exit game
            
            //do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
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

    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() function called ***");
        return true;
    }
}
