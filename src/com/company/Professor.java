package com.company;

public class Professor extends Employee {
    String fakul;
    String gebiet;

    @Override
    public String toString() {
        return "Professor{" +
                "Name='" + this.Name + '\'' +
                ", Gebdatum=" + this.Gebdatum +
                ", fakul='" + this.fakul + '\'' +
                ", gebiet='" + this.gebiet + '\'' +
                ", eindatum=" + getEindatum() +
                ", gehalt=" + getGehalt() +
                '}';
    }

    public Professor(String name, Date gebdatum, String fakul, String gebiet,float gehalt, Date eindatum ) {
        super(name, gebdatum, gehalt, eindatum);
        this.fakul = fakul;
        this.gebiet = gebiet;


    }

    public String getFakul() {
        return fakul;
    }

    public void setFakul(String fakul) {
        this.fakul = fakul;
    }

    public String getGebiet() {
        return gebiet;
    }

    public void setGebiet(String gebiet) {
        this.gebiet = gebiet;
    }

}
