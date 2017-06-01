package Jared_Stuff.Healer_System;

import java.util.ArrayList;
import java.util.List;

public class TownHealers
{
    public static List<Healer> TownHealers = new ArrayList<Healer>();

    public static void returnHealers()
    {
        List<Healer> items = allHealers.getGameHealers();
        for (Healer i : items)
        {
            Healer healer = i;
            TownHealers.add(healer);
        }
        for (Healer i: TownHealers)
        {
            System.out.println(i.getName() +
                    "\n" + i.getGreeting() +
                    "\nHeal: " + i.getHeal() +
                    "\nCost:" + i.getCost());
        }
    }
}