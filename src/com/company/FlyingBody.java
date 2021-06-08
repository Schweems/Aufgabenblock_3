package com.company;

import java.time.LocalTime;

public abstract class FlyingBody {
    private String manufacturer;
    private int maxSpeed;

    public FlyingBody(String manufacturer, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
    }

    public abstract LocalTime calcArrivalTime(LocalTime departure, int distance, boolean flyingWithMaxSpeed);

}
