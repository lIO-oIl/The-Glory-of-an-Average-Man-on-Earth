import java.util.ArrayList;
import java.util.List;

public class Zone
{
    public List<Mob> mob = allMobs.getGameMobs();
    public String current = "action"; //action, combat
    int rand = (int)Math.random() * 99 + 1;
    int zoneCompletion = 0;

    public void runZone(Location zone, int input)
    {
        if(current.equals("action")){
            if(input == 1)
                search();
            if(input == 2)
                scout();
        }
        if(current.equals("combat")){
            if(input == 1){}
        }
    }

    public void scout() {
        if (rand <= 10)
        {
            findMob();
        }
    }

    public void search() {
        if (rand <= 70)
        {
            findMob();
        }
        else
            zoneCompletion++;
    }

    public void findMob() {
        current = "combat";
        Mob randMob = mob.get((int)Math.random() * mob.size());

    }
}