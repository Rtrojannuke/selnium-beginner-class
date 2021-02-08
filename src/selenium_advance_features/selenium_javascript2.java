package selenium_advance_features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_javascript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.javascriptkit.com/javatutors/event2.shtml");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// using the javascript function in a button which doesn't allow it to click, then execute the function directly using javascriptexecutor
		((JavascriptExecutor) driver).executeScript("inform()");
		

	}

}
