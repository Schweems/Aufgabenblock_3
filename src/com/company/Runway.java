package com.company;


public class Runway {
    private static final int Default_Bahnlaenge = 100;
    private static final int Default_Bahnbreite = 50;
    private int Bahnlaenge;
    private int Bahnbreite;

    public Runway(int bahnlaenge, int bahnbreite) throws IllegalArgumentException{
        setBahnlaenge(bahnlaenge);
        setBahnbreite(bahnbreite);
    }
    public Runway(Runway runway){
        this.Bahnlaenge=runway.getBahnlaenge();
        this.Bahnbreite=runway.getBahnbreite();
    }


    public Runway() {
        Bahnlaenge=Default_Bahnlaenge;
        Bahnbreite=Default_Bahnbreite;
    }

    public void setBahnlaenge(int bahnlaenge) {
        if ( bahnlaenge > 0){
            Bahnlaenge = bahnlaenge;}
        else{
            throw new IllegalArgumentException("Keine zulässige Länge. Länge wird auf DEFAULT gesetzt");

        }
    }

    public void setBahnbreite(int bahnbreite) {
        if ( bahnbreite > 0){
            Bahnbreite = bahnbreite;;}
        else {
            throw new IllegalArgumentException("Keine zulässige Breite. Breite wird auf DEFAULT gesetzt");

        }
    }

    public int getBahnlaenge() {
        return Bahnlaenge;
    }

    public int getBahnbreite() {
        return Bahnbreite;
    }

    @Override
    public String toString() {
        return "Runway{" +
                "Bahnlänge=" + Bahnlaenge +
                ", Bahnbreite=" + Bahnbreite +
                '}';
    }
}
