package com.company;

import java.time.LocalTime;

public class TestFlyingBody {
    public static void main(String[] args) {
    //testTransportAircraft();
    testDoubleDecker();
    //testRunway();



    }
    public static void testTransportAircraft(){
        TransportAircraft Doner =  new TransportAircraft("Klaus",500,2,"Klausfluege",10,400,50,50);
        System.out.println(Doner);
        LocalTime time = LocalTime.now();
        System.out.println("get maxSpeed "+Doner.getMaxSpeed());
        System.out.println("get name "+Doner.getName());
        System.out.println("get Reisegeschw "+Doner.getReisegeschwindigkeit());
        System.out.println("Looping "+Doner.getLooping());
        System.out.println("wingscount "+Doner.getWingsCount());
        System.out.println("manufacturer "+Doner.getManufacturer());
        System.out.println(Doner.calcArrivalTime(time,2000,false));
        Runway runway1 = new Runway();
        System.out.println(Doner.landingcheck(runway1));
        Doner = null;
        System.gc();
    }
    public static void testDoubleDecker(){
        DoubleDecker DeineFeddeHummel = new DoubleDecker("Svenja",400,4,380,false,100,50);
        Runway runway1 = new Runway(3000,4000);
        System.out.println(DeineFeddeHummel.landingcheck(runway1));
        System.out.println(DeineFeddeHummel);
        System.out.println("get maxSpeed "+DeineFeddeHummel.getMaxSpeed());


        System.out.println("Looping "+DeineFeddeHummel.getLooping());
        System.out.println("wingscount "+DeineFeddeHummel.getWingsCount());
        System.out.println("manufacturer "+DeineFeddeHummel.getManufacturer());

        LocalTime time = LocalTime.now();
        System.out.println(DeineFeddeHummel.calcArrivalTime(time,4560,true));

        DeineFeddeHummel = null;

        System.gc();

    }
    public static void testRunway(){
        Runway runway1 = new Runway();
        Runway runway2 = new Runway(300,400);
        Runway runway3 = new Runway(runway1);
        System.out.println(runway1);
        System.out.println(runway2);
        System.out.println(runway3);
        System.out.println(runway2.getBahnbreite());
        System.out.println(runway2.getBahnlaenge());
        runway2.setBahnlaenge(4000);
        runway2.setBahnbreite(4000);
        System.out.println(runway2);
        runway1 = null;
        runway2 = null;
        runway3 = null;
        System.gc();

    }
}
