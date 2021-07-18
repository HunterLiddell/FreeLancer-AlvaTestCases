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
public class TreasureTest {
    

    /**
     * Test of getTreasureImageName method, of class Treasure.
     */
    @Test
    public void testGetTreasureImageName() {
        String expResult01 = "s1", expResult02 = "p4";
        
        Treasure treasure01 = new Treasure(Treasure.TreasureType.s1);
        Treasure treasure02 = new Treasure(Treasure.TreasureType.p4);
        
        String result01 = treasure01.getTreasureImageName();
        String result02 = treasure02.getTreasureImageName();
        
        assertEquals(expResult01, result01);
        assertEquals(expResult02, result02);
        
        System.out.println("getTreasureImageName: PASSED");
    }

    /**
     * Test of getTreasureType method, of class Treasure.
     */
   @Test
    public void testGetTreasureType() {
        Treasure treasure01 = new Treasure(Treasure.TreasureType.s1);
        Treasure treasure02 = new Treasure(Treasure.TreasureType.s19);
        
        Treasure.TreasureType expResult01 = Treasure.TreasureType.s1;
        Treasure.TreasureType expResult02 = Treasure.TreasureType.s19;
        
        Treasure.TreasureType result01 = treasure01.getTreasureType();
        Treasure.TreasureType result02 = treasure02.getTreasureType();
        
        assertEquals(expResult01, result01);
        assertEquals(expResult02, result02);
        
        System.out.println("getTreasureType: PASSED");
    }
    
}
