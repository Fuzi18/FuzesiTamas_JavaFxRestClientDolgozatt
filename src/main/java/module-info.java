module hu.petrik.fuzesitamas_javafxrestclientdolgozat {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens hu.petrik.fuzesitamas_javafxrestclientdolgozat to javafx.fxml;
    exports hu.petrik.fuzesitamas_javafxrestclientdolgozat;
}