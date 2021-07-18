package logic;

import gui.PlayerCharacter;
import gui.PlayerIcon;
import java.util.LinkedList;
import static logic.Treasure.TreasureType.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alva
 */
public class PlayerTest {
    
    GUIConnector conn;
    public PlayerTest() {
        conn = GUIConnector.getFakeGUI();
    }
    

    
    /**
     * Test of getPlayerType method, of class Player.
     */
    @Test
    public void testGetPlayerType() {
        Player player;
        Player.PlayerType expResult, result;
        
        
        player = new Player(1, Player.PlayerType.human, "h1", conn);
        expResult = Player.PlayerType.human;
        result = player.getPlayerType();
        assertEquals(expResult, result);
        
        player = new Player(1, Player.PlayerType.advanced_ai, "aa1", conn);
        expResult = Player.PlayerType.advanced_ai;
        result = player.getPlayerType();
        assertEquals(expResult, result);
        
        player = new Player(1, Player.PlayerType.ai, "a1", conn);
        expResult = Player.PlayerType.ai;
        result = player.getPlayerType();
        assertEquals(expResult, result);
        
        player = new Player(1, Player.PlayerType.none, "n1", conn);
        expResult = Player.PlayerType.none;
        result = player.getPlayerType();
        assertEquals(expResult, result);

        
        System.out.println("getPlayerType: PASSED");
    }

    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        Player player;
        String expResult, result;
        
        
        player = new Player(1, Player.PlayerType.human, "h1", conn);
        expResult = "h1";
        result = player.getPlayerName();
        assertEquals(expResult, result);
        
        player = new Player(1, Player.PlayerType.advanced_ai, "aa1", conn);
        expResult = "aa1";
        result = player.getPlayerName();
        assertEquals(expResult, result);
        
        player = new Player(1, Player.PlayerType.ai, "a1", conn);
        expResult = "a1";
        result = player.getPlayerName();
        assertEquals(expResult, result);
        
        player = new Player(1, Player.PlayerType.none, "n1", conn);
        expResult = "n1";
        result = player.getPlayerName();
        assertEquals(expResult, result);
        
        System.out.println("getPlayerName: PASSED");
    }

    /**
     * Test of inGame method, of class Player.
     */
    @Test
    public void testInGame() {
        Player player;
        boolean expResult,result;
        
        
        player = new Player(1, Player.PlayerType.advanced_ai, "aa1", conn);
        expResult = true;
        result = player.inGame();
        assertEquals(expResult, result);
        
        player = new Player(1, Player.PlayerType.ai, "a1", conn);
        expResult = true;
        result = player.inGame();
        assertEquals(expResult, result);
        
        player = new Player(1, Player.PlayerType.human, "h11", conn);
        expResult = true;
        result = player.inGame();
        assertEquals(expResult, result);
        
        player = new Player(1, Player.PlayerType.none, "n11", conn);
        expResult = false;
        result = player.inGame();
        assertEquals(expResult, result);
       
        
        System.out.println("inGame: PASED");
    }

    /**
     * Test of setIcon method, of class Player.
     */
/*
    @Test
    public void testSetIcon() {
        System.out.println("setIcon");
        PlayerIcon icon = null;
        Player instance = null;
        //instance.setIcon(icon);
        instance.s
      
    }
*/
    /**
     * Test of getIcon method, of class Player.
     */
