package com.softeng_grup6.vainsfitness.utils;

public class Date {
    private int day = 0;
    private  int month = 0;
    private int year  = 0;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date(){};

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getDate(){
        return ""+this.day+"/"+this.month+"/"+this.year;
    }
}
