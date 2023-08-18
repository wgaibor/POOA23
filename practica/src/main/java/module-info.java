module com.example.parcial {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.parcial to javafx.fxml;
    exports com.example.parcial;
}
