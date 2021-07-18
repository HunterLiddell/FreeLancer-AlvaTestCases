package logic;

import gui.InsertTileButton;
import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alva
 */
public class GameTest {
    private Game game;
    private GUIConnector conn;
    private Player[] players = new Player[4];
    
    public GameTest() {
        conn = GUIConnector.getFakeGUI();
        Player p1 = new Player(1, Player.PlayerType.human, "h1", conn);
        Player p2 = new Player(2, Player.PlayerType.human, "h2", conn);
        Player p3 = new Player(3, Player.PlayerType.human, "h3", conn);
        Player p4 = new Player(4, Player.PlayerType.human, "h4", conn);
        
        players[0] = p1;
        players[1] = p2;
        players[2] = p3;
        players[3] = p4;
        
        game = new Game(players, 4, conn);
    }
    
  
    /**
     * Test of switchPlayers method, of class Game.
     * MUST TEST AI SEPERATELY DUE TO TOOLKIT NOT BEING INSTANTIATED
     */
    @Test
    public void testSwitchPlayers() {
        int expPlayer, currPlayer;
        
        expPlayer = 0;
        currPlayer = game.getCurrentPlayer();
        assertEquals(expPlayer, currPlayer);
        
        game.switchPlayers();
        
        expPlayer = 1;
        currPlayer = game.getCurrentPlayer();
        assertEquals(expPlayer, currPlayer);
        
        game.switchPlayers();
        
        expPlayer = 2;
        currPlayer = game.getCurrentPlayer();
        assertEquals(expPlayer, currPlayer);
        
        game.switchPlayers();
        
        expPlayer = 3;
        currPlayer = game.getCurrentPlayer();
        assertEquals(expPlayer, currPlayer);
        
        game.switchPlayers();
        
        expPlayer = 0;
        currPlayer = game.getCurrentPlayer();
        assertEquals(expPlayer, currPlayer);
        
        System.out.println("switchPlayers: PASSED");
    }

    /**
     * Test of getCurrentPlayer method, of class Game.
     */
    @Test
    public void testGetCurrentPlayer() {
        int expResult, result;
        
        expResult = 0;
        result = game.getCurrentPlayer();
        assertEquals(expResult, result);
        
        game.switchPlayers();
        
        expResult = 1;
        result = game.getCurrentPlayer();
        assertEquals(expResult, result);
        
        game.switchPlayers();
        
        expResult = 2;
        result = game.getCurrentPlayer();
        assertEquals(expResult, result);
        
        game.switchPlayers();
        
        expResult = 3;
        result = game.getCurrentPlayer();
        assertEquals(expResult, result);
        
        game.switchPlayers();
        
        expResult = 0;
        result = game.getCurrentPlayer();
        assertEquals(expResult, result);
        
        System.out.println("getCurrentPlayer: PASSED");
      
    }

    /**
     * Test of getPlayer method, of class Game.
     */
    @Test
    public void testGetPlayer() {
        int pIndex;
        
        for (int i = 0; i < 4; i++)
        {
            pIndex = i;
            assertEquals(players[i], game.getPlayer(pIndex));
        }
        
        System.out.println("getPlayer: PASSED");
    }

    /**
     * Test of getBoard method, of class Game.
     */
    @Test
    public void testGetBoard() {
        Game newGame = new Game(players, 4, conn);
        
        Board result = newGame.getBoard();
        Board expResult = result;
        assertEquals(expResult, result);
        
        System.out.println("getBoard: PASSED :: NOT CORRECT");
    }

    /**
     * Test of getNextTile method, of class Game.
     */
    @Test
    public void testGetNextTile() {
        Tile tile = new Tile(Tile.Shape.I, 0);
        game.getBoard().getTileSet().setNextTile(tile);
        
        Tile expResult = tile;
        Tile result = game.getNextTile();
        assertEquals(expResult, result);
        
        System.out.println("getNextTile: PASSED");
    }

