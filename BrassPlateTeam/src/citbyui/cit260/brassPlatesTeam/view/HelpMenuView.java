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
public class HelpMenuView extends View{
    
    public HelpMenuView(){
        super("\n"
                + "\n-------------------------------"
                + "\n| Help Menu                   |"
                + "\n-------------------------------"
                + "\nH- How to play                |"
                + "\nT- Traveling through the game |"
                + "\nK- Know the goal of the quest |"
                + "\nQ- Quit                       |"
                + "\n-------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
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
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
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
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void howToPlay() {
        System.out.println(
                "\n****************************************************************"
              + "\n*                                                              *"
              + "\n* Welcome to The Quest for the Brass Plates!  This is a game   *"
              + "\n* of adventure, and peril as you navigate through a story      *"
              + "\n* about Nephi and his brothers, as they are sent on a quest    *"
              + "\n* to obtain a set of brass plates from the city of Jerusalem,  *"
              + "\n* and return to their family who are three days journey into   *"
              + "\n* the wilderness.  The success of your family’s journey        *"
              + "\n* depends upon your choices, and ultimately upon your obtain-  *"
              + "\n* ing the plates of brass.                                     *"
              + "\n*                                                              *"
              + "\n* Remember that the first thing you will see are the menus     *"
              + "\n* and you will be able to select from the different options.   *"
              + "\n* The goal is to get the BrassPlates as part of your inventory.*"
              + "\n* For this you can obtain different elements, and talk in      *"
              + "\n* various locations to different characters in the well known  *"
              + "\n* story.                                                       *"
              + "\n*                                                              *"
              + "\n****************************************************************"
        );
    }

    private void travelingGame() {
        
        System.out.println(
                "\n****************************************************************"
              + "\n*                                                              *"
              + "\n* Traveling as Nephi through the game will let you get into    *"
              + "\n* Laban's house, and end up talking with the servants to       *"
              + "\n* obtain the plates. You will start in the dessert, and you    *"
              + "\n* will have a long way! Good luck!                             *"
              + "\n*                                                              *"
              + "\n****************************************************************"
        );
    }

    private void knowQuest() {
        System.out.println(
                "\n****************************************************************"
              + "\n*                                                              *"
              + "\n* These are the locations in the quest:                        *"
              + "\n*        Desert | City Gate | Laban's House                    *"
              + "\n*        Resources | Armor | Treasury                          *"
              + "\n*                                                              *"
              + "\n****************************************************************"
        );
    }
}