package Jared_Stuff.Inventory_System;

public class Item
{
	public String name, description;
	public int damage, buy, sell;
	
	public Item (String n, String d, int dmg, int b, int s)
	{
		name = n;
		description = d;
		damage = dmg;
		buy = b;
		sell = s;
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
	public int getBuy()
	{
		return buy;
	}
	public int getSell()
	{
		return sell;
	}
}