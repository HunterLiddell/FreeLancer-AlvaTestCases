package logic;


import org.junit.Test;

/**
 *
 * @author Alva
 */
public class TreasureSetTest {
    
    /**
     * Test of assignTreasuresToPlayer method, of class TreasureSet.
     */
    @Test
    public void testAssignTreasuresToPlayer() {
        System.out.println("assignTreasuresToPlayer");
        Player player = null;
        int treasureCount = 0;
        TreasureSet instance = new TreasureSet();
        instance.assignTreasuresToPlayer(player, treasureCount);
       
        
        
        player.getTreasures().element();
        
    }
}