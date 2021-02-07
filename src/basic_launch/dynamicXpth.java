package basic_launch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamicXpth {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//When the google.com page is loaded a search word Crypto is entered in the search box
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Crypto");
	
	//When entered the list which contains the search keyword result is gotten and placed in a list 
	List<WebElement> nims = driver.findElements(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[2]/div[2]/ul/li"));
	
	//Check the size of the list
	System.out.println(nims.size());
	
	//loop through the list to get the text of the search keyword
	for(int i=0;i<nims.size();i++) {
		String kin = nims.get(i).getText();
		System.out.println(kin);
		//Clicking the preferred one using the text of the element 
		if(kin.equals("cryptocurrency in nigeria")) {
			nims.get(i).click();
		}
	}
	
	}

}
