package Jared_Stuff.Blacksmith_System;
import Jared_Stuff.Mob_System.Mob;

import java.util.ArrayList;
import java.util.List;

public class allBlacksmiths
{
    public static List<Blacksmith> gameBlacksmiths = new ArrayList<Blacksmith>();

    public static void createBlacksmith()
    {
        Blacksmith Ackerley = new Blacksmith("Ackerley", "Hello chosen one, I am here to upgrade your weapons.", 5, 50);
        gameBlacksmiths.add(Ackerley);
        Blacksmith Adney = new Blacksmith("Adney", "Hello mortal, I am here for assistance. What weapons do you wish to upgrade?", 10, 100);
        gameBlacksmiths.add(Adney);
        Blacksmith Aeduuard = new Blacksmith("Aeduuard", "Hi, do you need help? I guess I can assist...", 20, 200);
        gameBlacksmiths.add(Aeduuard);
        Blacksmith Aeduuin = new Blacksmith("Aeduuin", "sup fam. u need a 'grade o sumfin?", 1, 1000);
        gameBlacksmiths.add(Aeduuin);
    }

    public static List getGameBlacksmith()
    {
        return gameBlacksmiths;
    }
}