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
        double amountRequired = 200.0;
        double amountContained = 200.0;
        double volume = 400.0;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = 0.0;
        
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
        amountRequired = 10.0;
        amountContained = 0.0;
        volume = 0.0;
        
        expResult = 0.0;
        
        result = instance.calcContainersNeeded(amountRequired, amountContained, volume);
        
        assertEquals(expResult, result, 0.0);
 
    }

    /**
     * Test of calcTreesNeededForContainer method, of class InventoryControl.
     */
    @Test
    public void testCalcTreesNeededForContainer() {
        System.out.println("calcTreesNeededForContainer");
        double containers = 0.0;
        double height = 0.0;
        double diameter = 0.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.0;
        double result = instance.calcTreesNeededForContainer(containers, height, diameter);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcAmountOfGoldAndSilver method, of class InventoryControl.
     */
    @Test
    public void testCalcAmountOfGoldAndSilver() {
        System.out.println("calcAmountOfGoldAndSilver");
        double container = 0.0;
        double gold = 0.0;
        double silver = 0.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.0;
        double result = instance.calcAmountOfGoldAndSilver(container, gold, silver);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
