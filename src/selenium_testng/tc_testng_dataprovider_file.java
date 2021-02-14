package selenium_testng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class tc_testng_dataprovider_file {
	
	//This is to show how to use testdata when testdata is kept in another script/class
	
	@DataProvider(name = "registration") 
	// Dataprovider are used to supply datas into tests and can also be named using the (name="dataname") when multiple data are to be used 
	public static Object[][] testdata(){
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
	
	
	@DataProvider(name = "login") 
	// Dataprovider are used to supply datas into tests and can also be named using the (name="dataname") when multiple data are to be used 
	public static Object[][] login(){
		Object[][] obj = new Object[3][4];
		
		obj[0][0] = "01";
		obj[0][1] = "bill";
		obj[0][2] = "rb@email.com";
		obj[0][3] = "Rbnm";
	
		obj[1][0] = "02";
		obj[1][1] = "Rah";
		obj[1][3] = "Rah@email.com";
		obj[1][3] = "Rahul1";
		
		obj[2][0] = "03";
		obj[2][1] = "Rabb";
		obj[2][2] = "Rabrob@email.com";
		obj[2][3] = "Rahul1";
		
		return obj;
		
	}


	@DataProvider(name = "log") 
	// Using single Dataprovider for different tests in a file,  
	public static Object[][] log(Method m){
		Object[][] obj = null;
		if(m.getName().equals("logn")) {
			 obj = new Object[3][4];
			

			obj[0][0] = "011";
			obj[0][1] = "bill";
			obj[0][2] = "rb@email.com";
			obj[0][3] = "Rbnm";
		
			obj[1][0] = "021";
			obj[1][1] = "Rah";
			obj[1][3] = "Rah@email.com";
			obj[1][3] = "Rahul1";
			
			obj[2][0] = "031";
			obj[2][1] = "Rabb";
			obj[2][2] = "Rabrob@email.com";
			obj[2][3] = "Rahul1";
		}
		else if(m.getName().equals("logb")) {
			
		 obj = new Object[3][2];
						
			obj[0][2] = "rb1@email.com";
			obj[0][3] = "Rbnm";
		
			
			obj[1][3] = "Rah1@email.com";
			obj[1][3] = "Rahul1";
			
			
			obj[2][2] = "Rabrob1@email.com";
			obj[2][3] = "Rahul1";
		}
		
		return obj;
		
	}
}
