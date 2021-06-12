package com.company;


public abstract class Employee extends Person {
    private Date Einstellungsdatum;
    private float gehalt;

    public Employee(String name, Date gebdatum, float gehalt, Date eindatum) {
        super(name, gebdatum);
        setEindatum(eindatum);
        setGehalt(gehalt);

    }

    public Date getEindatum() {
        return Einstellungsdatum;
    }

    public void setEindatum(Date eindatum) {
        if (eindatum.compareDate(this.getGebdatum()) >= 20) {
            this.Einstellungsdatum = eindatum;
        } else
            throw new IllegalArgumentException("Falsches Datum");
    }

    public float getGehalt() {
        return gehalt;
    }

    public void setGehalt(float gehalt) {
        if (100 >= gehalt) {
            throw new IllegalArgumentException("Das Gehalt des Professors ist zu niedrig.");
        } else if (500 <= gehalt) { throw  new IllegalArgumentException("Dem Gehalt des Professors ist zu hoch");
        } else {
            this.gehalt = gehalt;
        }
    }
}

