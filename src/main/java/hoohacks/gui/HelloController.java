package hoohacks.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class HelloController {
    @FXML
    private StackPane simulation;

    @FXML
    private Button goButton;

    @FXML
    private StackPane starting;

    public void initialize(){
        simulation.setVisible(false);
        goButton.setOnAction(e -> {
            onGoButton();
        });
    }
    protected void onGoButton(){
        //run simulation with file
        simulation.setVisible(true);
        starting.setVisible(false);
    }
}