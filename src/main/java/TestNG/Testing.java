package TestNG;

import org.testng.annotations.Test;

public class Testing {
	@Test(priority =1)
	void name()
	{
		System.out.println("My name is Puneeth");
		
	}
	@Test(priority=2)
	void age()
	{
		System.out.println("My age is 24");
		
	}

}
