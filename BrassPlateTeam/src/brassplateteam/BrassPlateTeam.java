/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brassplateteam;

import byui.cit260.brassPlatesTeam.model.Item;

/**
 *
 * @author JosephKH
 */
public class BrassPlateTeam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item itemOne = new Item();
        
        itemOne.setName("The plates of brass");
        
        String itemInfo = itemOne.toString();      
        System.out.println(itemInfo);
    }
    
}
