public class Item
{
	public String name, description;
	public int damage;
	
	public Item (String n, String d, int dmg)
	{
		name = n;
		description = d;
		damage = dmg;
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
}