    /**
     * Test of addPlayerCharacterToBoard method, of class Game.
     */
    @Test
    public void testAddPlayerCharacterToBoard() {
        Player player, expResult;
        
        player = players[0];
        game.addPlayerCharacterToBoard(player);
        expResult = game.getPlayer(game.getCurrentPlayer());
        assertEquals(expResult, player);
        
        game.switchPlayers();
        
        player = players[1];
        game.addPlayerCharacterToBoard(player);
        expResult = game.getPlayer(game.getCurrentPlayer());
        assertEquals(expResult, player);
        
        System.out.println("addPlayerCharacterToBoard: PASSED");
    }

    /**
     * Test of insertTile method, of class Game.
     */
    @Test
    public void testInsertTile() {
        System.out.println("insertTile: TODO :: DIFFICULT");
        //InsertTileButton.ArrowPosition arrowPosition = null;
        Game instance = null;
        //instance.insertTile(arrowPosition);
        
    }

    /**
     * Test of movePlayerToTile method, of class Game.
     */
    @Test
    public void testMovePlayerToTile() {
        Tile tile = new Tile(Tile.Shape.I, 0);
        Player player, expResult;
        
        player = players[0];
        game.addPlayerCharacterToBoard(player);
        game.movePlayerToTile(tile);
        
        for(int i = 0; i < 3; i++)
            game.switchPlayers();
        
        expResult = game.getPlayer(game.getCurrentPlayer());
        
        assertEquals(expResult, player);
        
        System.out.println("movePlayerToTile: PASSED");
    }

    /**
     * Test of rotateNextTileClockwise method, of class Game.
     */
    @Test
    public void testRotateNextTileClockwise() {
        int expResult = 0, result, r = 0;
        Game _game = new Game(players, 4, conn);
        Tile tile;
        
        for(int i = 0; i < 4; i++)
        {
            tile = new Tile(Tile.Shape.L, r);
            _game.getBoard().getTileSet().setNextTile(tile);
            result = _game.getNextTile().getRotation();
            assertEquals(expResult, result);
            
            expResult += 90;
            r += 90;
        }
       
        System.out.println("rotateNextTileClockwise: PASSED");
    }

    /**
     * Test of rotateNextTileCounterClockwise method, of class Game.
     */
    @Test
    public void testRotateNextTileCounterClockwise() {
        int expResult = 270, result, r = 270;
        Game _game = new Game(players, 4, conn);
        Tile tile;
        
        for(int i = 0; i < 4; i++)
        {
            tile = new Tile(Tile.Shape.L, r);
            _game.getBoard().getTileSet().setNextTile(tile);
            result = _game.getNextTile().getRotation();
            assertEquals(expResult, result);
            
            expResult -= 90;
            r -= 90;
        }
       
        System.out.println("rotateNextTileCounterClockwise: PASSED");
        
    }

    /**
     * Test of findPlayerRow method, of class Game.
     */
    @Test
    public void testFindPlayerRow() {
        int expResult, result;
        Player player;
        Tile tile;
        
        tile = new Tile(Tile.Shape.I, 0);
        player = new Player(1, Player.PlayerType.human, "h", conn);
        
        player.moveCharacter(tile);
        expResult = 5;
        player.getCurrentTile().setRowAndCol(expResult, 0);
        
        result = player.getCurrentTile().getRow();
        assertEquals(expResult, result);
        
        expResult = 23;
        player.getCurrentTile().setRowAndCol(expResult, 0);
        result = player.getCurrentTile().getRow();
        assertEquals(expResult, result);
       
        System.out.println("findPlayerRow: PASSED");
    }

    /**
     * Test of findPlayerCol method, of class Game.
     */
    @Test
    public void testFindPlayerCol() {
        int expResult, result;
        Player player;
        Tile tile;
        
        tile = new Tile(Tile.Shape.I, 0);
        player = new Player(1, Player.PlayerType.human, "h", conn);
        
        player.moveCharacter(tile);
        expResult = 5;
        player.getCurrentTile().setRowAndCol(0, expResult);
        
        result = player.getCurrentTile().getCol();
        assertEquals(expResult, result);
        
        expResult = 23;
        player.getCurrentTile().setRowAndCol(0, expResult);
        result = player.getCurrentTile().getCol();
        assertEquals(expResult, result);
       
        System.out.println("findPlayerCol: PASSED");
    }
    
}
