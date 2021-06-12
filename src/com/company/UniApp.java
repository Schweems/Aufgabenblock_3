package com.company;

public class UniApp {
    public static void main(String[] args) {
        Date birthday1 = new Date(4,5,1900);
        Date birthday2 = new Date(4,5,1950);
        Date birthday3 = new Date(18,5,1970);


    Student s1 = new Student("Constantin",birthday2,69420,3);
    try {
        Professor prof1 = new Professor("hr Maier",birthday1,"albsig","echnische Informatik",300f,birthday3);
        System.out.println(prof1);
    }catch (IllegalArgumentException e){
        System.out.println("Prof konnte nich erstellt werden" + e);
    }
    try {
        Assisstant as1 = new Assisstant("Klaus Hauser",birthday1,456f,235326,birthday2);
        System.out.println(as1);
    }catch (IllegalArgumentException e){
        System.out.println("Aassistent konnte nich erstellt werden" + e);
    }




    }
}
