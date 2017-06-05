public class Zone
{
    public String mob[] = {"Hi"};
    public String current = "action"; //action, combat

    public void runZone(int input)
    {
        if(current.equals("action")){
            if(input == 1)
                search();
            if(input == 2)
                scout();
        }
        if(current.equals("combat")){
            if(input == 1)
                mon set health = mob health - player weapon damage;
        }
    }
}