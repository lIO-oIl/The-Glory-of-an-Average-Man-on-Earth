import Jared_Stuff.Mob_System.Mob;
import Jared_Stuff.Mob_System.allMobs;
import java.util.ArrayList;
import java.util.List;

public class Town
{
    public List<Mob> mob = allMobs.getGameMobs();
    public String current = "action"; //action, combat
    int rand = (int)Math.random() * 99 + 1;
    int zoneCompletion = 0;

    public void runZone(Location town, int input)
    {
        System.out.println("Town");
    }
}