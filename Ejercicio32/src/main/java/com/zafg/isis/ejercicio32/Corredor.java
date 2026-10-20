package com.zafg.isis.ejercicio32;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public abstract class Corredor extends Thread {

    protected String nombre;
    protected ProgressBar barra;
    protected Label etiqueta;

    public Corredor(String nombre, ProgressBar barra, Label etiqueta) {
        this.nombre = nombre;
        this.barra = barra;
        this.etiqueta = etiqueta;
    }

    protected void avanzar(double progreso) {
        Platform.runLater(() -> barra.setProgress(progreso));
    }

    protected void decir(String estado) {
        Platform.runLater(() -> etiqueta.setText(nombre + ": " + estado));
    }
}
