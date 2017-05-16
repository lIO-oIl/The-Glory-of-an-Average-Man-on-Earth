import java.util.ArrayList;
import java.util.List;

public class Inventory
{
	public static List<Item> inventory = new ArrayList<Item>();
	
	public static void returnItems()
	{
		List<Item> items = allItems.getGameItems();
		Item item = items.get(0);
		inventory.add(item);
		for (Item i: inventory)
		{
			System.out.println(i.getName() +
			"\n" + i.getDescription() +
			"\nDamage: " + i.getDamage());
		}
	}
	
	public static void giveItem(Item i)
	{
		inventory.add(i);
	}
}