package gui;

import logic.Game;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alva
 */
public class BoardViewTest {
    
    public BoardViewTest() {
    }

    /**
     * Test of setupArrows method, of class BoardView.
     */
    @Test
    public void testSetupArrows() {
        System.out.println("setupArrows");
        Game game = null;
        BoardView instance = new BoardView();
        instance.setupArrows(game);

    }

    /**
     * Test of disableArrows method, of class BoardView.
     */
    @Test
    public void testDisableArrows() {
        System.out.println("disableArrows");
        int disabled = 0;
        BoardView instance = new BoardView();
        instance.disableArrows(disabled);
  
    }


    /**
     * Test of rotatePreviewClockwise method, of class BoardView.
     */
    @Test
    public void testRotatePreviewClockwise() {
        System.out.println("rotatePreviewClockwise");
        BoardView instance = new BoardView();
        instance.rotatePreviewClockwise();
   
    }

    /**
     * Test of rotatePreviewCounterClockwise method, of class BoardView.
     */
    @Test
    public void testRotatePreviewCounterClockwise() {
        System.out.println("rotatePreviewCounterClockwise");
        BoardView instance = new BoardView();
        instance.rotatePreviewCounterClockwise();
     
    }
    
}
