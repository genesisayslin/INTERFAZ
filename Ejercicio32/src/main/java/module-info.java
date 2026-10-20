module com.zafg.isis.ejercicio32 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.zafg.isis.ejercicio32 to javafx.fxml;
    exports com.zafg.isis.ejercicio32;
}
