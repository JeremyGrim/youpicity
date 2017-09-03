package com.cdi.youpicity.models;

/**
 * Created by grim on 03/09/2017.
 */

public class Etapes {

    private String Adresse;
    private String Indice;


    public Etapes(String adresse, String indice) {
        Adresse = adresse;
        Indice = indice;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getIndice() {
        return Indice;
    }

    public void setIndice(String indice) {
        Indice = indice;
    }
}
