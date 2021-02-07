package basic_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderhandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//how to handle radio buttons
		driver.get("https://jqueryui.com/slider/");
		
		//finding the iframe which contains the slider at the above url
		List<WebElement> nick = driver.findElements(By.tagName("iFrame"));
		int will = nick.size();
		System.out.println(will);
		
		//Switching to the frame after it has been identified 
		driver.switchTo().frame(0);
		
		//switchin to the slider element 
		WebElement frm = driver.findElement(By.xpath("/html/body/div/span"));
		
		//Sliding the element
		Actions action = new Actions(driver);
		action.moveToElement(frm).dragAndDropBy(frm, 500, 0).build().perform();
	}

}
