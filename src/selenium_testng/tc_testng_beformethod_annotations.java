package selenium_testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc_testng_beformethod_annotations {
	
	//TESTNG doesn't need the main function to run an automation code 
	
	//BeforeMethod: This will be executed before every @test annotated method.
	@BeforeMethod
	public void beforerun() {
		System.out.println("Opening browser");
	}
	
	
	
	@Test
	//@Test annotation is used to indicate a test method or function which is meant to run a test
	public void test1() {
		System.out.println("YOYOYOOYOYOYOYOYOYOOYOOYOYO");
	}
	
	@Test
	public void test2() {
		System.out.println("************************************");
	}
	
	//@BeforeMethod: This will be executed after every @test annotated method
	@AfterMethod
	public void afterrun() {
		System.out.println("closing browser");
	}

}
