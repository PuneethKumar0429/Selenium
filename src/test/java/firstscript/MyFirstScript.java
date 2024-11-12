package firstscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * Test Case
 * 1) Launch browser(chrome)
 * 2) Open url  
 * 3) Validate
 * 4) Close browser
 * 
 * 
 * 	
 * 
 */

public class MyFirstScript {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch browser
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
	
	WebElement user =	driver.findElement(By.xpath("//input[@id='input-username']"));
	user.clear();
	user.sendKeys("demo");
	
WebElement password =	driver.findElement(By.xpath("//input[@id='input-password']"));
password.clear();
password.sendKeys("demo");

driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();

driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

	

	
		
		
		
		
		
		
		
		
		
	
}
		
	
		
		
		
		
		
	
		

	
	
	
	
	
		
		
		
		
		
	
		

	}

