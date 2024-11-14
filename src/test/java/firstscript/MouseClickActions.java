package firstscript;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseClickActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	WebElement desktop =	driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement mac =	driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	//Mouse over actions
	act.moveToElement(desktop).moveToElement(mac).click().build().perform();   //build() -> create an action, perform()-> complete an action	

	}

}
