/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;
import brassplateteam.BrassPlateTeam;
import buyi.cit460.brassPlatesTeam.control.MapControl;
import byui.cit260.brassPlatesTeam.model.Map;
import java.util.Scanner;
/**
 *
 * @author camilaortega
 */
public class LocationMenuView extends View{

    public LocationMenuView(){
                super("\n"
                    + "\n-------------------------------"
                    + "\n| Location Menu               |"
                    + "\n-------------------------------"
                    + "\nL- Location                   |"
                    + "\nN- Next location              |"
                    + "\nQ- Quit                       |"
                    + "\n-------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch(value){
            case "L":
                this.locationPlayer();
                break;
            case "N":
                this.nextLocation();
                break;
            case "P":
                this.printLocationMapSymbols();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
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

    private void printLocationMapSymbols() {
        String start = " ST ";
        String desert = " DS ";
        String cityGate = " CG ";
        String labanHouse1 = " LH2 ";
        String resource = " RS ";
        String labanHouse2 = " LH2 ";
        String armor = " AS ";
        String treasury = " TS ";
        String finish = " FS ";
        
      //prompt for and get the name of the file to print this report to.
      this.console.println("\n\nEnter the file path where this report will"                          + "be printed to");
      String filepath = this.getInput();
      
      try{
          //Print report to the specified file
          MapControl.printLocationMapSymbols(MapControl.outFile, filepath);
      } catch (Exception ex) {
          ErrorView.display("LocationMenuView", ex.getMessage());
      }
      LocationMenuView locationMenu = new LocationMenuView();
      locationMenu.display();
    }
}

