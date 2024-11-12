package TestNG;

import org.testng.annotations.Test;

public class SignUpTests {
	
	@Test(priority=1, groups= {"Regression"})
	void signUpByEmail()
	{
		System.out.println("This is signup by Email");
	}
	
	@Test(priority=2, groups= {"Regression"})
	void signUpByFaceBook()
	{
		System.out.println("This is signup by FaceBook");
	}
	
	@Test(priority=3, groups= {"Regression"})
	void signUpByTwitter()
	{
		System.out.println("This is signup by Twitter");
	}

}
