package firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidersAct {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://www.jqueryscript.net/demo/price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
	//Min Slider	
	WebElement min =driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
	System.out.println(min.getLocation());
	
	act.dragAndDropBy(min, 100, 249).perform();
	
	
	//Max Slider
	WebElement max =driver.findElement(By.xpath("//span[2]"));
	System.out.println(max.getLocation());
	
	act.dragAndDropBy(max,-76, 249).perform();	

	}

}
