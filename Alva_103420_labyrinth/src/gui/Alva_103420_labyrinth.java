package gui;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Alva
 */
public final class Alva_103420_labyrinth extends Application
{    
    private SceneController sceneController;
    
    /**
     * Starts the program and moves to the main menu
     * @param stage Reference to the Stage
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception
    {
        sceneController = new SceneController(stage);
        sceneController.moveToMainMenuScene();
        
        stage.setTitle("Labyrinth Board Game");
        stage.setMinHeight(738);
        stage.setMinWidth(823);
        stage.show();
    }
    
    /**
     * Stops the game and kills all AI threads
     */
    @Override
    public void stop()
    {
        sceneController.killAllTimers();
    }

    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
