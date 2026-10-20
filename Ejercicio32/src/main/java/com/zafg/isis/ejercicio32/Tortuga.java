package com.zafg.isis.ejercicio32;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Tortuga extends Corredor {

    public Tortuga(ProgressBar barra, Label etiqueta) {
        super("La Tortuga", barra, etiqueta);
    }

    @Override
    public void run() {
        double progreso = 0;

        decir("¡Está corriendo!");
        try {
            while (progreso < 1.0) {
                Thread.sleep(100);
                progreso = progreso + 0.01; // lenta pero constante
                if (progreso > 1.0) {
                    progreso = 1.0;
                }
                avanzar(progreso);
            }
            decir("¡Llegó a la meta!");
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }
    }
}