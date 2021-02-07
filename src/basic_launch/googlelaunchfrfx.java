package basic_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlelaunchfrfx {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//Using the Starts-with method
		driver.findElement(By.xpath("//a[starts-with(@id,'gb_7')]")).click();
		
		//Using contains() method
		driver.findElement(By.xpath("//a[contains(@id,'b_7')]")).click();
		
		
	}

}
