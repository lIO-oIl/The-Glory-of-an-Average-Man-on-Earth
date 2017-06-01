package Jared_Stuff.Healer_System;

public class Healer
{
    public String name, greeting;
    public int heal, cost;

    public Healer (String n, String g, int h, int c)
    {
        name = n;
        greeting = g;
        heal = h;
        cost = c;
    }

    public String getName()
    {
        return name;
    }

    public String getGreeting()
    {
        return greeting;
    }

    public int getHeal()
    {
        return heal;
    }
    public int getCost()
    {
        return cost;
    }
}