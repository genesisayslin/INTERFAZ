package com.zafg.isis.ejercicio32;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    @FXML private Button btnIniciar;
    @FXML private Label lblLiebre;
    @FXML private Label lblTortuga;
    @FXML private ProgressBar pbLiebre;
    @FXML private ProgressBar pbTortuga;

    @FXML
    private void iniciar() {
        btnIniciar.setDisable(true);
        pbLiebre.setProgress(0);
        pbTortuga.setProgress(0);

        Liebre liebre = new Liebre(pbLiebre, lblLiebre, btnIniciar);
        Tortuga tortuga = new Tortuga(pbTortuga, lblTortuga);

        liebre.setDaemon(true);
        tortuga.setDaemon(true);
        liebre.start();
        tortuga.start();
    }
}
