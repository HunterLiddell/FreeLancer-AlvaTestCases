/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidde
 */
public class AdvancedAITest {
    
    public AdvancedAITest() {
    }

    /**
     * Test of killTimer method, of class AdvancedAI.
     */
    @Test
    public void testKillTimer() {
        System.out.println("killTimer");
        AdvancedAI instance = null;
        instance.killTimer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performTurn method, of class AdvancedAI.
     */
    @Test
    public void testPerformTurn() {
        System.out.println("performTurn");
        AdvancedAI instance = null;
        instance.performTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of predictNextAction method, of class AdvancedAI.
     */
    @Test
    public void testPredictNextAction() {
        System.out.println("predictNextAction");
        AdvancedAI instance = null;
        instance.predictNextAction();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performNextAction method, of class AdvancedAI.
     */
    @Test
    public void testPerformNextAction() {
        System.out.println("performNextAction");
        AdvancedAI instance = null;
        instance.performNextAction();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findTarget method, of class AdvancedAI.
     */
    @Test
    public void testFindTarget() {
        System.out.println("findTarget");
        Tile startTile = null;
        Board board = null;
        AdvancedAI instance = null;
        int expResult = 0;
        int result = instance.findTarget(startTile, board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
