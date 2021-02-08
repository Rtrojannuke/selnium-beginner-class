package selenium_advance_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class date_from_calendar {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.findElement(By.tagName("iFrame"));
		driver.switchTo().frame(0);
		
		WebElement datecal = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		datecal.click();
		datecal.sendKeys("05/10/2021");
		
		
		
//		String date = "13-May 2021";
//		String splitter[]= date.split("-");
//		String monthYear = splitter[1];
//		String day = splitter[0];
//		
//		System.out.println(monthYear);
//		System.out.println(day);
	}

}
