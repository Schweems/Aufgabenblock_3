package com.company;

import java.time.LocalTime;

public class TransportAircraft extends Airplane {
    private final String NameGessellschafft;
    private int MaxPassagiere;
    private int Reisegeschwindigkeit;



    public TransportAircraft(String manufacturer, int maxSpeed, int wingsCount, String nameGessellschafft, int maxPassagiere, int reisegeschwindigkeit,int runwaylength, int runwaywidth) throws IllegalArgumentException {
        super(manufacturer, maxSpeed, wingsCount,runwaylength,runwaywidth);
        NameGessellschafft = nameGessellschafft;

        try {
                setMaxPassagiere(maxPassagiere);
                setReisegeschwindigkeit(reisegeschwindigkeit);
                testWingsCount(wingsCount);
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException(e);
        }


    }


    public void setMaxPassagiere(int maxPassagiere) {
        if (maxPassagiere > 0) {
            MaxPassagiere = maxPassagiere;
        } else {
            throw new IllegalArgumentException("zu wenig Passagiere");
            //System.out.println("Sven macht scheiss gliederung");
        }
    }

    public void setReisegeschwindigkeit(int reisegeschwindigkeit) {
        if ((this.getMaxSpeed() > reisegeschwindigkeit) && (reisegeschwindigkeit > 0)) {
            Reisegeschwindigkeit = reisegeschwindigkeit;
        } else {
            System.out.println(this.getMaxSpeed());
            System.out.println(reisegeschwindigkeit);
            throw new IllegalArgumentException("Reisegeschwindigkeit zu gross/klein");

        }
    }

    public int getReisegeschwindigkeit() {
        return Reisegeschwindigkeit;
    }


    @Override
    public boolean getLooping(int aktgeschw, boolean cockpit) {
        return false;
    }

    @Override
    public String toString() {
        return "TransportAircraft{" +
                "NameGessellschafft= '" + NameGessellschafft + '\'' +
                ", MaxPassagiere= " + MaxPassagiere +
                ", Reisegeschwindigkeit= " + Reisegeschwindigkeit +
                ",MaxSpeed= " + getMaxSpeed() +
                ", Manufacturer= " + getManufacturer() +
                ", Fluegel= " + getWingsCount() +
                '}';
    }

    public String getName() {
        return NameGessellschafft;
    }

    public void testWingsCount(int wingscount) {
        if (wingscount != 2) { throw new IllegalArgumentException("mehr/weniger als 2 Fluegel");
        }
    }
    @Override
    public LocalTime calcArrivalTime(LocalTime departure, int distance, boolean flyingWithMaxSpeed) {
        long time;
        if (flyingWithMaxSpeed)time = (long) distance / this.getMaxSpeed();
        else time = (long) distance / this.getReisegeschwindigkeit();

        return departure.plusHours(time);
    }

    @Override
    public boolean landingcheck(Runway r) {
        return r.getBahnlaenge() >= this.getRunwaylength() && r.getBahnbreite() >= this.getRunwaywidth() ;
    }
}
