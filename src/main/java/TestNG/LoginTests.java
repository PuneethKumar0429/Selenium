package TestNG;

import org.testng.annotations.Test;

public class LoginTests {
	@Test(priority=1,groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("This is login by email");
	}
	@Test(priority=2, groups= {"sanity"})
	void loginByFaceBook()
	{
		System.out.println("This is login by FaceBook");
	}
	@Test(priority=3, groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("This is login by Twitter");
	}

}