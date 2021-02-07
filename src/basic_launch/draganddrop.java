package basic_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	//how to handle radio buttons
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
	
	Actions dragm = new Actions(driver);
	dragm.moveToElement(frm).dragAndDropBy(frm, 50, 50).build().perform();

}
}
