package basic_launch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chckbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//how to handle checkbox
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//check for element which has the id/ for the checkbox having same id prefix on the page
		List<WebElement> nelw = driver.findElements(By.xpath("//*[contains(@id,'vfb-6')]"));
		
		//Printing the size/number of such element on the page (value should be 3)
		System.out.println(nelw.size());
		
		for(WebElement e:nelw) {
			//Checking the name of the checkbox
			String name = e.getAttribute("value");
			System.out.println(name);
			System.out.println(e.isSelected());
			
			//Using a name of the checkbox to click on it
			if(name.equals("checkbox3") || name.equals("checkbox2")) {
				e.click();
			}
		}
	}

}