/*    
    @Test
    public void testGetIcon() {
        System.out.println("getIcon");
        Player instance = null;
        PlayerIcon expResult = null;
        //PlayerIcon result = instance.getIcon();
        //assertEquals(expResult, result);
        
    }
*/

    /**
     * Test of getPlayerNumber method, of class Player.
     */
    @Test
    public void testGetPlayerNumber() {
        Player player;
        int expResult, result;
        
        player = new Player(1, Player.PlayerType.advanced_ai, "aa", conn);
        expResult = 1;
        result = player.getPlayerNumber();
        assertEquals(expResult, result);
        
        player = new Player(2, Player.PlayerType.ai, "a", conn);
        expResult = 2;
        result = player.getPlayerNumber();
        assertEquals(expResult, result);
        
        player = new Player(3, Player.PlayerType.human, "h", conn);
        expResult = 3;
        result = player.getPlayerNumber();
        assertEquals(expResult, result);
        
        player = new Player(4, Player.PlayerType.none, "n", conn);
        expResult = 4;
        result = player.getPlayerNumber();
        assertEquals(expResult, result);
        System.out.println("getPlayerNumber: PASSED");
    }

    /**
     * Test of assignTreasure method, of class Player.
     */
    @Test
    public void testAssignTreasure() {
        Treasure treasure, expResult, result;
        Player player;
        LinkedList<Treasure> treasureList_Player;
        
        player = new Player(1, Player.PlayerType.advanced_ai, "aa", conn);
        treasure = expResult = new Treasure(Treasure.TreasureType.s20);
        player.assignTreasure(treasure);
        treasureList_Player = player.getTreasures();
        result = treasureList_Player.getFirst();
        assertEquals(expResult, result);
        
        player = new Player(1, Player.PlayerType.advanced_ai, "aa", conn);
        treasure = expResult = new Treasure(Treasure.TreasureType.p1);
        player.assignTreasure(treasure);
        treasureList_Player = player.getTreasures();
        result = treasureList_Player.getFirst();
        assertEquals(expResult, result);
        
        System.out.println("assignTreasure: PASSED");
    }

    /**
     * Test of showNextTreasure method, of class Player.
     */
    @Test
    public void testShowNextTreasure() {
        Treasure T1, T2, expResult, result;
        Player player;
        
        T1 = new Treasure(Treasure.TreasureType.p1);
        expResult = T1;
        player = new Player(1, Player.PlayerType.ai, "a", conn);
        player.assignTreasure(T1);
        player.showNextTreasure();
        result = player.getCurrentTreasure();
        
        assertEquals(expResult, result);
        
        T2 = new Treasure(Treasure.TreasureType.s14);
        expResult = T2;
        player = new Player (2, Player.PlayerType.human, "h", conn);
        player.assignTreasure(T2);
        player.showNextTreasure();
        result = player.getCurrentTreasure();
        
        assertEquals(expResult, result);
        
        System.out.println("showNextTreasure: PASSED");
    }

    /**
     * Test of getTreasures method, of class Player.
     */
    @Test
    public void testGetTreasures() {
        Player player = new Player(1, Player.PlayerType.human, "h", conn);
        LinkedList<Treasure> expResult = new LinkedList();
        LinkedList<Treasure> result;
        Treasure T1, T2, T3;
        
        T1 = new Treasure(Treasure.TreasureType.p1);
        T2 = new Treasure(Treasure.TreasureType.s20);
        T3 = new Treasure(Treasure.TreasureType.s13);
        
        expResult.add(T1);
        expResult.add(T2);
        expResult.add(T3);
        
        player.assignTreasure(T1);
        player.assignTreasure(T2);
        player.assignTreasure(T3);
        
        result = player.getTreasures();
        assertEquals(expResult, result);
       
        System.out.println("getTreasures: PASSED");
    }

    /**
     * Test of getCurrentTile method, of class Player.
     */
    @Test
    public void testGetCurrentTile() {
        Player player;
        Tile resultTile;
        Tile currTile;
        currTile = new Tile(Tile.Shape.I, 0);
        player = new Player(1, Player.PlayerType.human, "h", conn);
        player.moveCharacter(currTile);
        resultTile = player.getCurrentTile();
        
        assertEquals(currTile, resultTile);
        
        currTile = new Tile(Tile.Shape.L, 0);
        player = new Player(4, Player.PlayerType.ai, "a", conn);
        player.moveCharacter(currTile);
        resultTile = player.getCurrentTile();
        
        assertEquals(currTile, resultTile);
        
        System.out.println("getCurrentTile: PASSED");
    }

    /**
     * Test of setLoadedTilePosition method, of class Player.
     */
    @Test
    public void testSetLoadedTilePosition() {
        int loadedX, loadedY;
        int finalX, finalY;
        Player player;
        
        player = new Player(1, Player.PlayerType.ai, "a", conn);
        loadedX = 5;
        loadedY = 6;
        player.setLoadedTilePosition(loadedX, loadedY);
        finalX = player.getLoadedX();
        finalY = player.getLoadedY();
        
        assertEquals(loadedX, finalX);
        assertEquals(loadedY, finalY);
        
        
        player = new Player(1, Player.PlayerType.ai, "a", conn);
        loadedX = 30;
        loadedY = 27;
        player.setLoadedTilePosition(loadedX, loadedY);
        finalX = player.getLoadedX();
        finalY = player.getLoadedY();
        
        assertEquals(loadedX, finalX);
        assertEquals(loadedY, finalY);
        
        System.out.println("setLoadedTilePosition: PASSED");
    }

    /**
     * Test of getLoadedX method, of class Player.
     */
    @Test
    public void testGetLoadedX() {
        Player player = new Player(1, Player.PlayerType.ai, "a", conn);
        int expResult;
        int result;
        
        expResult = 10;
        player.setLoadedTilePosition(expResult, 1);
        result = player.getLoadedX();
        assertEquals(expResult, result);
        
        expResult = 4;
        player.setLoadedTilePosition(expResult, 1);
        result = player.getLoadedX();
        assertEquals(expResult, result);
        
        System.out.println("getLoadedX: PASSED");
    }

    /**
     * Test of getLoadedY method, of class Player.
     */
    @Test
    public void testGetLoadedY() {
        Player player = new Player(1, Player.PlayerType.ai, "a", conn);
        int expResult;
        int result;
        
        expResult = 12;
        player.setLoadedTilePosition(1, expResult);
        result = player.getLoadedY();
        assertEquals(expResult, result);
        
        
        player.setLoadedTilePosition(1, expResult);
        result = player.getLoadedY();
        assertEquals(expResult, result);
        
        System.out.println("getLoadedY: PASSED");
        
    }

    /**
     * Test of showPaths method, of class Player.
     * THIS IS A METHOD THAT CAN ONLY BE DISPLAYED IN GAME
     */
    @Test
    public void testShowPaths() {
        System.out.println("showPaths: GUI ONLY");
        Player instance = null;
        //instance.showPaths();
     
    }

    /**
     * Test of moveCharacter method, of class Player.
     */
    @Test
    public void testMoveCharacter() {
        Tile tile1, tile2;
        Player player = new Player(1, Player.PlayerType.human, "h", conn);
        
        tile1 = new Tile(Tile.Shape.L, 0);
        tile2 = new Tile(Tile.Shape.L, 90);
        
        assertNotEquals(tile1, player.getCurrentTile());
        player.moveCharacter(tile1);
        assertEquals(tile1, player.getCurrentTile());
        player.moveCharacter(tile2);
        assertNotEquals(tile1, player.getCurrentTile());
        assertEquals(tile2, player.getCurrentTile());
       
        System.out.println("moveCharacter: PASSED");
    }

    /**
     * Test of getHasWon method, of class Player.
     */
    @Test
    public void testGetHasWon() {
        System.out.println("getHasWon: TODO ::: DIFFICULT");
        Player player = new Player(1, Player.PlayerType.ai, "a", conn);
        Treasure.TreasureType[] player_T;
        Treasure treasure;
        
        for (int i = 0; i < 28; i++)
        {
            player_T = Treasure.TreasureType.values();
            treasure = new Treasure(player_T[i]);
            /*
            player.assignTreasure(type);
            System.out.println(player.getTreasures().get(i).getTreasureType());
            player.showNextTreasure();
            */
            
            Tile currTile = new Tile(Tile.Shape.L, 0, treasure);
            //System.out.println(currTile.getTreasure().getTreasureType().name());
            
            player.moveCharacter(currTile);
            //System.out.println(player.playerTreasuresRemaining);
        }
        //System.out.println(player.getHasWon());
  
    }

    /**
     * Test of setActive method, of class Player.
     * DISPLAYS ON GUI ONLY
     */
    @Test
    public void testSetActive() {
        System.out.println("setActive: GUI ONLY");
        Player player = new Player(1, Player.PlayerType.human, "h", conn);
        
        //player.setActive();
        
      
    }

    /**
     * Test of setInactive method, of class Player.
     * DISPLAYS ON GUI ONLY
     */
    @Test
    public void testSetInactive() {
        System.out.println("setInactive: GUI ONLY");
        Player instance = null;
        //instance.setInactive();
    }
    
}
