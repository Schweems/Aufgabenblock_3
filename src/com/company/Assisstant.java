package com.company;

public class Assisstant extends Employee{
    float gehalt;
    int persnmr;
    Date eindatum;


    public Assisstant(String name, Date gebdatum, float gehalt, int persnmr, Date eindatum) {
        super(name, gebdatum, gehalt, eindatum);

        if (persnmr > 0) {
            this.persnmr = persnmr;
        } else {
            System.out.println("Ungültige personalnummer");

            }
        }
    @Override
    public String toString() {
        return "Assisstant{" +
                "gehalt=" + gehalt +
                ", persnmr=" + persnmr +
                ", eindatum=" + this.getEindatum() +
                ", Name='" + Name + '\'' +
                ", Gebdatum=" + Gebdatum +
                '}';
    }
    }

