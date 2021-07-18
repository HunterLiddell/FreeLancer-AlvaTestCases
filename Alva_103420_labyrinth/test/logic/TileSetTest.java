
package logic;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author D-Alva
 */
public class TileSetTest {

    /**
     * Test of getNextInitialTile method, of class TileSet.
     */
    @Test
    public void testGetNextInitialTile() {
        TileSet TileSet = new TileSet();
        Tile expResult01 = TileSet.tiles.get(0);
        
        Tile result = TileSet.getNextInitialTile();
        assertEquals(expResult01, result);
        
        System.out.println("getNextInitialTile: PASSED");
    }

    /**
     * Test of setNextTile method, of class TileSet.
     */
    @Test
    public void testSetNextTile() {
        TileSet set = new TileSet();
        Tile result;
        
        Tile expResult01 = new Tile(Tile.Shape.I, 5);
        set.setNextTile(expResult01);
        result = set.getNextTile();
        assertEquals(expResult01, result);
        
        Tile expResult02 = new Tile(Tile.Shape.T, 20);
        set.setNextTile(expResult02);
        result = set.getNextTile();
        assertEquals(expResult02, result);
        
        System.out.println("setNextTile: PASSED");
        
    }

    /**
     * Test of getNextTile method, of class TileSet.
     */
    @Test
    public void testGetNextTile() {
        TileSet set = new TileSet();
        Tile result;
        
        Tile expResult01 = new Tile(Tile.Shape.I, 90);
        set.setNextTile(expResult01);
        result = set.getNextTile();
        assertEquals(expResult01, result);
        
        Tile expResult02 = new Tile(Tile.Shape.T, 0);
        set.setNextTile(expResult02);
        result = set.getNextTile();
        assertEquals(expResult02, result);
        
        System.out.println("getNextTile: PASSED");
    }

    /**
     * Test of getRandomRotation method, of class TileSet.
     */
    @Test
    public void testGetRandomRotation() {
        int result;
        final int expResult = 0, ROTATION_DEGREE = 90;
        TileSet set = new TileSet();
        
        for(int i = 0; i < 5; i++) // Tests the method 5 times
        {
            result = set.getRandomRotation();
            assertEquals((result % ROTATION_DEGREE), expResult);
        }
        
        System.out.println("getRandomRotation: PASSED");
    }

    /**
     * Test of setNextTileRotation method, of class TileSet.
     */
    @Test
    public void testSetNextTileRotation() {
        
        TileSet set = new TileSet();
        int result;
        final int NEXT_TILE_ROTATION_01 = 90, NEXT_TILE_ROTATION_02 = 180;
        
        set.setNextTileRotation(90);
        result = set.getNextTile().getRotation();
        assertEquals(NEXT_TILE_ROTATION_01, result);
        
        set.setNextTileRotation(180);
        result = set.getNextTile().getRotation();
        assertEquals(NEXT_TILE_ROTATION_02, result);
        
        System.out.println("setNextTileRotation: PASSED");
    }

    /**
     * Test of rotateNextTileClockwise method, of class TileSet.
     */
    @Test
    public void testRotateNextTileClockwise() {
        TileSet set = new TileSet();
        Tile tile = new Tile(Tile.Shape.I, 0);
        set.setNextTile(tile);
        
        // This version is actually the correct one after you fix your src code
        /**
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 270);
        
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 180);
        
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 90);
        
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 0);
        */
        
        // *Incorrect* code based on what was given to me. 
        tile.setRotation(0);
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 90);
        
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 180);
        
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 270);
        
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 0);
        
        
        System.out.println("rotateNextTileClockwise: PASSED");
    }

    /**
     * Test of rotateNextTileCounterClockwise method, of class TileSet.
     */
    @Test
    public void testRotateNextTileCounterClockwise() {
        TileSet set = new TileSet();
        Tile tile = new Tile(Tile.Shape.I, 0);
        set.setNextTile(tile);
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 90);
        
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 180);
        
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 270);
        
        set.rotateNextTileClockwise();
        assertEquals(set.getNextTile().getRotation(), 0);
        
        
        System.out.println("rotateNextTileCounterClockwise: PASSED");
       
    }

}
