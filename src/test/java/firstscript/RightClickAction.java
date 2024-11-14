package firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
	WebElement button =	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	//Right Click
	act.contextClick(button).perform();
	
	//click on copy
	driver.findElement(By.xpath("//span[normalize-space()='Copy']"));
	
	Thread.sleep(5000);
	
	//Close alert box
	driver.switchTo().alert().accept();
	}

}