package com.ccc.cmaradecomerciodecasanare.model;

public class Consulta {

    public int matricula;

    public String razon_social, organizacion_juridica, estado, nombre_camara;

    public Consulta(int matricula, String razon_social, String organizacion_juridica, String estado, String nombre_camara) {
        this.matricula = matricula;
        this.razon_social = razon_social;
        this.organizacion_juridica = organizacion_juridica;
        this.estado = estado;
        this.nombre_camara = nombre_camara;
    }

    public Consulta() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getOrganizacion_juridica() {
        return organizacion_juridica;
    }

    public void setOrganizacion_juridica(String organizacion_juridica) {
        this.organizacion_juridica = organizacion_juridica;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre_camara() {
        return nombre_camara;
    }

    public void setNombre_camara(String nombre_camara) {
        this.nombre_camara = nombre_camara;
    }
}
