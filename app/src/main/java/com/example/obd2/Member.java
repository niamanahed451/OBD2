package com.example.obd2;

public class Member {
    String marque;
    String matricule;
    int Panne;

    public Member() {



    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getPanne() {
        return Panne;
    }

    public void setPanne(int panne) {
        Panne = panne;
    }
}
