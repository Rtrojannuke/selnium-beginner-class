package selenium_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class tc_using_testng_01 {
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforerun() {
		// would contain actions which were meant to run before the test
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivrs/libs/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
	}
	
	
	@AfterTest
	public void close() {
		//driver.close();
		driver.quit();
	}
	
	

}
