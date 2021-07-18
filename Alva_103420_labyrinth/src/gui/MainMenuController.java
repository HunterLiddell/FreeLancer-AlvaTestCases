package gui;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;

/**
 * MainMenu FXML Controller class
 *
 * @author Alva
 */
public final class MainMenuController implements Initializable
{    
    private SceneController sceneController;
    
    /**
     * Initializes the controller class.
     * @param url Unused
     * @param rb Unused
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Do nothing
    }    
    
    /**
     * Sets a reference to the SceneController
     * @param sc the SceneController
     */
    public void setSceneController(SceneController sc)
    {
        sceneController = sc;
    }
    
    /**
     * Moves to the Player Select Scene
     * @param e Unused
     */
    public void moveToPlayerSelectScene(ActionEvent e)
    {
        try
        {
            sceneController.moveToPlayerSelectScene();
        }
        catch (Exception ex)
        {
            System.out.println("Error! Failed to move to Player Select Screen.");
            System.out.println(ex);
        }
    }
    
    /**
     * Opens the dialog to load a game
     * @param e Unused
     */
    public void loadGame(ActionEvent e)
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load Saved Game");
        fileChooser.setInitialDirectory(new File("."));
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JSON save", "*.json"));
        File file = fileChooser.showOpenDialog(sceneController.getStage());
        
        if (file != null) 
        {
            try
            {
                sceneController.moveToGameScene(file);
            }
            catch (Exception ex)
            {
                System.out.println("Error! Failed to move to Game Screen.");
                System.out.println(ex);
            }
        } 
        else 
        {
            // Do nothing
        }
    }
    
    /**
     * Quits the program
     * @param e Unused
     */
    public void exit(ActionEvent e)
    {
        System.exit(0);
    }
}
