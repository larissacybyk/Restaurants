package hoohacks.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private StackPane simulation;

    @FXML
    private Button goButton;

    @FXML
    private StackPane starting;
    @FXML
    protected TextField filePath;
    private String path;
    @FXML
    private VBox startVbox;
    @FXML
    private VBox simVbox;

    public void initialize(){
        simVbox.setVisible(false);
        simulation.setVisible(false);
        goButton.setOnAction(e -> {
            onGoButton();
        });
    }
    protected void onGoButton(){
        //run simulation with file
        path = filePath.getText();
        simVbox.setVisible(true);
        System.out.println("go pressed");
        startVbox.setVisible(false);
    }
    protected void onRestart(){
        simVbox.setVisible(false);

    }
}