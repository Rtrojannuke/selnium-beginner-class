package listnrs;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class listen extends TestListenerAdapter {
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("ASDFG;JKHGFDSAASDFGHJUYTRE");
	}

	
	public void onTestFailure(ITestResult tr) {
		System.out.println("***************FAIL********");
	}
}
