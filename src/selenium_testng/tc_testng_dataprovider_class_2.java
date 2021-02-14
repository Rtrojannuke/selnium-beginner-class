package selenium_testng;
import org.testng.annotations.Test;

public class tc_testng_dataprovider_class_2 {
//The testdata used in this test is same but was controlled with an if statement to suit different tests but the name --
// of the testdata in the tc_testng_dataprovider.class(the java class: tc_testng_dataprovider.java ) is log the method has an if statement to control it 
	
	@Test(dataProviderClass = tc_testng_dataprovider_file.class, dataProvider = "log") 
	// We include the testdata by including the testdata provider class(dataProviderClass = testdata_name.class, dataProvider = "name of testdata"(if name exist)) when testdata is in another class
	public void logn(String firstname, String lastname, String email, String password) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(password);
	}
	
	@Test(dataProviderClass = tc_testng_dataprovider_file.class, dataProvider = "log") 
	// We include the testdata by including the testdata provider class(dataProviderClass = testdata_name.class, dataProvider = "name of testdata"(if name exist)) when testdata is in another class
	public void login(String email, String password) {
		System.out.println(email);
		System.out.println(password);
	}
		

}
