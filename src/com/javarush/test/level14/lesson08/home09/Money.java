package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{

    private double DOUBLE;

    public void setDOUBLE(double DOUBLE)
    {
        this.DOUBLE = DOUBLE;
    }

    public double getDOUBLE()
    {
        return DOUBLE;
    }


    public Money(double amount)
    {
        setDOUBLE(amount);
    }

    public double getAmount(){
       return getDOUBLE();
    }

    public abstract String getCurrencyName();
}

