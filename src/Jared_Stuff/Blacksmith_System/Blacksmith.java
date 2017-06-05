package Jared_Stuff.Blacksmith_System;

public class Blacksmith
{
    public String name, greeting;
    public int upgrade, cost;

    public Blacksmith (String n, String g, int u, int c)
    {
        name = n;
        greeting = g;
        upgrade = u;
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

    public int getUpgrade()
    {
        return upgrade;
    }
    public int getCost()
    {
        return cost;
    }
}