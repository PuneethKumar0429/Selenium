package firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
	WebElement source =	driver.findElement(By.xpath("//div[@id='box6']"));
	WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));
	
	WebElement source1 = driver.findElement(By.xpath("//div[@id='box3']"));
	WebElement target2 = driver.findElement(By.xpath("//div[@id='box101']"));

	act.dragAndDrop(source, target).dragAndDrop(source, target).dragAndDrop(source1, target2).perform();
		
		
		

	}

}






