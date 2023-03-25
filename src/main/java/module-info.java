module hoohacks.restaurants {
    requires javafx.controls;
    requires javafx.fxml;


    opens hoohacks.restaurants to javafx.fxml;
    exports hoohacks.restaurants;
}