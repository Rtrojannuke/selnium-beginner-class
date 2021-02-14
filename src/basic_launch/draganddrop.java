package basic_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) {
		
	//Setting the path to the browser driver executable
	System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
	// Declaring an instance of the driver
	WebDriver driver = new FirefoxDriver();
	
	// Maximizing the browser screen
	driver.manage().window().maximize();
	
	//Navigating to the website/AUT
	driver.get("https://jqueryui.com/draggable/");
	
	//finding the iframe which contains the draggable box at the above url
	List<WebElement> nick = driver.findElements(By.tagName("iFrame"));
	int will = nick.size();
	System.out.println(will);
	
	//Switching to the frame after it has been identified 
	driver.switchTo().frame(0);
	WebElement frm = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	String willm = frm.getText();
	System.out.println(willm);
	
	// Using the Actions to drag the draggable element
	Actions dragm = new Actions(driver);
	dragm.moveToElement(frm).dragAndDropBy(frm, 50, 50).build().perform();

}
}
