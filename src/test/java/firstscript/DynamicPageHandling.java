package firstscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicPageHandling {

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

// close window if its available
if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed());
{
	driver.findElement(By.xpath("//button[@class='btn-close']")).click();
}
driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();

driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();

int total = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));

//Repeating pages

for(int p=1; p<=total; p++)
{
	if(p<1)
	{
	WebElement activepage =	driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
	       activepage.click();
	}
}	
  }		

}

