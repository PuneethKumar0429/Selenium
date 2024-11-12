package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionsdemo {
	@Test
	void testTitle()
	{
		String exp_title = "Opencart";
		String act_title = "Opencar6t";
		
		if(exp_title.equals(act_title))
		{
			System.out.println("Test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
		
		Assert.assertEquals(exp_title, act_title);
		
	}
	@Test
	void soft_assert()
	{
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1,2);
		
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		sa.assertAll();
		
	}

}
