package com.company;

public class UniApp {
    public static void main(String[] args) {
        Date birthday3 = new Date(4,5,2010);
        Date birthday1 = new Date(4,5,2000);
        Date birthday2 = new Date(18,5,2890);


    Student s1 = new Student("Constantin huso",birthday2,69420,3);
    Professor prof1 = new Professor("hr Maier",birthday1,"albsig","echnische Informatik",300f,birthday3);
    Assisstant as1 = new Assisstant("Klaus Hauser",birthday3,456f,235326,birthday2);
    System.out.println(prof1.toString());
    System.out.println(as1.toString());
    System.out.println("Constantin spielt mit dem Feuer, klein Cockstantin");

    }
}
