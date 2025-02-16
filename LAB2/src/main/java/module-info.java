module com.example.personapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.personapp to javafx.fxml;
    exports com.example.personapp;
}