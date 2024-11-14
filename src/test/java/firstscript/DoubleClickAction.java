package firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
	WebElement tab1 =	driver.findElement(By.xpath("//input[@id='field1']"));
	WebElement tab2 = driver.findElement(By.xpath("//input[@id='field2']"));
	
	WebElement button =driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	
	tab1.clear();
	tab1.sendKeys("Welcome");
	
	
	//Double click action
	
	act.doubleClick(button).perform();	
	}

}
