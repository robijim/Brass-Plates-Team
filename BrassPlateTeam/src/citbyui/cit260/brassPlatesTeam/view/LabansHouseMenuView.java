/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

import buyi.cit460.brassPlatesTeam.control.InventoryControl;
import byui.cit260.brassPlatesTeam.exceptions.InventoryControlException;

/**
 *
 * @author jamesrobison
 */
    public class LabansHouseMenuView extends View{
        public LabansHouseMenuView(){
            super("\n"
                    + "\n-------------------------------"
                    + "\n| Laban's House               |"
                    + "\n-------------------------------"
                    + "\nL- Talk to Laban              |"
                    + "\nS- Talk to Servant            |"
                    + "\nG- Find the Brass Plates      |"
                    + "\n-------------------------------");
    }
    
    @Override
    public boolean doAction(String value) { 
        
        value = value.toUpperCase();
        switch(value){
            case "L":
                this.talkToLaban();
                break;
            case "S":
                this.talkToServant();
                break;
            case "C":
                this.calcContainer();
                break;
            case "G":
                this.massOfGold();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    private void talkToLaban(){
        System.out.println("\n*** talkToLaban() function called ***");
    }
    private void talkToServant() {
        System.out.println("\n*** talkToServant() function called ***");
    }
    public void calcContainer(){
        try{
        InventoryControl.calcAmountOfGoldAndSilver(0, 0, 0);
        } 
        catch (InventoryControlException ice){
        System.out.println(ice.getMessage());
        }
    }
    private Double massOfGold() {
        
        displayMassOfGoldBanner();
        Double number = null;
   
        while (number == null){
            String value = this.getInput();
            value = value.trim().toUpperCase();
            
            if(value.equals("G"))
                break;
            //parse and convert number from text to a double
            try{
                number = Double.parseDouble(value);
            }
            catch(NumberFormatException nf){
                ErrorView.display(this.getClass().getName(),
                                    "\nTry again or press 'Q' to quit."
                                    + "You must enter a valid number");
            }
        }
        return number;
    }
    
    private void displayMassOfGoldBanner() {
        System.out.println(
                "\n****************************************************************"
              + "\n* We will identify the Plates by its mass                      *"
              + "\n* Enter a valid mass of Gold.                                  *"    
              + "\n****************************************************************"
        );
    
    }
}




