package basic_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectorcss {
	
	public static void main(String[] args) {
		// getting the user current working directory and saving to a variable
		String projectpath = System.getProperty("user.dir");  
		// setting the path such that when shared with another user there won't be problem running script 
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivrs/libs/chromedriver"); 
		//Declaring an instance of the driver
		ChromeDriver driver = new ChromeDriver();
		//Maximizing the browser
		driver.manage().window().maximize();
		//Going to the website/ AUT
		driver.get("https://www.w3schools.com/html/default.asp");
		
		//clicking element of target by using the css selector
		driver.findElement(By.cssSelector("a[target ='_top'][href = 'html_attributes.asp']")).click();
		
		
		
	//	driver.findElement(By.cssSelector("input[id^= 'logi']")).click(); //look for elements that the id has logi in it's id  
		//driver.findElement(By.cssSelector("input[id$= 'logi']")).click(); //look for elements that the id starts with logi 
		
	}

}
