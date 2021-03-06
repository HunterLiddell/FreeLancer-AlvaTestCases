package gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import static javafx.scene.layout.StackPane.setAlignment;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Alva
 */
public final class PlayerIcon extends VBox
{
    private final Circle playerIcon;
    private final Text playerTreasuresRemainingText;
    private final Label playerNameLabel;
    private final Color playerColor;
    
    private final int PLAYER_ICON_RADIUS = 30;
    private final int UNSELECTED_STROKE = 1;
    private final int SELECTED_STROKE = 3;
    private final int VICTORY_STROKE = 5;
    
    /**
     * Creates an icon for displaying details about a player, such as their current
     * treasure, a count of their treasures remaining, and if they are active or have
     * won the game
     * @param color The color for the player icon background 
     */
    public PlayerIcon(Color color)
    {
        playerColor = color;
        
        StackPane innerPane = new StackPane();
        
        playerIcon = new Circle();
        playerIcon.setRadius(PLAYER_ICON_RADIUS);
        playerIcon.setStroke(Color.BLACK);
        playerIcon.setStrokeWidth(UNSELECTED_STROKE);
        playerIcon.setFill(color);
        
        innerPane.getChildren().add(playerIcon);
        
        AnchorPane treasuresRemainingPane = new AnchorPane();
        
        Circle textBackground = new Circle();
        textBackground.setFill(Color.WHITE);
        textBackground.setLayoutX(75);
        textBackground.setLayoutY(30);
        textBackground.setRadius(10);
        textBackground.setStroke(Color.BLACK);
        textBackground.setStrokeWidth(1);
        treasuresRemainingPane.getChildren().add(textBackground);
        
        playerTreasuresRemainingText = new Text();
        playerTreasuresRemainingText.setLayoutX(71);
        playerTreasuresRemainingText.setLayoutY(30);
        playerTreasuresRemainingText.setText("" + 0);
        playerTreasuresRemainingText.setTextAlignment(TextAlignment.CENTER);
        playerTreasuresRemainingText.setTextOrigin(VPos.CENTER);
        treasuresRemainingPane.getChildren().add(playerTreasuresRemainingText);
        
        innerPane.getChildren().add(treasuresRemainingPane);
        StackPane.setAlignment(treasuresRemainingPane, Pos.TOP_RIGHT);
        
        getChildren().add(innerPane);
        
        // Put the name below everything
        playerNameLabel = new Label();
        playerNameLabel.setAlignment(Pos.CENTER);
        getChildren().add(playerNameLabel);
        
        setAlignment(Pos.CENTER);
        
        this.setPadding(new Insets(4, 4, 4, 4));
    }
    
    /**
     * Returns the player's color
     * @return The player's color
     */
    public Color getColor()
    {
        return playerColor;
    }
    
    /**
     * Sets the player's name
     * @param name The player's name
     */
    public void setPlayerName(String name)
    {
        playerNameLabel.setText(name);
    }
    
    /**
     * Updates the display of number of treasures the player has left to collect
     * @param treasuresRemaining The number of treasures left
     */
    public void updateTreasuresRemaining(int treasuresRemaining)
    {
        playerTreasuresRemainingText.setText("" + treasuresRemaining);
    }
    
    /**
     * Changes the color of the border of the icon to show the player has won
     */
    public void setHasWon()
    {
        playerIcon.setStroke(Color.GOLD);
        playerIcon.setStrokeWidth(VICTORY_STROKE);
    }
    
    /**
     * Changes the stroke of the border of the icon to show the player is the
     * current player
     */
    public void setActive()
    {
        playerIcon.setStroke(Color.AQUAMARINE);
        playerIcon.setStrokeWidth(SELECTED_STROKE);
    }
    
    /**
     * Changes the stroke of the border of the icon to show the player is not 
     * the current player
     */
    public void setInactive()
    {
        playerIcon.setStroke(Color.BLACK);
        playerIcon.setStrokeWidth(UNSELECTED_STROKE);
    }
}
