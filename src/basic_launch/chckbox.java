package basic_launch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//how to handle checkbox
public class chckbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//Navigating to website
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//check for element which has the id/ or the checkbox having same id prefix on the web page/ AUT
		List<WebElement> nelw = driver.findElements(By.xpath("//*[contains(@id,'vfb-6')]"));
		
		//Printing the size/number of such element on the page
		System.out.println(nelw.size());
		
		// Uisng for each loop to iterate through the element to get the value/Text
		for(WebElement e:nelw) {
			//Checking the name/Text/Value of the checkbox
			String name = e.getAttribute("value");
			System.out.println(name);
			System.out.println(e.isSelected());
			
			//Using the name of the checkbox to click on it
			if(name.equals("checkbox3") || name.equals("checkbox2")) {
				e.click();
			}
		}
	}

}
