/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

import brassplateteam.BrassPlateTeam;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author jamesrobison
 */
public abstract class View implements ViewInterface{
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = BrassPlateTeam.getInFile();
    protected final PrintWriter console = BrassPlateTeam.getOutFile();

    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        String value;
        boolean done = false;
        do{
            this.console.println(this.displayMessage);
            
            //prompt for and get players name
            value = this.getInput();
            if (value.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the View
            
            //do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done);
    }
    
    @Override
    public String getInput() {
      String value = null; //value to be returned
      boolean valid = false; //initialize to not valid
              
          try {
              
            while (!valid) { //loop while an invalid value is entered  
                value = this.keyboard.readLine(); //get next line typed on keyboard
                
                value = value.trim(); //trim off leading and trailing blanks
                if (value.length() < 1) { // value is blank
                    System.out.println("\nInvalid value: value can not be blank");
                    continue;
                }
                
                break; //end the loop
            }
          } catch (Exception e) {
              System.out.println("Error reading input: " + e.getMessage());
          }
      return value; //return the value entered
    }
}
