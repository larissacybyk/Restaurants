module hoohacks.restaurants {
    requires javafx.controls;
    requires javafx.fxml;


    opens hoohacks.gui to javafx.fxml;
    exports hoohacks.gui;
}