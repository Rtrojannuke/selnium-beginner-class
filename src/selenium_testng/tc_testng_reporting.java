package selenium_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class tc_testng_reporting {
	
	@Test
	public void registration() {
		System.out.println("*********************************************");
		System.out.println("firstname");
	}
	
	@Test
	public void regn() {
		System.out.println("*********************************************");
		Assert.assertEquals("Test", "SWISS");
	}

}
