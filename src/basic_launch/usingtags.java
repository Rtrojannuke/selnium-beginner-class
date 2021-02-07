package basic_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingtags {
	
	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir"); // used to get the user current working directory 
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivrs/libs/chromedriver"); // setting the path such that when shared with another user there won't be problem running script 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		// Using tagname to check for list of the href on the webpage
				List<WebElement> naw = driver.findElements(By.tagName("a"));
				System.out.println(naw.size());
				
				//USING A FOR LOOP TO ITERATE TO GET THE ALL THE TAGS
				for(int i=0; i<naw.size();i++) {
					//PRINTING OUT ALL THE LIST IN THE PAGE
					String him = naw.get(i).getText();
					System.out.println(him);
					// TO CLICK ON THE TUTORIAL TAG
					if(him.equals("TUTORIALS")) {
						naw.get(i).click();
						break;
					}
				}
		
	}

}
