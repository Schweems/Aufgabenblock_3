package com.company;

import java.time.LocalTime;

public class DoubleDecker extends Airplane{
    private static final int LOOPING_SPEED = 320;
    private int aktgeschw;
    boolean cockpit ;//true = offen / false = geschlossen


    public DoubleDecker(String manufacturer, int maxSpeed, int wingsCount, int aktgeschw, boolean cockpit,int runwaylength, int runwaywidth) {
        super(manufacturer, maxSpeed, wingsCount,runwaylength, runwaywidth);
        this.aktgeschw = aktgeschw;
        this.cockpit = cockpit;
        try {
            getLooping(aktgeschw, cockpit);
            testWingsCount(wingsCount);
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException(e);

        }
    }

    public DoubleDecker(String manufacturer, int maxSpeed, int wingsCount,int runwaylength, int runwaywidth) {
        super(manufacturer, maxSpeed, wingsCount,runwaylength, runwaywidth);
        this.cockpit = true;
        getLooping(aktgeschw,cockpit);
    }

    @Override
    public boolean getLooping(int aktgeschw, boolean cockpit) {
        return aktgeschw >= LOOPING_SPEED && !cockpit;
    }

    public void testWingsCount(int wingscount) {
        if (wingscount != 4) { throw new IllegalArgumentException("mehr/weniger als 4 Fluegel");
        }

    }

    public int getAktgeschw() {
        return aktgeschw;
    }

    @Override
    public String toString() {
        return "DoubleDecker{" +
                ", cockpit = " + cockpit +
                ", wingsCount = " + getWingsCount() +
                ", maxSpeed = " + getMaxSpeed() +
                ", manufacturer = " +getManufacturer() +
                ", LoopingMoeglich = " + getLooping(aktgeschw,cockpit) +
                '}';
    }
    @Override
    public LocalTime calcArrivalTime(LocalTime departure, int distance,boolean test) {
        long time = (long) distance / this.getMaxSpeed();
        return departure.plusHours(time);

    }

    @Override
    public boolean landingcheck(Runway r) {
        return r.getBahnlaenge() >= this.getRunwaylength() && r.getBahnbreite() >= this.getRunwaywidth() ;
    }
}
