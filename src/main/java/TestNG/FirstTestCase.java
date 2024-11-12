package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestCase {
	@BeforeClass
	void login()
	{
		System.out.println("This is login");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search box");
	}
	@Test(priority=2)
	void AdvSearch()
	{
		System.out.println("This is Adanced search");
	}
	@AfterClass
	void logout()
	{
		System.out.println("This is logout");
	}
}
