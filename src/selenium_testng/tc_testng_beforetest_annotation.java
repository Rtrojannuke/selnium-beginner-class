package selenium_testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc_testng_beforetest_annotation {
	
	
	//@BeforeTest: This will be executed before the first @Test annotated method. It can be executed multiple times before the test case.
	@BeforeTest
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
	
	//@Aftertest: A method with this annotation will be executed when all @Test annotated methods complete the execution of those classes inside the <test> tag in the TestNG.xml file.
	@AfterTest
	public void afterrun() {
		System.out.println("closing browser");
		System.out.println("************************************");
	}

}
