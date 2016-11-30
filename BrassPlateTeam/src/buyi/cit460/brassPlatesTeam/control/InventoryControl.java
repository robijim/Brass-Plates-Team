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
            throw new InventoryControlException("amountRequired must be greater than 0, and less than 4580.");
        } 
	if (amountContained < 0 || volume >4580) {
            throw new InventoryControlException("Amount contained must be greater than 0, and total volume must be less than 4580.");
        }
        if (volume < 0 || volume >4580) {
            throw new InventoryControlException("Volume must be greater than 0, and total volume must be less than 4580.");
        }
	if (amountRequired > volume || volume< amountContained) {
            throw new InventoryControlException("Amount required cannot exceed total volume, and volume cannot be less than the amount contained.");
        }
	double amountNeeded = amountContained - amountRequired;
    }
        
    public double calcTreesNeededForContainer (double height, double diameter)
            throws InventoryControlException {
        if(height < 2 || height >16){
            throw new InventoryControlException("Height must be greater than 2, and less than 16 inches.");
        }
        if (diameter < 2 || diameter > 6){
            throw new InventoryControlException("diameter must be greater than 2, and less than 6 inches.");
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
    
    public static void calcAmountOfGoldAndSilver (double container, double gold, double silver)
            throws InventoryControlException {
        if(gold < 0 || gold > 40){
            throw new InventoryControlException("mass of gold must be greater than 0, and less than 40 kg.");
        }
        if (silver <0 || silver > 20){
            throw new InventoryControlException("mass of silver must be greater than 0, and less than 20 kg.");
        }
        if (container == 0 || container > 30){
            throw new InventoryControlException("total mass of container must be greater than 0, and less than 30 kg.");
        }
        container = gold + silver;
        double weight = container * 9.8;
    }
}
