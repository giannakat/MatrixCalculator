module com.example.matrixcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.matrixcalculator to javafx.fxml;
    exports com.example.matrixcalculator;
}