/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.brassPlatesTeam.control;

import byui.cit260.brassPlatesTeam.exceptions.InventoryControlException;

/**
 *
 * @author camilaortega
 */

public class InventoryControl {
    
    public void calcVolumeOfContainer(double height, double diameter)
            throws InventoryControlException {
        if(height < 0 || height >18) {
            throw new InventoryControlException("Height must be greater than 0, and less than 18 inches.");
        } 
        if (diameter < 0 || diameter >18){
            throw new InventoryControlException("Diameter must be greater than 0, and less than 18 inches.");
        }
        double radius = diameter /2;

        double volume = 3.14 * (radius * radius) *height;
    }

    public void calcContainersNeeded (double amountRequired, double amountContained, double volume)
            throws InventoryControlException {
        if (amountRequired < 0 || amountRequired >4580) {
            throw new InventoryControlException("Value must be greater than 0, and less than 4580.");
        } 
	if (amountContained < 0 || volume >4580) {
            throw new InventoryControlException("Height must be greater than 0, and less than 18 feet.");
        }
        if (volume < 0 || volume >4580) {
            throw new InventoryControlException("Height must be greater than 0, and less than 18 feet.");
        }
	if (amountRequired > volume || volume< amountContained) {
            throw new InventoryControlException("Height must be greater than 0, and less than 18 feet.");
        }
	double amountNeeded = amountContained - amountRequired;
    }
        
    public double calcTreesNeededForContainer (double height, double diameter)
            throws InventoryControlException {
        if(height < 2 || height >16){
            throw new InventoryControlException("Height must be greater than 0, and less than 18 feet.");
        }
        if (diameter < 2 || diameter > 6){
            throw new InventoryControlException("Height must be greater than 0, and less than 18 feet.");
        }
        int planksNeeded = 30;
        if (diameter <= 3){
            planksNeeded = 90;
            return planksNeeded;
        }
        if (diameter <= 5){
            planksNeeded = 180;
            return planksNeeded;
        }
        if (diameter <= 9){
            planksNeeded = 270;
            return planksNeeded;
        }
        double treesNeeded = planksNeeded / ((height*12) / 18 *diameter);
        return treesNeeded;
    }
    
    public void calcAmountOfGoldAndSilver (double container, double gold, double silver)
            throws InventoryControlException {
        if(gold < 0 || gold > 40){
            throw new InventoryControlException("Height must be greater than 0, and less than 18 feet.");
        }
        if (silver <0 || silver > 20){
            throw new InventoryControlException("Height must be greater than 0, and less than 18 feet.");
        }
        if (container == 0 || container > 30){
            throw new InventoryControlException("Height must be greater than 0, and less than 18 feet.");
        }
        container = gold + silver;
        double weight = container * 9.8;
    }
}
