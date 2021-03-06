package logic;

import javafx.scene.paint.Color;
import gui.FakeGUI;
import gui.GameBoardController;
import gui.JavaFXGUI;
import gui.PlayerCharacter;
import gui.PlayerIcon;

/**
 *
 * @author D-Alva
 */
public interface GUIConnector 
{
    public static GUIConnector getFakeGUI()
    {
        return new FakeGUI();
    }
    
    public static GUIConnector getJavaFXGUI()
    {
        return new JavaFXGUI();
    }
    
    public abstract void setupBoard(GameBoardController gbcontroller);
    
    public abstract void addTileView(int i, int j, Tile tile, Game game);
    
    public abstract void removeTileView(int i, int j);
    
    public abstract void enableArrows(boolean human);
    
    public abstract void disableArrows(int disabledArrow);
    
    public abstract void updateTrayNextTile(Game game, Tile nextTile);
    
    public abstract PlayerIcon getPlayerIcon(int playerNumber);
    
    public abstract void removePlayerIcon(int playerNumber);
    
    public abstract void updateCurrentTreasure(Treasure treasure, Color playerColor);
    
    public abstract void updateCurrentTreasure(Treasure treasure, int playerNum);
    
    public abstract void setWinningPlayer(int currentPlayer);
    
    public abstract PlayerCharacter getPlayerCharacter(int playerIndex);
    
    public abstract PlayerIcon getIcon(int playerIndex);
    
    public abstract void setIconPlayerName(int playerIndex, String playerName);
    
    public abstract void updateTreasuresRemaining(int playerIndex, int playerTreasuresRemaining);
    
    public abstract void setIconHasWon(int playerIndex);

    public abstract void setIconActive(int playerIndex);
    
    public abstract void setInactive(int playerIndex);
    
    public abstract void createPlayerCharacter(int playerIndex, Player player);
    
    public abstract void addPlayerCharacter(int row, int col, int playerIndex);
    
    public abstract void removePlayerCharacter(int playerIndex);
    
    public abstract void addPlayerCharacters(Tile tile, boolean[] players);
    
    public abstract void removePlayerCharacters(Tile tile);
    
    public abstract void showPaths();
    
    public abstract void hidePaths();
    
    public abstract void rotatePreviewTileClockwise();
    
    public abstract void rotatePreviewTileCounterClockwise();
}

