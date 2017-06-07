public class Mob
{
	public String name, description;
	public int damage, health;

	public Mob (String n, String d, int dmg, int h)
	{
		name = n;
		description = d;
		damage = dmg;
        health = h;
	}

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	public int getDamage()
	{
		return damage;
	}

    public int getHealth()
    {
        return health;
    }

	public void setHealth(int h) {
		health = h;
	}
}