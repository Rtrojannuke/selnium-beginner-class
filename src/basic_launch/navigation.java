package basic_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {
	
	public static void main(String[] args) throws InterruptedException {
		
		String projectpath = System.getProperty("user.dir"); // used to get the user current working directory 
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivrs/libs/chromedriver"); // setting the path such that when shared with another user there won't be problem running script 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.w3schools.com/jquery/default.asp");
		
		// goes to the previous page before the current page 
		driver.navigate().back();
		
		// Driver waits for 10secs
		Thread.sleep(10000);
		
		// goes to the next page before the current page 
		driver.navigate().forward();
		
		// Driver waits for 10secs
		Thread.sleep(10000);
		
		// refreshes the page
		driver.navigate().refresh();
		// Driver waits for 10secs
		Thread.sleep(10000);
		
		// close the specific browser in use by selenium
		driver.close();
		
		//Close all browser opened by selenium in a chain
		driver.quit();
	}

}
