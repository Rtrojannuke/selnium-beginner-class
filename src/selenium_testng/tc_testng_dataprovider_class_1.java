package selenium_testng;
import org.testng.annotations.Test;

public class tc_testng_dataprovider_class_1 {
	@Test(dataProviderClass = tc_testng_dataprovider_file.class, dataProvider = "registration") 
	// We include the testdata by including the testdata provider class(dataProviderClass = testdata_name.class, dataProvider = "name of testdata"(if name exist)) when testdata is in another class
	public void registration(String firstname, String lastname, String email, String password) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(password);
	}
	
	
	@Test(dataProviderClass = tc_testng_dataprovider_file.class, dataProvider = "login") 
	// We include the testdata by including the testdata provider class(dataProviderClass = testdata_name.class, dataProvider = "name of testdata"(if name exist)) when testdata is in another class
	public void login(String firstname, String lastname, String email, String password) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(password);
	}
		

}
