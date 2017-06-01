package Jared_Stuff.Mob_System;

import java.util.ArrayList;
import java.util.List;

public class Enemies
{
    public static List<Mob> Enemies = new ArrayList<Mob>();

    public static void returnMobs()
    {
        List<Mob> items = allMobs.getGameMobs();
        for (Mob i : items)
        {
            Mob mob = i;
            Enemies.add(mob);
        }
        for (Mob i: Enemies)
        {
            System.out.println(i.getName() +
                    "\n" + i.getDescription() +
                    "\nDamage: " + i.getDamage() +
                    "\n Health:" + i.getHealth());
        }
    }
}