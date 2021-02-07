package basic_launch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobttn {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//how to handle radio buttons
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//check for element which has similar xpath
		List<WebElement> nelw = driver.findElements(By.xpath("//*[contains(@id,'vfb-7')]"));
		
		//Printing the size/number of such element on the page (value should be 3)
		System.out.println(nelw.size());
		
		//using for each loop to iterate through the list of 
		for(WebElement rd: nelw) {
			System.out.println(rd.getAttribute("value"));
			System.out.println(rd.isSelected());
			
			//clicking on preferred one of the radio button
			if(rd.getAttribute("value").equals("Option 3"));
			rd.click();
		}
		
		
	}

}
