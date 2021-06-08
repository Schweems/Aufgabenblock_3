package com.company;


public abstract class Employee extends Person {
    private Date Einstellungsdatum;
    private float gehalt;
    public Employee(String name, Date gebdatum, float gehalt, Date eindatum ) {
        super(name,gebdatum);
            //super(name, gebdatum);
            if(eindatum.compareDate(gebdatum)>=20) {
                this.Einstellungsdatum = eindatum;
            }
            else {
                System.out.println("der mann hat zu wenig Berufserfahrung mensch");
            }
            if(100>=gehalt) {
                System.out.println("Das Gehalt des Professors ist zu niedrig.");
            }
            else if(500<=gehalt) {
                System.out.println("Das Gehalt ist zu hoch");
            }
            else {
                this.gehalt = gehalt;
            }

    }

    public Date getEindatum() {
        return Einstellungsdatum;
    }

    public void setEindatum(Date eindatum) {
        this.Einstellungsdatum = eindatum;
    }

    public float getGehalt() {
        return gehalt;
    }

    public void setGehalt(float gehalt) {
        this.gehalt = gehalt;
    }
}


