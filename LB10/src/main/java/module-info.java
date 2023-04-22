module com.example.lb10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lb10 to javafx.fxml;
    exports com.example.lb10;
}