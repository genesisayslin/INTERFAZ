module com.zafg.isis.ejercicio31 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.zafg.isis.ejercicio31 to javafx.fxml;
    exports com.zafg.isis.ejercicio31;
}
