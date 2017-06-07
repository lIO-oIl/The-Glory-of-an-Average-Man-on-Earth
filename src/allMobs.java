import java.util.ArrayList;
import java.util.List;

public class allMobs
{
    public static List<Mob> gameMobs = new ArrayList<Mob>();

    public static void createMobs()
    {
        Mob Crab = new Mob("Crab", "Formally known by Brachyura, the crab is very basic and can be easily taken down.", 2, 10);
        gameMobs.add(Crab);
        Mob Robot = new Mob("Robot", "Manufactured in the Constructors' various factories, robots are dangerous in numbers.", 4, 20);
        gameMobs.add(Robot);
        Mob Knight = new Mob("Knight", "Now simply confused by their anachronism, knights are formidable opponents nonetheless.", 8, 40);
        gameMobs.add(Knight);
        Mob Wizard = new Mob("Wizard", "Transported into this realm from outside our omniverse.", 16, 80);
        gameMobs.add(Wizard);
		Mob Lizard = new Mob("Lizard", "Cool looking descendent from the dinosaurs, the lizard is more hiss than bite anyway.", 3, 15);
        gameMobs.add(Lizard);
		Mob Criminal = new Mob("Criminal", "He's just robbed a bank and is now on the run!", 6, 30);
        gameMobs.add(Criminal);
		Mob Archer = new Mob("Archer", "Long range destruction? Yes! Little wimpy dudes? ... also yes.", 16, 30);
        gameMobs.add(Archer);
		Mob Ghoul = new Mob("Ghoul", "Take it as you will... these dudes straight up are creepy.", 16, 80);
        gameMobs.add(Ghoul);
    }

    public static List getGameMobs()
    {
        return gameMobs;
    }
}