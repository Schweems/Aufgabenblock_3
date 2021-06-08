package com.company;
import java.time.LocalDate;


public class Date {
    private final int Day;
    private final int Month;
    private int Year;

    public Date(Date obj) {
        Day = obj.Day;
        Month = obj.Month;
        Year = obj.Year;
    }

    public Date(int day, int month, int year) {
        Year = year;
        int MaximumTagemomMonat = 0;
        Month = month;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                MaximumTagemomMonat = 31;
                break;
            case 4, 6, 9, 11:
                MaximumTagemomMonat = 30;
                break;
            case 2:
                MaximumTagemomMonat = 28;
                break;
            default:
                System.out.println("DU DUMMER HUND");

        }
        if (day <= MaximumTagemomMonat)
            Day = day;

        else {
            System.out.println("DU DUMMER HUND");
            throw new IllegalArgumentException("Falsche variable");
        }
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }

    public Date() {
        Day=1;
        Month=1;
        Year= 1900;
    }
    public void setYear(int year) {
        Year = year;
    }

    public int compareDate(Date x) {
        int ret = 0;
        ret =  this.getYear() - x.getYear();
        return ret;
    }


    public static Date today() {
        LocalDate today=LocalDate.now();
        Date date = new Date(today.getDayOfMonth(), today.getMonthValue(), today.getYear());
        return date;
    }
    @Override
    public String toString(){
        return this.Day+"/"+this.Month+"/"+this.Year;
    }
}
