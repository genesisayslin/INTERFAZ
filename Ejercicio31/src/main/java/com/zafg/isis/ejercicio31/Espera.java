package com.zafg.isis.ejercicio31;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;

public class Espera extends Thread {

    private ProgressBar barra;
    private Button boton;

    public Espera(ProgressBar barra, Button boton) {
        this.barra = barra;
        this.boton = boton;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                Thread.sleep(100); // 100 x 100 ms = 10 segundos
                double avance = i / 100.0;
                Platform.runLater(() -> barra.setProgress(avance));
            }
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }
        Platform.runLater(() -> boton.setDisable(false));
    }
}
