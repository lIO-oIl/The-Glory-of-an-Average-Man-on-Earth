import java.util.ArrayList;
import java.util.List;

public class Zone
{
    public List<Mob> mob = allMobs.getGameMobs();
    public String current = "action"; //action, combat
    int rand = (int)Math.random() * 99 + 1;
    int zoneCompletion = 0;
    Mob randMob;
    Location zone;
    int playerHealth = 5000;

    public void runZone(Location z, int input)
    {
        zone = z;
        zoneCompletion = zone.getProgress();
        if(current.equals("action")){
            if(input == 1)
                search();
                System.out.println("searched");
            if(input == 2)
                scout();
                System.out.println("scouted");
        }
        if(current.equals("combat")){
            if(input == 1){
                if(randMob.getHealth() > 0) {
                    randMob.setHealth(randMob.getHealth() - 1);
                    playerHealth -= randMob.getDamage();
                    System.out.println("Mob:" + randMob.getHealth());
                    System.out.println("Player:" + playerHealth);
                }
                else {
                    current = "action";
                    zone.setCompletion(zoneCompletion);
                    System.out.println("Done");
                }
            }
        }
    }

    public void scout() {
        rand = (int)(Math.random() * 99 + 1);
        if (rand <= 10)
        {
            findMob();
            System.out.println("Mob Found");
        }
    }

    public void search() {
        rand = (int)(Math.random() * 99 + 1);
        if (rand <= 70)
        {
            findMob();
            System.out.println("Mob Found");
        }
        else
            if(zoneCompletion < 20)
                zoneCompletion++;
    }

    public void findMob() {
        randMob = mob.get((int)(Math.random() * mob.size()));
        current = "combat";
    }
}