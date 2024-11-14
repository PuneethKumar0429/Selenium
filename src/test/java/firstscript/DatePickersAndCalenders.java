package firstscript;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickersAndCalenders {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//Switch to frame
		
		driver.switchTo().frame(0);
		
		//Method1 : Uisng sendkeys method
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/08/2000"); //dd/mm/yyyy
		
		
		//Method 2: using datepicker
		
		String year = "2022";
		String date = "4";
		String month = "August";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker
		
		while (true) {
		    String CurrentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		    String CurrentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		    if (CurrentMonth.equals(month) && CurrentYear.equals(year)) {
		        break;
		    }

		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
         
		// Select dates
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement element : alldates) {
		    if (element.getText().equals(date)) {
		        element.click();
		        break;
		    }
		}

		
		
		
		
	}

}
