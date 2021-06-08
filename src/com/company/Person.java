package com.company;

public abstract class Person {
    String Name;
    Date Gebdatum;

    public Person(String name, Date gebdatum) {
        Name=name;
        Gebdatum=gebdatum;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getGebdatum() {
        return Gebdatum;
    }

    public void setGebdatum(Date gebdatum) {
        Gebdatum = gebdatum;
    }
}

