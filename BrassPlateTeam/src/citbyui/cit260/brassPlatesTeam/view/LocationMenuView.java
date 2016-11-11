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

