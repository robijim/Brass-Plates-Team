/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brassplateteam;

import byui.cit260.brassPlatesTeam.model.Game;
import byui.cit260.brassPlatesTeam.model.Inventory;
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
        // related to Inventory
        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setItemType("important");
        inventoryOne.setAmountCollected(2);
        inventoryOne.setAmountNeeded(4);
        
        String inventoryInfo = inventoryOne.toString();      
        System.out.println(inventoryInfo);
        
        // related to Game.
        
        Game gameOne = new Game();
        
        gameOne.setTotalTime(7.0);
        
        String gameInfo = gameOne.toString();      
        System.out.println(gameInfo);
        
        // related to Item.
  
        Item itemOne = new Item();
        
        itemOne.setName("The plates of brass");
        
        String itemInfo = itemOne.toString();      
        System.out.println(itemInfo);
    }
    
}
