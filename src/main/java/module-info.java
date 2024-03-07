module com.example.jaskaran_lab3_csd_214 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.jaskaran_lab3_csd_214 to javafx.fxml;
    exports com.example.jaskaran_lab3_csd_214;
}