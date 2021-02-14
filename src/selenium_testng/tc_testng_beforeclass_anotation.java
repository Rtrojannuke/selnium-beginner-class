package selenium_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class tc_testng_beforeclass_anotation {
	
	//@BeforeClass: This will be executed before first @Test method execution. It will be executed one only time throughout the test case.
	@BeforeClass
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
	
	//@AfterClass: This will be executed after all test methods in the current class have been run
	@AfterClass
	public void afterrun() {
		System.out.println("closing browser");
		System.out.println("************************************");
	}

}
