/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

/**
 *
 * @author camilaortega
 */
public class GameMenuView extends View{
    
    public GameMenuView(){
        super("\n"
                + "\n-------------------------------"
                + "\n| Game Menu                   |"
                + "\n-------------------------------"
                + "\nA  - Access map               |"
                + "\nI   - Inventory               |"
                + "\nM - Move to location          |"
                + "\nF - Search current location   |"
                + "\nP - Pick up item              |"
                + "\nD - Drop item                 |"
                + "\nS - Save and Continue         |"
                + "\nQ- Quit                       |"
                + "\n-------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "A":
                this.accessGame();
                break;
            case "I":
               this.travelingGame();
               break;
            case "M": //know the goal of the quest
             this.moveLocation();
             break;
             case "F":
                this.searchLocation();
                break;
            case "P":
               this.pickItem();
               break;
            case "D": //know the goal of the quest
             this.dropItem();
             break;
             case "S": //know the goal of the quest
             this.saveAndContinue();
             break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void accessGame() {
        System.out.println("\n*** accessGame function called ***");
    }

    private void travelingGame() {
        System.out.println("\n*** travelingGame function called ***");
    }

    private void moveLocation() {
        System.out.println("\n*** moveLocation function called ***");
    }

    private void searchLocation() {
        System.out.println("\n*** searchLocation function called ***");
    }

    private void pickItem() {
        System.out.println("\n*** pickItem function called ***");
    }

    private void dropItem() {
        System.out.println("\n*** dropItem function called ***");
    }

    private void saveAndContinue() {
        System.out.println("\n*** saveAndContinue function called ***");
    }
    
}
