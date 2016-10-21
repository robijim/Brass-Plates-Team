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
    public void testCalcContainersNeeded() {
        System.out.println("calcContainersNeeded");
        
        /********
         * Test Case #1
         */
        System.out.println("Test case #1");
        double amountRequired = 4500.0;
        double amountContained = 4400.0;
        double volume = 100.0;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = 100.0;
        
        double result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, 0.0);
        
        /********
         * Test Case #2
         */
        System.out.println("Test case #2");
        amountRequired = -1.0;
        amountContained = 20.0;
        volume = 400.0;
        
        expResult = -1.0;
        
        result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, -1.0);
        
        /********
         * Test Case #3
         */
        System.out.println("Test case #3");
        amountRequired = 3000.0;
        amountContained = -1.0;
        volume = 4000.0;
        
        expResult = -1.0;
        
        result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, -1.0);
        
        /********
         * Test Case #4
         */
        System.out.println("Test case #4");
        amountRequired = 4900.0;
        amountContained = 2000.0;
        volume = 4000.0;
        
        expResult = -1.0;
        
        result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, -1.0);
        
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
        amountRequired = 4000.0;
        amountContained = 3800.0;
        volume = 200.0;
        
        expResult = 200.0;
        
        result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, 0.0);
 
    }

    /**
     * Test of calcTreesNeededForContainer method, of class InventoryControl.
     */
    @Test
    public void testCalcTreesNeededForContainer() {
        System.out.println("calcTreesNeededForContainer");
        double containers = 196.35;
        double height = 10.0;
        double diameter = 5.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 180.0;
        double result = instance.calcTreesNeededForContainer(containers, height, diameter);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.      
     
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
     * Test case #1
     */
        
        System.out.println("Test case #1");
        container = 30.0;
        gold = 20.0;
        silver = 10.0;
        
        expResult = 294.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
         /**
     * Test case #2
     */
        
        System.out.println("Test case #2");
        container = 30.0;
        gold = 20.0;
        silver = 10.0;
        
        expResult = 294.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
          /**
     * Test case #3
     */
        
        System.out.println("Test case #3");
        container = 30.0;
        gold = 20.0;
        silver = 10.0;
        
        expResult = 294.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
         /**
     * Test case #4
     */
        
        System.out.println("Test case #4");
        container = 30.0;
        gold = 20.0;
        silver = 10.0;
        
        expResult = 294.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
          /**
     * Test case #5
     */
        
        System.out.println("Test case #5");
        container = 30.0;
        gold = 20.0;
        silver = 10.0;
        
        expResult = 294.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
         /**
     * Test case #6
     */
        
        System.out.println("Test case #6");
        container = 30.0;
        gold = 20.0;
        silver = 10.0;
        
        expResult = 294.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
          /**
     * Test case #7
     */
        
        System.out.println("Test case #7");
        container = 30.0;
        gold = 20.0;
        silver = 10.0;
        
        expResult = 294.0;
        
        result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        
        assertEquals(expResult, result, 0.0); 
        
        
    }
    
}
