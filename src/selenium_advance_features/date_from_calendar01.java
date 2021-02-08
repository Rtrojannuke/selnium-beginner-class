package selenium_advance_features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class date_from_calendar01 {
	
	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.gecko.driver", projectpath+ "/drivrs/libs/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.tripadvisor.in/Attraction_Products-g295424-zfg11867-Dubai_Emirate_of_Dubai.html");
		
		driver.manage().window().maximize();
		
		String date = "13-May 2021";
		String splitter[] = date.split("-");
		String month_year = splitter[1];
		String day = splitter[0];
		
//		System.out.println(day);
//		System.out.println(month_year);
//		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[5]/div[2]/div/div[2]/div/div/div[2]/div[1]")).click();
		
		List<WebElement> month =  driver.findElements(By.xpath("//div[@class='rsdc-wrapper rsdc-dual-month']/div[@class='rsdc-body']/div[@class='rsdc-months']/span[@class='rsdc-month']/span[@class='rsdc-month-title']"));
		int sze = month.size();
		
		for(int i =0; i<sze; i++) {
			String val = month.get(i).getText();
			System.out.println(val);
		}
		
	}

}
