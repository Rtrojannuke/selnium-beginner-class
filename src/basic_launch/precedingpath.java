package basic_launch;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class precedingpath {
	
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir"); // used to get the user current working directory 
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivrs/libs/chromedriver"); // setting the path such that when shared with another user there won't be problem running script 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		// Using the selenium preceeding command  
		//Clicking on Learn CSS button
		driver.findElement(By.xpath("/html/body/nav[1]/div/a[2]")).click(); 
		
		// Clickin in element befor the learn css button
		driver.findElement(By.xpath("/html/body/nav[1]/div/a[2]/preceeding-sibling::a")).click(); 
		//for more than one preceeding element
		driver.findElement(By.xpath("/html/body/nav[1]/div/a[2]/preceeding-sibling::a[n]")).click(); // where n is the number of element to the learn css button(n = 1,2,3,4)
		
		//Clicking element after the Learn css button(just change a[1] to a[2] a[n] for where there is more than one element)
		driver.findElement(By.xpath("/html/body/nav[1]/div/a[2]/following-sibling::a[1]")).click(); //first element after learn css button
		driver.findElement(By.xpath("/html/body/nav[1]/div/a[2]/following-sibling::a[2]")).click(); //Second element after learn css button
		
	}

}