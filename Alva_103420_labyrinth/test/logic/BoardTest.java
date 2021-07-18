package logic;

import gui.InsertTileButton;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alva
 */
public class BoardTest {
    private final Game game;
    private final GUIConnector conn;
    private final Player[] players = new Player[4];
    private final Board board;
    public BoardTest() {
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
        game.getBoard().getTileSet().tiles.clear();
        board = game.getBoard();
    }

    /**
     * Test of setupTiles method, of class Board.
     */
    @Test
    public void testSetupTiles() {
        System.out.println("setupTiles");
        Tile expResult, result;
        
        expResult = new Tile(Tile.Shape.T, 270, new Treasure(Treasure.TreasureType.s6));
        
        result = board.getTile(2, 0);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getStartingTile method, of class Board.
     */
    @Test
    public void testGetStartingTile() {
        System.out.println("getStartingTile");
        int playerNumber = 0;
        Board instance = null;
        Tile expResult = null;
        Tile result = instance.getStartingTile(playerNumber);
        assertEquals(expResult, result);
        
    }



    /**
     * Test of insertTile method, of class Board.
     */
    @Test
    public void testInsertTile() {
        System.out.println("insertTile");
        //InsertTileButton.ArrowPosition position = null;
        Board instance = null;
        //instance.insertTile(position);
       
    }

    /**
     * Test of placeTileVertical method, of class Board.
     */
    @Test
    public void testPlaceTileVertical() {
        System.out.println("placeTileVertical");
        int column = 0;
        boolean fromAbove = false;
        Board instance = null;
        instance.placeTileVertical(column, fromAbove);
        
    }

    /**
     * Test of placeTileHorizontal method, of class Board.
     */
    @Test
    public void testPlaceTileHorizontal() {
        System.out.println("placeTileHorizontal");
        int row = 0;
        boolean fromLeft = false;
        Board instance = null;
        instance.placeTileHorizontal(row, fromLeft);
     
    }

    /**
     * Test of getTile method, of class Board.
     */
    @Test
    public void testGetTile() {
        System.out.println("getTile");
        int i = 0;
        int j = 0;
        Board instance = null;
        Tile expResult = null;
        Tile result = instance.getTile(i, j);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findTileRow method, of class Board.
     */
    @Test
    public void testFindTileRow() {
        System.out.println("findTileRow");
        Tile tile = null;
        Board instance = null;
        int expResult = 0;
        int result = instance.findTileRow(tile);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findTileCol method, of class Board.
     */
    @Test
    public void testFindTileCol() {
        System.out.println("findTileCol");
        Tile tile = null;
        Board instance = null;
        int expResult = 0;
        int result = instance.findTileCol(tile);
        assertEquals(expResult, result);
        
    }
    
}
