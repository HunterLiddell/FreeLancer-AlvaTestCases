/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import gui.PlayerCharacter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidde
 */
public class TileTest {

    /**
     * Test of getType method, of class Tile.
     */
    @Test
    public void testGetType() {
        Tile tile;
        Tile.Type result;
        Tile.Type expResult;
        
        expResult = Tile.Type.Treasure;
        Treasure type = new Treasure(Treasure.TreasureType.p1);
        tile = new Tile(Tile.Shape.I, 0, type);
        result = tile.getType();
        assertEquals(expResult, result);
        
        expResult = Tile.Type.None;
        tile = new Tile(Tile.Shape.I, 0);
        result = tile.getType();
        assertEquals(expResult, result);
        
        System.out.println("getType: PASSED");
    }

    /**
     * Test of setRotation method, of class Tile.
     */
    @Test
    public void testSetRotation() {
        int expResult, result;
        Tile tile;
        
        expResult = 90;
        tile = new Tile(Tile.Shape.I, 0);
        tile.setRotation(90);
        result = tile.getRotation();
        assertEquals(expResult, result);
        
        expResult = 270;
        tile = new Tile(Tile.Shape.L, 90);
        tile.setRotation(270);
        result = tile.getRotation();
        assertEquals(expResult, result);
        
        System.out.println("setRotation: PASSED");
        
    }

    /**
     * Test of getRotation method, of class Tile.
     */
    @Test
    public void testGetRotation() {
        int expResult, result;
        Tile tile;
        
        expResult = 90;
        tile = new Tile(Tile.Shape.I, 90);
        result = tile.getRotation();
        assertEquals(expResult, result);
        
        expResult = 270;
        tile = new Tile(Tile.Shape.L, 270);
        result = tile.getRotation();
        assertEquals(expResult, result);
        
        System.out.println("setRotation: PASSED");
    }

    /**
     * Test of getTileShape method, of class Tile.
     */
    @Test
    public void testGetTileShape() {
        Tile.Shape expResult, result;
        Tile tile;
        
        expResult = Tile.Shape.T;
        tile = new Tile(Tile.Shape.T, 0);
        result = tile.getTileShape();
        assertEquals(expResult, result);
        
        expResult = Tile.Shape.I;
        tile = new Tile(Tile.Shape.I, 0);
        result = tile.getTileShape();
        assertEquals(expResult, result);
        
        System.out.println("getTileShape: PASSED");
    }

    /**
     * Test of getPlayer method, of class Tile.
     */
    @Test
    public void testGetPlayer() {
        int expResult, result, playerNum;
        Tile tile;
        
        playerNum = expResult = 1;
        tile = new Tile(Tile.Shape.T, 0, playerNum);
        result = tile.getPlayer();
        assertEquals(expResult, result);
        
        playerNum = expResult = 5;
        tile = new Tile(Tile.Shape.I, 270, playerNum);
        result = tile.getPlayer();
        assertEquals(expResult, result);
        
        System.out.println("getPlayer: PASSED");
    }

    /**
     * Test of getTreasure method, of class Tile.
     */
    @Test
    public void testGetTreasure() {
        Treasure expResult, result;
        Tile tile;
        
        expResult = new Treasure(Treasure.TreasureType.p1);
        tile = new Tile(Tile.Shape.I, 0, expResult);
        result = tile.getTreasure();
        assertEquals(expResult, result);
        
        expResult = new Treasure(Treasure.TreasureType.s10);
        tile = new Tile(Tile.Shape.L, 270, expResult);
        result = tile.getTreasure();
        assertEquals(expResult, result);
    
        System.out.println("getTreasure: PASSED");
    }

    /**
     * Test of rotateClockwise method, of class Tile.
     */
    @Test
    public void testRotateClockwise() {
        Tile tile;
        int expResult, result;
        
        // THIS TEST IS DONE CORRECTLY, THE METHOD IS NOT CORRECT
        
        expResult = 270;
        tile = new Tile(Tile.Shape.L, 0);
        tile.rotateClockwise();
        result = tile.getRotation();
        assertEquals(expResult, result);
        
        expResult = 90;
        tile = new Tile(Tile.Shape.T, 180);
        tile.rotateClockwise();
        result = tile.getRotation();
        assertEquals(expResult, result);
        
        System.out.println("rotateClockwise: PASSED");
    }

    /**
     * Test of rotateCounterClockwise method, of class Tile.
     */
    @Test
    public void testRotateCounterClockwise() {
        Tile tile;
        int expResult, result;
        
        expResult = 90;
        tile = new Tile(Tile.Shape.L, 0);
        tile.rotateClockwise();
        result = tile.getRotation();
        assertEquals(expResult, result);
        
        expResult = 180;
        tile = new Tile(Tile.Shape.T, 90);
        tile.rotateClockwise();
        result = tile.getRotation();
        assertEquals(expResult, result);
        
        System.out.println("rotateCounterClockwise: PASSED");
    }

    /**
     * Test of updateConnectedNeighbors method, of class Tile.
     */
    @Test
    public void testUpdateConnectedNeighbors() {
        Tile currTile = new Tile(Tile.Shape.L, 0);
        currTile.setRowAndCol(5, 5);
        
        
        
        Tile top = new Tile(Tile.Shape.L, 0);
        Tile right = new Tile(Tile.Shape.I, 0);
        Tile bottom = new Tile(Tile.Shape.I, 0);
        Tile left = new Tile(Tile.Shape.I, 0);
        
        
        currTile.updateConnectedNeighbors(top, right, bottom, left);
        
        
        
        System.out.println("updateConnectedNeighbors: TODO");
    }

