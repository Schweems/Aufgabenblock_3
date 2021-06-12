package com.company;

public class VehicleApp {
    public static void main(String[] args) {
        PKW msutang = new PKW("Harald",120,230);
        msutang.print(2);
        System.out.println(msutang);
        msutang.accelerate(40);
        System.out.println(msutang);
        msutang.decelerate(90);
        System.out.println(msutang);
    }
    }

