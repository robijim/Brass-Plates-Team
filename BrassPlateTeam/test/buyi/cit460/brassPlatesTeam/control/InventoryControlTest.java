/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.brassPlatesTeam.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camilaortega
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    /**
     * Test of calcContainersNeeded method, of class InventoryControl.
     */
    @Test
    public double testCalcVolumeOfContainer() {
        System.out.println("calcVolumeOfContainer");
        
        /********
         * Test Case #1
         */
        System.out.println("\ttest case #1");
        double height = 10.0;
        double diameter = 5.0;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = 196.25;
        
        double result = instance.calcVolumeOfContainer(height, diameter);
        
        assertEquals(expResult, result, 0.001);
        
        /********
         * Test Case #2
         */
        System.out.println("\ttest case #2");
        height = -1.0;
        diameter = 10.0;
        
        expResult = -1.0;
        
        result = instance.calcVolumeOfContainer(height, diameter);
        
        assertEquals(expResult, result, -1.0);
        
        /********
         * Test Case #3
         */
        System.out.println("\ttest case #3");
        height = 1.0;
        diameter = -10.0;
        
        expResult = -1.0;
        
        result = instance.calcVolumeOfContainer(height, diameter);
        
        assertEquals(expResult, result, -1.0);
        
        /********
         * Test Case #4
         */
        System.out.println("\ttest case #4");
        height = 25.0;
        diameter = 0.0;
        
        expResult = -1.0;
        
        result = instance.calcVolumeOfContainer(height, diameter);
        
        assertEquals(expResult, result, -1.0);
        
        /********
         * Test Case #5
         */
        System.out.println("\ttest case #5");
        height = 0.0;
        diameter = 0.0;
        
        expResult = 0.0;
        
        result = instance.calcVolumeOfContainer(height, diameter);
        
        assertEquals(expResult, result, 0.0);
        
        /********
         * Test Case #6
         */
        System.out.println("\ttest case #6");
        height = 1.0;
        diameter = 0.0;
        
        expResult = 10.0;
        
        result = instance.calcVolumeOfContainer(height, diameter);
        
        assertEquals(expResult, result, 10.0);
        
        /********
         * Test Case #7
         */
        System.out.println("\ttest case #7");
        height = 18.0;
        diameter = 18.0;
        
        expResult = 4578.12;
        
        result = instance.calcVolumeOfContainer(height, diameter);
        
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of calcContainersNeeded method, of class InventoryControl.
     */
    @Test
    public void testCalcContainersNeeded() {
        System.out.println("calcContainersNeeded");
        
        /********
         * Test Case #1
         */

        System.out.println("Test case #1");
        double amountRequired = 200.0;
        double amountContained = 200.0;
        double volume = 4000.0;

        
        InventoryControl instance = new InventoryControl();
        
        double expResult = 0.0;
        
        double result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, 0.0);
        
        /********
         * Test Case #2
         */
        System.out.println("\ttest case #2");
        amountRequired = -1.0;
        amountContained = 20.0;
        volume = 400.0;
        
        expResult = -1;
        
        result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, -1);
        
        /********
         * Test Case #3
         */
        System.out.println("Test case #3");
        amountRequired = 3000.0;
        amountContained = -1.0;
        volume = 4000.0;
        
        expResult = -1;
        
        result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, -1);
        
        /********
         * Test Case #4
         */
        System.out.println("Test case #4");
        amountRequired = 4900.0;
        amountContained = 2000.0;
        volume = 4000.0;
        
        expResult = -1;
        
        result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, -1);
        
        /********
         * Test Case #5
         */
        System.out.println("Test case #5");
        amountRequired = 0.0;
        amountContained = 0.0;
        volume = 0.0;
        
        expResult = 0.0;
        
        result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, 0.0);
        
        /********
         * Test Case #6
         */
        System.out.println("Test case #6");
        amountRequired = 3800.0;
        amountContained = 4000.0;
        volume = 4000.0;
        
        expResult = 200.0;

        result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, 200.0);
        
        /********
         * Test Case #7
         */
        System.out.println("Test case #7");
        amountRequired = 3700.0;
        amountContained = 3800.0;
        volume = 4000.0;
        
        expResult = 300.0;
        
        result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, 300.0);
        
    }

     /**
     * Test of calcTreesNeededForContainer method, of class InventoryControl.
     */
    @Test
    public void testCalcTreesNeededForContainer() {
        System.out.println("calcTreesNeededForContainer");

        
        System.out.println("\ttest case 1");
        double height = 16.0;
        double diameter = 2.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 90.00000;
        double result = instance.calcTreesNeededForContainer(height, diameter);
        assertEquals(expResult, result, 0.00001);
        
        System.out.println("\ttest case 2");
        height = 16.0;
        diameter = 1.0;
        expResult = -1.00000;
        result = instance.calcTreesNeededForContainer(height, diameter);
        assertEquals(expResult, result, 0.00001);
        
        System.out.println("\ttest case 3");
        height = 10.0;
        diameter = 7.0;
        expResult = -1.00000;
        result = instance.calcTreesNeededForContainer(height, diameter);
        assertEquals(expResult, result, 0.00001);
        
        System.out.println("\ttest case 4");
        height = 1.0;
        diameter = 5.0;
        expResult = -1.00000;
        result = instance.calcTreesNeededForContainer(height, diameter);
        assertEquals(expResult, result, 0.00001);
        
        System.out.println("\ttest case 5");
        height = 17.0;
        diameter = 6.0;
        expResult = -1.00000;
        result = instance.calcTreesNeededForContainer(height, diameter);
        assertEquals(expResult, result, 0.00001);
        
        System.out.println("\ttest case 6");
        height = 2.0;
        diameter = 6.0;
        expResult = 270.00000;
        result = instance.calcTreesNeededForContainer(height, diameter);
        assertEquals(expResult, result, 0.00001);
        
        System.out.println("\ttest case 7");
        height = 16.0;
        diameter = 2.0;
        expResult = 90.00000;
        result = instance.calcTreesNeededForContainer(height, diameter);
        assertEquals(expResult, result, 0.00001);
        
        System.out.println("\ttest case 8");
        height = 16.0;
        diameter = 6.0;
        expResult = 270.00000;
        result = instance.calcTreesNeededForContainer(height, diameter);
        assertEquals(expResult, result, 0.00001);
        //double treesNeeded = planksNeeded / ((height*12) / 18 *diameter);

    }

    /**
     * Test of calcAmountOfGoldAndSilver method, of class InventoryControl.
     */
    @Test
    public void testCalcAmountOfGoldAndSilver() {
        System.out.println("calcAmountOfGoldAndSilver");
        double container = 30.0;
        double gold = 20.0;
        double silver = 10.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 294.0;
        double result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        assertEquals(expResult, result, 0.0);
    
        // TODO review the generated test code and remove the default call to fail.
        
     
         /**
     * Test case #2
     */
        
        System.out.println("Test case #2");
        container = 9.0;
        gold = -6.0;
        silver = 15.0;
        
        expResult = -1.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
          /**
     * Test case #3
     */
        
        System.out.println("Test case #3");
        container = -9.0;
        gold = 6.0;
        silver = -15.0;
        
        expResult = -1.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
         /**
     * Test case #4
     */
        
        System.out.println("Test case #4");
        container = 30.0;
        gold = 5.0;
        silver = 25.0;
        
        expResult = -1.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
          /**
     * Test case #5
     */
        
        System.out.println("Test case #5");
        container = 30.0;
        gold = 10.0;
        silver = 20.0;
        
        expResult = 294.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
         /**
     * Test case #6
     */
        
        System.out.println("Test case #6");
        container = 30.0;
        gold = 30.0;
        silver = 0.0;
        
        expResult = 294.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
          /**
     * Test case #7
     */
        
        System.out.println("Test case #7");
        container = 30.0;
        gold = 15.0;
        silver = 15.0;
        
        expResult = 294.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
        
    }
    
}
