package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
	
	@DataProvider(name = "test1")
	public static Object[][] data() {
		return new Object[][] { 
			{ "admin1","admin123" }, 
      { "kumar","shyam" }, 
			{ "admin2","admin456"  },
			{ "admin3","admin789"  }, 
			{ "admin4","admin189"  }, 
			{"admin5","admin1131" } };
	}
	@Test(dataProvider = "test1")
	public void testdata(String name,String pass) {
		System.out.println(name + " " + pass);
	}


}
