package Jared_Stuff.Blacksmith_System;

import java.util.ArrayList;
import java.util.List;

public class TownBlacksmith
{
    public static List<Blacksmith> TownBlacksmith = new ArrayList<Blacksmith>();

    public static void returnBlacksmith()
    {
        List<Blacksmith> items = allBlacksmiths.getGameBlacksmith();
        for (Blacksmith i : items)
        {
            Blacksmith blacksmith = i;
            TownBlacksmith.add(blacksmith);
        }
        for (Blacksmith i: TownBlacksmith)
        {
            System.out.println(i.getName() +
                    "\n" + i.getGreeting() +
                    "\nHeal: " + i.getUpgrade() +
                    "\nCost:" + i.getCost());
        }
    }
}