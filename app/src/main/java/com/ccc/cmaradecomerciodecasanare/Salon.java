package com.ccc.cmaradecomerciodecasanare;

import java.io.Serializable;

public class Salon  implements Serializable {

    private String titulo;
    private int imageId;
    private String especificaciones;

    public Salon(String titulo, int imageId, String especificaciones) {
        this.titulo = titulo;
        this.imageId = imageId;
        this.especificaciones = especificaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }
}
