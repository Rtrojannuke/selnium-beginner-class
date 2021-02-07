package basic_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframes {
	
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
		
		//going out of the iframe back to the website content
		driver.switchTo().defaultContent();
		WebElement cl = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/h1"));
		System.out.println(cl.getText());
		
		//Another method to switch to thr frame
		WebElement frame = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(frame);
		WebElement fr = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		String wilm = fr.getText();
		System.out.println(wilm);
		
		//Another method to access iframes
		//driver.switchTo().frame(frame);
	}

}
