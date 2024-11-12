package TestNG;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test(priority=1, groups = {"sanity","Regression"})
	void paymentInRupess()
	{
		System.out.println("This is in rupess..");
	}
	
	@Test(priority=2 , groups= {"sanity", "Regression"})
	void paymentInDollars()
	{
		System.out.println("This is in dollars..");
	}

}
