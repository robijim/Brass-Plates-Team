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
public class LocationMenuView {
    private String menu;
    
    public LocationMenuView(){
        this.menu = "\n"
                    + "\n-------------------------------"
                    + "\n| Location Menu               |"
                    + "\n-------------------------------"
                    + "\nL- Location                   |"
                    + "\nN- Next location              |"
                    + "\nQ- Quit                       |"
                    + "\n-------------------------------";
    }
    
    public void displayLocationMenuView(){
        boolean done= false;
        do{
            String locationMenuOption = this.getLocationOption();
            if(locationMenuOption.toUpperCase().equals("Q"))
                return;

            done = this.doAction(locationMenuOption);
        } while (!done);
    }
    
    public String getLocationOption(){
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
          
          break; 
        }
        return value;
    }
    
    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch(choice){
            case "L":
                this.locationPlayer();
                break;
            case "N":
                this.nextLocation();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    private void locationPlayer(){
        System.out.println("\n*** locationPlayer() function called ***");
    }
    private void nextLocation() {
        System.out.println("\n*** nextLocation() function called ***");
    }
}

