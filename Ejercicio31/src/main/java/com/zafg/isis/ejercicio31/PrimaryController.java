package com.zafg.isis.ejercicio31;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {

    private int clics = 0;

    @FXML private TextField txtClics;
    @FXML private ProgressBar pbEspera;
    @FXML private Button btnEsperar;

    @FXML
    private void contar() {
        clics++;
        txtClics.setText(clics + "");
    }

    @FXML
    private void esperar() {
        btnEsperar.setDisable(true);
        pbEspera.setProgress(0);

        Espera hilo = new Espera(pbEspera, btnEsperar);
        hilo.setDaemon(true);
        hilo.start();
    }
}
