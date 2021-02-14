package selenium_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tc_using_testng_3 extends tc_using_testng_01 {

		
	
	@Test(priority=1)
	public void runtest() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"w3loginbtn\"]")).click();
	}
	
	@Test(dependsOnMethods = {"runtest"})// will not run if the runtest doesn't pass when executed can also contain more than one (dependsOnMethods = {"runtest",test2})
	public void again() {
		driver.findElement(By.xpath("//*[@id=\"w3loginbtn\"]")).click();
		driver.findElement(By.xpath("/html/body/nav[6]/div/div[2]/form/div[2]/input")).sendKeys("Bobbby@gmail.com");
		driver.findElement(By.xpath("/html/body/nav[6]/div/div[2]/form/div[4]/input")).sendKeys("Bobbby@gmail.com");
		driver.findElement(By.id("login_submit_button")).click();
		//throw new SkipException("NOT YET IMPLEMENTED"); // Way not to execute/skip test that are written in a test file 
	}
	
	
	

}
