package hoohacks.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class HelloController {
    @FXML
    private StackPane simulation;

    @FXML
    private Slider timeSlider;

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

    @FXML
    private HBox startHBox;

    public void initialize(){
        startVbox.setVisible(true);
        starting.setVisible(true);
        startHBox.setVisible(true);
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