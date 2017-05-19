import java.util.ArrayList;
import java.util.List;

public class allItems
{
	public static List<Item> gameItems = new ArrayList<Item>();
	
	public static void createWeapons()
	{
		Item FireSword = new Item("Sword of Fire", "The blade is hot. It is crafted by hot pressing the blade between dual layered glass sheets. Originally forged in the elven alps, the sword is actually pretty cool despite being lit.", 15);
		gameItems.add(FireSword);
		Item IceStaff = new Item("Staff of Ice", "Made popular by Commanders, the ice staff is often used alongside a Rolly on the wris. The staff can only be created by a experienced wizard in the craft.", 15);
		gameItems.add(IceStaff);
		Item ElderBow= new Item("Elder Bow", "It is whittled from a 1000 year old elder tree. This bow was first created by the Mjolnir Elders and is now almost only used by the most skilled and flexin.", 20);
		gameItems.add(ElderBow);
		Item Stone = new Item("A Stone", "A rock. Literally that's it.", 2);
		gameItems.add(Stone);
		Item EbonyAxe = new Item("Ebony Axe", "Crafted by only the most elegant of materials, it's really just a cool axe. This is the weapon of choice by dark knights.", 18);
		gameItems.add(EbonyAxe);
		Item SteelWarhammer = new Item("Steel Warhammer", "A really heavy hammer, utlilized stereotypically by dwarves. It is shaved dowm from a single massive block of steel.", 25);
		gameItems.add(SteelWarhammer);
		Item IronDagger = new Item("Iron Dagger", "Factory produced and made with only ambivalence, it's really nothing like Assassin's Creed. You would be better off by attacking with a orcish butter knife.", 5);
		gameItems.add(IronDagger);
		Item LongBow = new Item("Long Bow", "It can be carved from any type fo wood. Conceptualized by the early elves, it's for when a short bow won't cut it.", 15);
		gameItems.add(LongBow);
		Item Lance = new Item("Lance", "This is a long pointy weapon, not to be confused with Lance Gong. It is used in the worst possible sport: jousting.", 35);
		gameItems.add(Lance);
		Item CodersSword = new Item("Coder's Sword", "Forged from the bowels of Room 114, this is the Coder's go to weapon. Many hours and keyboards were sacrificed for its creation.", -10);
		gameItems.add(CodersSword);
		
	}
	
	public static List getGameItems()
	{
		return gameItems;
	}
}