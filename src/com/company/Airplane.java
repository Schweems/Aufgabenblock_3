package com.company;

import java.time.LocalTime;

public abstract class Airplane extends FlyingBody implements Landable{

    public final static int DEFAULT_MAX_SPEED = 100;
    public final static int DEFAULT_WINGS_COUNT = 1;
    private String manufacturer; // Herstellername
    private int maxSpeed = DEFAULT_MAX_SPEED; // Max. Geschwindigkeit > 0
    private int wingsCount = DEFAULT_WINGS_COUNT; // Anzahl Flügelpaare > 0
    public Airplane(String manufacturer, int maxSpeed, int wingsCount) {
        super(manufacturer,maxSpeed);
        setManufacturer(manufacturer);
        setWingsCount(wingsCount);
        setMaxSpeed(maxSpeed);
    }
    public String getManufacturer() { return this.manufacturer; }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getMaxSpeed() { return this.maxSpeed; }
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0)
            this.maxSpeed = maxSpeed;
    }
    public int getWingsCount() { return this.wingsCount; }
    public void setWingsCount(int wingsCount) {
        if (wingsCount > 0)
            this.wingsCount = wingsCount;
    }
    // per default soll ein Flugzeug keinen looping können
    public boolean getLooping() {
        if (this.getClass()== DoubleDecker.class){
            return this.getLooping(((DoubleDecker) this).getAktgeschw(),((DoubleDecker) this).cockpit);
        }else {
            return false;
        }
            }


    public abstract boolean getLooping(int aktgeschw, boolean cockpit);

    @Override
    public String toString() {
        return "Airplane [manufacturer=" + manufacturer + ", maxSpeed=" +
                maxSpeed + ", wingsCount=" + wingsCount + "]";
    }

}