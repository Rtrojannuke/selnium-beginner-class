package selenium_testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class tc_testng_beforesuite_annotation {
	
	
	//@BeforeSuite: It will run only once, before all tests in the suite are executed.
	@BeforeSuite
	public void beforerun() {
		System.out.println("Opening browser");
		System.out.println("************************************");
	}
	
	@Test
	//@Test annotation is used to indicate a test method or function which is meant to run a test
	public void test1() {
		System.out.println("TEST 1");
		System.out.println("************************************");
	}
	
	
	@Test
	public void test2() {
		System.out.println("TEST 2");
		System.out.println("************************************");
	}
	
	//@AfterSuite: A method with this annotation will run once after the execution of all tests in the suite is complete.
	@AfterSuite
	public void afterrun() {
		System.out.println("closing browser");
		System.out.println("************************************");
	}

}
