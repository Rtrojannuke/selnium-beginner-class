package basic_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class drpdown {
	public static void main(String[] args) {
		
				System.setProperty("webdriver.gecko.driver", "/Users/seamlesshr/eclipse-workspace/selnium001/drivrs/libs/geckodriver");
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				
				//how to handle dropdown
				driver.get("http://demo.guru99.com/test/newtours/register.php");
				
				WebElement dropdwn = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
				dropdwn.click();
				List<WebElement> itms = dropdwn.findElements(By.tagName("option"));
				int w = itms.size();
				System.out.println(w);
				
				//Using for loop to get all the values in the dropdown
				for(int i=0;i<w;i++) {
					String contry = itms.get(i).getText();
					System.out.println(contry);
					
					//clicking the specific/particular/interested value
					if(contry.equals("NIGERIA")) {
						itms.get(i).click();
					}
				}
	}

}
