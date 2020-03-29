package excelData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataExcel {

	@DataProvider(name = "excelData")
	public static Object[][] readExcel() throws Exception {
		Object[][] data = ExcelUtils.getTableArray("C://menu//data.xlsx", "loginTest");
		return data;
	}

	@Test(dataProvider = "excelData")
	public void Registration_data(String userName, String pwd, String status) throws Exception {
		System.out.println(userName);
		System.out.println(pwd);
		System.out.println(status);
	}

}
