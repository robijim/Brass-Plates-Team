/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.brassPlatesTeam.control;

/**
 *
 * @author camilaortega
 */
public class InventoryControl {
    
    public double calcContainersNeeded (double amountRequired, double amountContained, double volume){
        if (amountRequired < 0 || amountRequired >4580) {
            return -1;
        } 
	if (amountContained < 0 || volume >4580) {
            return -1;
        }
        if (volume < 0 || volume >4580) {
            return -1;
        }
	if (amountRequired > volume || volume< amountContained) {
            return -1;
        }
	double amountNeeded = amountRequired - amountContained;
	return amountNeeded; 
    }
        
    public double calcTreesNeededForContainer (double containers, double height, double diameter){
        if(height < 2 || height >16){
            return -1;
        }
        if (diameter < 2 || diameter > 6){
            return -1;
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
    
    public double calcAmountOfGoldAndSilver (double container, double gold, double silver){
        if(gold < 0 || gold > 40){
            return -1;
        }
        if (silver <0 || silver > 20){
            return -1;
        }
        if (container == 0 || container > 30){
            return -1;
        }
        container = gold + silver;
        double weight = container * 9.8;
        return weight;
    }
}
