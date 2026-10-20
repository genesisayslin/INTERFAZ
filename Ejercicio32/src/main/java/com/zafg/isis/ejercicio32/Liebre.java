package com.zafg.isis.ejercicio32;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Liebre extends Corredor {

    private Button boton;

    public Liebre(ProgressBar barra, Label etiqueta, Button boton) {
        super("La Liebre", barra, etiqueta);
        this.boton = boton;
    }

    @Override
    public void run() {
        double progreso = 0;
        boolean yaDurmio = false;

        decir("¡Está corriendo!");
        try {
            while (progreso < 1.0) {
                Thread.sleep(100);
                progreso = progreso + 0.03; // rápida
                if (progreso > 1.0) {
                    progreso = 1.0;
                }
                avanzar(progreso);

                if (!yaDurmio && progreso >= 0.5) {
                    yaDurmio = true;
                    decir("¡Se durmió!");
                    Thread.sleep(8000);
                    decir("¡Despertó!");
                }
            }
            decir("¡Llegó a la meta!");
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }
        Platform.runLater(() -> boton.setDisable(false));
    }
}
