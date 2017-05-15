import java.util.ArrayList;
import java.util.List;

public class allItems
{
	public static List<Item> gameItems = new ArrayList<Item>();
	
	public static void createWeapons()
	{
		Item FireSword = new Item("Sword of Fire", "The blade is hot.", 15);
		gameItems.add(FireSword);
	}
	
	public static List getGameItems()
	{
		return gameItems;
	}
}