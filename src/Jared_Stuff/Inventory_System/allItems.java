package Jared_Stuff.Inventory_System;

import java.util.ArrayList;
import java.util.List;

public class allItems
{
	public static List<Item> gameItems = new ArrayList<Item>();
	
	public static void createWeapons()
	{
		Item FireSword = new Item("Sword of Fire", "The blade is hot. It is crafted by hot pressing the blade between dual layered glass sheets. Originally forged in the elven alps, the sword is actually pretty cool despite being lit.", 15, 50, 25);
		gameItems.add(FireSword);
		Item IceStaff = new Item("Staff of Ice", "Made popular by Commanders, the ice staff is often used alongside a Rolly on the wris. The staff can only be created by a experienced wizard in the craft.", 15, 50, 25);
		gameItems.add(IceStaff);
		Item ElderBow= new Item("Elder Bow", "It is whittled from a 1000 year old elder tree. This bow was first created by the Mjolnir Elders and is now almost only used by the most skilled and flexin.", 20, 70, 35);
		gameItems.add(ElderBow);
		Item Stone = new Item("A Stone", "A rock. Literally that's it.", 2, 10, 5);
		gameItems.add(Stone);
		Item EbonyAxe = new Item("Ebony Axe", "Crafted by only the most elegant of materials, it's really just a cool axe. This is the weapon of choice by dark knights.", 18, 60, 30);
		gameItems.add(EbonyAxe);
		Item SteelWarhammer = new Item("Steel Warhammer", "A really heavy hammer, utlilized stereotypically by dwarves. It is shaved down from a single massive block of steel.", 25, 80, 40);
		gameItems.add(SteelWarhammer);
		Item IronDagger = new Item("Iron Dagger", "Factory produced and made with only ambivalence, it's really nothing like Assassin's Creed. You would be better off by attacking with a orcish butter knife.", 5, 20, 10);
		gameItems.add(IronDagger);
		Item LongBow = new Item("Long Bow", "It can be carved from any type fo wood. Conceptualized by the early elves, it's for when a short bow won't cut it.", 15, 50, 25);
		gameItems.add(LongBow);
		Item Lance = new Item("Lance", "This is a long pointy weapon, not to be confused with Lance Gong. It is used in the worst possible sport: jousting.", 35, 120, 60);
		gameItems.add(Lance);
		Item CodersSword = new Item("Coder's Sword", "Forged from the bowels of Room 114, this is the Coder's go to weapon. Many hours and keyboards were sacrificed for its creation.", -10, 1000, 0);
		gameItems.add(CodersSword);
		Item Crossbow = new Item ("Crossbow", "A drastic improvement on the slow, weak bow, the crossbow offers a cheap way out of true skill. Only the weak choose this unsporty weapon.", 25, 80, 40);
				gameItems.add(Crossbow);
		Item Mace = new Item ("Mace", "Not to be confused with pepper spray, this is really just a big stick with a rock on the end of it.", 20, 70, 35);
		gameItems.add(Mace);
		Item GlassAxe = new Item ("Glass Axe", "An ironically brittle weapon, the glass axe gets its potency from the glass splinters it leaves in its victims.", 25, 60, 30);
		gameItems.add(GlassAxe);
		Item Machete = new Item ("Machete", "Honestly, just a sword with some swagger. Popularized by the 2010 hit movie Machete.", 20, 70, 35);
		gameItems.add(Machete);
		Item Flail = new Item ("Flail", "To put simply, its a mace with a chain.", 15, 50, 25);
		gameItems.add(Flail);
		Item Knife = new Item ("Knife", "A small sword excellent for stabbing.", 10, 30, 15);
		gameItems.add(Knife);
		Item Cannon = new Item ("Cannon", "Old metal gun. With really really big bullets", 5, 20, 10);
		gameItems.add(Cannon);
		Item Ballista = new Item ("Ballista", "A really big crossbow when an arrow just won't do. Used as siege weapons, they are rather powerful.", 10, 30, 15);
		gameItems.add(Ballista);
		Item Scythe = new Item ("Scythe", "Made popular by the Grimm Reaper, scythes pack a punch.", 25, 80, 40);
		gameItems.add(Scythe);
		Item Sickle = new Item ("Sickle", "Known for its association with the Soviets, these communist weapons are pretty cool", 20, 70, 35);
		gameItems.add(Sickle);
	}
	
	public static List getGameItems()
	{
		return gameItems;
	}
}