    /**
     * Test of showPaths method, of class Tile.
     */
    @Test
    public void testShowPaths() {
        GUIConnector conn = GUIConnector.getFakeGUI();
        Player player = new Player(1, Player.PlayerType.human, "p1", conn);
        Tile currTile = new Tile(Tile.Shape.L, 0, player.getPlayerNumber());
        Tile top = null;
        Tile right = null;
        Tile bottom = new Tile(Tile.Shape.I, 0);
        Tile left = new Tile(Tile.Shape.I, 0);
        
        currTile.updateConnectedNeighbors(top, right, bottom, left);
        
        currTile.showPaths(player.getPlayerNumber());
        
        player.showPaths();
        
        
        System.out.println("showPaths: TODO");
    }

    /**
     * Test of hidePaths method, of class Tile.
     */
    @Test
    public void testHidePaths() {
        Tile instance = null;
        instance.hidePaths();
        fail("Prototype");
        System.out.println("hidePaths: TODO");
    }

    /**
     * Test of getAccessible method, of class Tile.
     * Only tested once because there is no instance where this variable can
     * be left as true
     */
    @Test
    public void testGetAccessible() {
        Tile tile = new Tile(Tile.Shape.I, 0);
        boolean expResult = false;
        boolean result = tile.getAccessible();
        
        assertEquals(expResult, result);
        
        System.out.println("getAccessible: TODO");
    }

    /**
     * Test of setRowAndCol method, of class Tile.
     */
    @Test
    public void testSetRowAndCol() {
        Tile tile = new Tile(Tile.Shape.L, 0);
        int expRow, expCol, trueCol, trueRow;
        
        expRow = expCol = 5;
        tile.setRowAndCol(expRow, expCol);
        trueCol = tile.getCol();
        trueRow = tile.getRow();
        
        assertEquals(expRow, trueRow);
        assertEquals(expCol, trueCol);
        
        
        expRow = 3;
        expCol = 8;
        tile.setRowAndCol(expRow, expCol);
        trueCol = tile.getCol();
        trueRow = tile.getRow();
        
        assertEquals(expRow, trueRow);
        assertEquals(expCol, trueCol);
        
        System.out.println("setRowAndCol: PASSED");
    }

    /**
     * Test of getRow method, of class Tile.
     */
    @Test
    public void testGetRow() {
        Tile tile = new Tile(Tile.Shape.I, 0);
        int expRow, trueRow;
        
        expRow = 5;
        tile.setRowAndCol(expRow, 0);
        trueRow = tile.getRow();
        assertEquals(expRow, trueRow);
        
        expRow = 278;
        tile.setRowAndCol(expRow, 0);
        trueRow = tile.getRow();
        assertEquals(expRow, trueRow);
        
        System.out.println("getRow: PASSED");
    }

    /**
     * Test of getCol method, of class Tile.
     */
    @Test
    public void testGetCol() {
        Tile tile = new Tile(Tile.Shape.I, 0);
        int expCol, trueCol;
        
        expCol = 5;
        tile.setRowAndCol(0, expCol);
        trueCol = tile.getCol();
        assertEquals(expCol, trueCol);
        
        expCol = 278;
        tile.setRowAndCol(0, expCol);
        trueCol = tile.getCol();
        assertEquals(expCol, trueCol);
        
        System.out.println("getCol: PASSED");
    }

    /**
     * Test of addPlayerCharacter method, of class Tile.
     */
    @Test
    public void testAddPlayerCharacter() {
        final GUIConnector conn = GUIConnector.getFakeGUI();
        Player player = new Player(1, Player.PlayerType.human, "p1", conn);
        Tile tile = new Tile(Tile.Shape.L, 0);
        tile.addPlayerCharacter(conn, player.getPlayerNumber());
        PlayerCharacter result = conn.getPlayerCharacter(1);
        
        
        //assertEquals(player.getPlayerNumber(), result.toString());
        
        System.out.println("addPlayerCharacter: TODO");
    }

    /**
     * Test of removePlayerCharacter method, of class Tile.
     */
    @Test
    public void testRemovePlayerCharacter() {
        GUIConnector connector = null;
        int playerIndex = 0;
        Tile instance = null;
        instance.removePlayerCharacter(connector, playerIndex);
        
        System.out.println("removePlayerCharacter: TODO");
    }

    /**
     * Test of getPlayers method, of class Tile.
     */
    @Test
    public void testGetPlayers() {
        GUIConnector conn = GUIConnector.getFakeGUI();
        Tile instance = new Tile(Tile.Shape.T, 0);
        boolean[] result;
        
        instance.addPlayerCharacter(conn, 0);
        boolean[] expResult = {true, false, false, false};
        result = instance.getPlayers();
        assertArrayEquals(expResult, result);
        
        instance.addPlayerCharacter(conn, 1);
        boolean[] expResult01 = {true, true, false, false};
        result = instance.getPlayers();
        assertArrayEquals(expResult01, result);
        
        System.out.println("getPlayers: PASSED");
    }

    /**
     * Test of setPlayers method, of class Tile.
     */
    @Test
    public void testSetPlayers() {
        GUIConnector conn = GUIConnector.getFakeGUI();
        Tile instance = new Tile(Tile.Shape.L, 0);
        
        for(int i = 0; i < 4; i++)
            instance.addPlayerCharacter(conn, i);
        
        boolean[] result = {true, true, true, false};
        boolean[] expResult = {false, false, false, false};
        
        instance.setPlayers(result);
        assertArrayEquals(expResult, result);
        
        System.out.println("setPlayers: PASSED");
    }
    
}
