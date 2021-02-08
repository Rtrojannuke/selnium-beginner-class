package selenium_advance_features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {
	public static void main(String[] args) throws InterruptedException {
		
		String projectpath = System.getProperty("user.dir"); // used to get the user current working directory 
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivrs/libs/chromedriver"); // setting the path such that when shared with another user there won't be problem running script 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait
		Thread.sleep(10000);
		
		//Smart wait(Dynamic)
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"submitbutton\"]")));
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click(); 
		// driver.findElement(By.xpath("//*[@id=\"default-btn-d499e170aff2a02c42250d0a112ab327\"]")).click();
		
	}

}
