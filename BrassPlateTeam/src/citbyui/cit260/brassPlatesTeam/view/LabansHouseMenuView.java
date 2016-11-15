/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

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
            default:
                System.out.println("\n*** Invalid selection *** Try again");
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
}
