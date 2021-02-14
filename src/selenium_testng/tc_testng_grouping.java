package selenium_testng;

import org.testng.annotations.Test;

public class tc_testng_grouping {
	
	//When you  are seperating  tc such that seperation or grouping fits in for different purpose
	@Test(groups= {"Performance"})
	public void registration() {
		System.out.println("*********************************************");
		System.out.println("firstname");
	}
	
	@Test(groups= {"Smoke"})
	public void regn() {
		System.out.println("*********************************************");
		System.out.println("lastname");
	}
	
	@Test(groups= {"Smoke","Performance"})
	public void regin() {
		System.out.println("*********************************************");
		System.out.println("email");
	}

}
