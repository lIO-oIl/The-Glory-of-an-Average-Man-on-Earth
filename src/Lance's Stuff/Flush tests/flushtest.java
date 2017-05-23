import java.util.logging.ConsoleHandler;

public class flushtest {
	public static void main(String[]args)
	{
		ConsoleHandler flush = new ConsoleHandler();
		System.out.println("Test");
		cls();
		System.out.println("EndTest");
	}
	
	public static void cls()
	{
		for(int i = 0; i < 50; i++)
		{
			System.out.println("\n");
		}
	}

}