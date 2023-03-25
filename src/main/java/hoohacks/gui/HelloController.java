package hoohacks.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Pane simulation;

    @FXML
    private Button goButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("idk!");
        //goButton.setOnAction(e -> );
    }
    public void initialize(){
        simulation.setVisible(false);
    }
    protected void onGoButton(){
        //run simulation with file
        simulation.setVisible(true);
    }
}