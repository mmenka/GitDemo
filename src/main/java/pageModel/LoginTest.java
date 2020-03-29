package pageModel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.HomePageHelper;
import login.LoginPageData;

public class LoginTest{
	static WebDriver driverObj;

	static HomePageHelper homeHelperObj = null;
	static LoginPageData loginDataObj = null;
	

	@BeforeClass
	public static void loadHPage() {
		homeHelperObj = new HomePageHelper();
		homeHelperObj.loadHomePage();
		driverObj = homeHelperObj.getDriverObj();
	}
	@Test
	public void login1() throws InterruptedException {
		Login lObj=new Login(driverObj);
		lObj.performLogin("admin", "admin");
		
		Thread.sleep(2000);
	}


}
