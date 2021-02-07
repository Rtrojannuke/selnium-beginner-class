package basic_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlelaunchchme {
	
	public static void main(String[] args) {
	// System.setProperty("webdriver.chrome.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/chromedriver"); // Used to set the path of the browser driver, test wouldn't run without the path
	// OR
		
		String projectpath = System.getProperty("user.dir"); // used to get the user current working directory 
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivrs/libs/chromedriver"); // setting the path such that when shared with another user there won't be problem running script 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netowsolutions.com/");
		// driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[5]/a/span/span")).click();
		driver.findElement(By.xpath("//a[contains(@id,'50d0a112ab327')]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"default-btn-d499e170aff2a02c42250d0a112ab327\"]")).click();
		
	}

}
