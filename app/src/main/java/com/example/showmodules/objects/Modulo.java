package com.example.showmodules.objects;

public class Modulo {
    public String modul;
    public String nombreLargo;
    public String profe;

    public Modulo(String modul, String nombreLargo, String profe) {
        this.modul = modul;
        this.nombreLargo = nombreLargo;
        this.profe = profe;
    }

    public String getModul() {
        return modul;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }

    public String getNombreLargo() {
        return nombreLargo;
    }

    public void setNombreLargo(String nombreLargo) {
        this.nombreLargo = nombreLargo;
    }

    public String getProfe() {
        return profe;
    }

    public void setProfe(String profe) {
        this.profe = profe;
    }
}
