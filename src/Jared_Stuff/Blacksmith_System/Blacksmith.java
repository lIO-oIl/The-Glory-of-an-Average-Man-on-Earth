package Jared_Stuff.Blacksmith_System;

import Jared_Stuff.Inventory_System.Item;

public class Blacksmith
{
    public String name, greeting;
    public int upgrade, cost;
    public Item item;

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

    public int action(int newDamage){
        newDamage = (item.getDamage() + getUpgrade());
        return newDamage;
    }
}