package hoohacks.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
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
    private FlowPane simFPane; // changed from VBox simVBox

    @FXML
    private Button exitButton;

    @FXML
    private ScrollBar sBar;

    public void initialize(){
        startVbox.setVisible(true);
        starting.setVisible(true);
        simulation.setVisible(false);
        goButton.setOnAction(e -> {
            onGoButton();
        });
        exitButton.setOnAction(e ->{
            onExitButton();
        });
    }
    protected void onGoButton(){
        //run simulation with file
        //path = filePath.getText();
        startVbox.setVisible(false);
        simulation.setVisible(true);
        System.out.println("go pressed");

    }
    protected void onRestart(){
        simFPane.setVisible(false);

    }

    protected void onExitButton(){
        Platform.exit();
    }
}