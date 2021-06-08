package com.company;

public class Vehicle {

    private String owner;
    private int actV;

    public Vehicle(String owner, int actV) {
        this.owner = owner;
        if (actV >= 0) this.actV = actV;
        else System.out.println("Fehler");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getVelocity() {
        return actV;
    }

    public void setVelocity(int actV) {
        if (actV>=0)this.actV = actV;
    }
    public void accelerate(int dV) {
        if (dV>=0) this.setVelocity(this.actV+dV);
    }
    public void decelerate(int dV) {
        if (dV>=0) this.setVelocity(this.actV-dV);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "owner='" + owner + '\'' +
                ", actV=" + actV +
                '}';
    }
}