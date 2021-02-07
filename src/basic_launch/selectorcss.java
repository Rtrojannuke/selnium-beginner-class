package basic_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectorcss {
	
	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir"); // used to get the user current working directory 
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivrs/libs/chromedriver"); // setting the path such that when shared with another user there won't be problem running script 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/default.asp");
		
		driver.findElement(By.cssSelector("a[target ='_top'][href = 'html_attributes.asp']")).click();
		
		
		
	//	driver.findElement(By.cssSelector("input[id^= 'logi']")).click(); //look for elements that the id has logi 
		//driver.findElement(By.cssSelector("input[id$= 'logi']")).click(); //look for elements that the id starts with logi 
		
	}

}
