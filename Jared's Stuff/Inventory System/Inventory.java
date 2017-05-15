import java.util.ArrayList;
import java.util.List;

public class Inventory
{
	public static List<Item> inventory = new ArrayList<Item>();
	
	public static void returnItems()
	{
		inventory.add(allItems.getGameItems.get(0));
		for (Item i: inventory)
		{
			System.out.println(i.getName() +
			"Damage: " + i.getDamage());
		}
	}
	
	public static void giveItem(Item i)
	{
		inventory.add(i);
	}
}