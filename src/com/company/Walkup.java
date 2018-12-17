package com.company;

public class Walkup extends Ticket{
    private double price;
    public Walkup()
    {
        this.price = getPrice();
    }

    public double getPrice() {
        return 50.0;
    }
}
