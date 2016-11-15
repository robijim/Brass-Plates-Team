/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

import java.util.Scanner;

/**
 *
 * @author JosephKH
 */
public class ObtainThePlatesView extends View {

    
public ObtainThePlatesView(){
       super("\n"
                    + "\n-------------------------------"
                    + "\n| Obtain The Plates Menu      |"
                    + "\n-------------------------------"
                    + "\nM - Mesure plates weight      |"
                    + "\nQ - Quit                      |"
                    + "\n-------------------------------");
    }    

@Override
    public boolean doAction(String value) {
       /*BEGIN
        convert choice to upper case
        SWITCH choice
                       
                         “M”: Mesure plates weight
                         “Q”: Exit to Main Menu
                         DEFAULT: DISPLAY “Invalid selection”
        ENDSWITCH
        RETURN false
        END*/
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
           
            case "Q": //takes you back to main menu
               this.returnToMainMenu();
               break;
            case "M": //Mesure plate weight
             this.MesurePlateWeight();
             break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;    
}

    private void MesurePlateWeight() {
        System.out.println("***MesurePlateWeight function has been called***");
    }
    
     private void returnToMainMenu() {
            System.out.println("***returnToMainMenu has been called***");
        }
}
