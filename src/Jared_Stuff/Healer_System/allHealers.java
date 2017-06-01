package Jared_Stuff.Healer_System;
import Jared_Stuff.Mob_System.Mob;

import java.util.ArrayList;
import java.util.List;

public class allHealers
{
    public static List<Healer> gameHealers = new ArrayList<Healer>();

    public static void createHealer()
    {
        Healer Ariadna = new Healer("Ariadna", "Hello chosen one, I can heal your wounds.", 5, 10);
        gameHealers.add(Ariadna);
        Healer Arianna = new Healer("Arianna", "Hello mortal, I am here for assistance.", 10, 20);
        gameHealers.add(Arianna);
        Healer Athena = new Healer("Athena", "Hi, do you need help?", 20, 40);
        gameHealers.add(Athena);
        Healer Alexys = new Healer("Alexys", "sup fam. u need a heal o sumfin?", 1, 100);
        gameHealers.add(Alexys);
    }

    public static List getGameHealers()
    {
        return gameHealers;
    }
}