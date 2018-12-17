package com.company;

public class Advance extends Ticket{
    private int advance;

    public Advance(int days)
    {
        super();
        advance = days;
    }

    public double getPrice()
    {
        if(advance >= 10)
        {
            return 30.0;
        }
        else
        {
            return 40.0;
        }
    }
}
