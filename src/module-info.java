module BookShop {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    requires junit;

    opens main;
    opens main.model;
}