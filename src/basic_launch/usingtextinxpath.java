package basic_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingtextinxpath {
	
	public static void main(String[] args) {
	 
		
		
		String projectpath = System.getProperty("user.dir"); // used to get the user current working directory 
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivrs/libs/chromedriver"); // setting the path such that when shared with another user there won't be problem running script 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		// Using tagname to check for list of the href on the webpage
			WebElement naw = driver.findElement(By.xpath("/html/body/nav[1]/div/a[text()='Learn Bootstrap']"));
			naw.click();
				
	// Using position in xpath	
	WebElement jaw = driver.findElement(By.xpath("/html/body/nav[1]/div/a[position()='1']"));
	jaw.click();
	
	WebElement law = driver.findElement(By.xpath("/html/body/div[5]/div/div/a[position()='5']"));
	law.click();
	}

}
