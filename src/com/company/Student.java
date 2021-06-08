package com.company;

public class Student extends Person{
    int matnmr;
    int sem;

    public Student(String name, Date gebdatum, int matnmr, int sem) {
        super(name, gebdatum);
        this.matnmr = matnmr;
        if (sem <= 0) {
            System.out.println("Fehlerhaftes Semester");
        }
        else {
            this.sem = sem;
        }
    }

    public int getMatnmr() {
        return matnmr;
    }

    public void setMatnmr(int matnmr) {
        this.matnmr = matnmr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Gebdatum=" + Gebdatum +
                ", matnmr=" + matnmr +
                ", sem=" + sem +
                '}';
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }
}
