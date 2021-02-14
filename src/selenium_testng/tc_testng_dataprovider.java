package selenium_testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class tc_testng_dataprovider {
	@Test(dataProvider = "registration") // We include the testdata method/name given in the (name) when creating testdata
	public void registration(String firstname, String lastname, String email, String password) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(password);
	}
	
	@DataProvider(name = "registration") 
	// Dataprovider are used to supply datas into tests and can also be named using the (name="dataname") when multiple data are to be used 
	public Object[][] testdata(){
		Object[][] obj = new Object[3][4];
		
		obj[0][0] = "Ril";
		obj[0][1] = "bill";
		obj[0][2] = "rb@email.com";
		obj[0][3] = "Rbnm";
	
		obj[1][0] = "Rahul";
		obj[1][1] = "Rah";
		obj[1][3] = "Rah@email.com";
		obj[1][3] = "Rahul1";
		
		obj[2][0] = "Robb";
		obj[2][1] = "Rabb";
		obj[2][2] = "Rabrob@email.com";
		obj[2][3] = "Rahul1";
		
		return obj;
		
	}

}
