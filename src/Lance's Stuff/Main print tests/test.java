import java.util.concurrent.TimeUnit;
import java.io.Console;

public class test
{
	public static void main(String[]args)
	{
		String slime = "A gruesome looking creature approaches you. " +
		"It looks slimy, with a thick, mucus-like liquid oozing from its pores. " +
		"You are hit by the sickening stench of the monster as it screams. " +
		"Without warning, it lunges at you";
		
		message(slime, "(!) New Event");
		System.out.flush();
		
		int x = 1;
		while(x == 1)
		{
			x = 0;
			try {
				TimeUnit.SECONDS.sleep(2);
				x = 1;
			}
				catch (InterruptedException e) {
				}
		}
	}
	
	public static void message(String str, String type)
	{
		// finds ". " in the string and splits it at that point
		String[] sent = str.split("\\. ");
		// returns type from message(str, type);
		System.out.print(type + "\n");
		for(int i = 0; i < sent.length; i++)
		{
			System.out.print(sent[i]);
			System.out.print(".\n");
			
			try {
				long large = (long) Math.round(sent[i].length()/50);
				if (sent[i].length() > 50)
					Thread.sleep(large * 2000);
				else
					TimeUnit.SECONDS.sleep(2);
			}
				catch (InterruptedException e) {
				}
		}
	}
}