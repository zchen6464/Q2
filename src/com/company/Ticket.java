package com.company;

public abstract class Ticket {
    private int serialNumber;
    public static int x = 0;
    public Ticket()
    {
        serialNumber = getNextSerialNumber();
        x++;
    }

    public abstract double getPrice();

    public String toString()
    {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    private static int getNextSerialNumber()
    {
        return (int)(Math.random()*100 +(100*x));
    }

}
