package selenium_advance_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileUpload {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		String projectpath = System.getProperty("user.dir");
		
		String filepath =  projectpath+"/tdocs/Quiz3.pdf";
		
		
		WebElement upldbtn =  driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		upldbtn.sendKeys(filepath);
		
		
		
	}

}
