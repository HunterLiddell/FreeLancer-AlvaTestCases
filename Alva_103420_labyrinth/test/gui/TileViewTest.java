package gui;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import gui.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alva
 */
public class TileViewTest {
    
    public TileViewTest() {
    }
    
    /**
     * Test of addTreasure method, of class TileView.
     */
    @Test
    public void testAddTreasure() {
        System.out.println("addTreasure");
        String treasureType = "";
        TileView instance = null;
        instance.addTreasure(treasureType);
    }

    /**
     * Test of addPlayerStart method, of class TileView.
     */
    @Test
    public void testAddPlayerStart() {
        System.out.println("addPlayerStart");
        Color color = null;
        TileView instance = null;
        instance.addPlayerStart(color);
    }

    /**
     * Test of setupOverlays method, of class TileView.
     */
    @Test
    public void testSetupOverlays() {
        System.out.println("setupOverlays");
        TileView instance = null;
        instance.setupOverlays();
    }

    /**
     * Test of setupPlayers method, of class TileView.
     */
    @Test
    public void testSetupPlayers() {
        System.out.println("setupPlayers");
        TileView instance = null;
        instance.setupPlayers();
       
    }

    /**
     * Test of setRotation method, of class TileView.
     */
    @Test
    public void testSetRotation() {
        System.out.println("setRotation");
        int rotation = 0;
        TileView instance = null;
        instance.setRotation(rotation);
        
    }

    /**
     * Test of getTileImage method, of class TileView.
     */
    @Test
    public void testGetTileImage() {
        System.out.println("getTileImage");
        TileView instance = null;
        Image expResult = null;
        Image result = instance.getTileImage();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of showIntersection method, of class TileView.
     */
    @Test
    public void testShowIntersection() {
        System.out.println("showIntersection");
        Color playerColor = null;
        TileView instance = null;
        instance.showIntersection(playerColor);
     
    }

    /**
     * Test of showPath method, of class TileView.
     */
    @Test
    public void testShowPath() {
        System.out.println("showPath");
        int path = 0;
        Color playerColor = null;
        TileView instance = null;
        instance.showPath(path, playerColor);
       
    }

    /**
     * Test of hidePath method, of class TileView.
     */
    @Test
    public void testHidePath() {
        System.out.println("hidePath");
        int path = 0;
        TileView instance = null;
        instance.hidePath(path);
      
    }

    /**
     * Test of hideAllPaths method, of class TileView.
     */
    @Test
    public void testHideAllPaths() {
        System.out.println("hideAllPaths");
        TileView instance = null;
        instance.hideAllPaths();
        
    }

    /**
     * Test of addPlayerCharacter method, of class TileView.
     */
    @Test
    public void testAddPlayerCharacter() {
        System.out.println("addPlayerCharacter");
        PlayerCharacter player = null;
        TileView instance = null;
        instance.addPlayerCharacter(player);

    }

    /**
     * Test of removePlayerCharacter method, of class TileView.
     */
    @Test
    public void testRemovePlayerCharacter() {
        System.out.println("removePlayerCharacter");
        PlayerCharacter player = null;
        TileView instance = null;
        instance.removePlayerCharacter(player);
    }

    /**
     * Test of moveCharacters method, of class TileView.
     */
    @Test
    public void testMoveCharacters() {
        System.out.println("moveCharacters");
        Tile newTile = null;
        TileView instance = null;
        instance.moveCharacters(newTile);
    }
    
}
