package listener;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.HomePageHelper;
import login.LoginPageData;

@Listeners(MyListener.class)	
public class MyTest {
	static WebDriver driverObj;

	static HomePageHelper homeHelperObj = null;
	static LoginPageData loginDataObj = null;

	@BeforeClass
	public static void loadHPage() {
		homeHelperObj = new HomePageHelper();
		homeHelperObj.loadHomePage();
		driverObj = homeHelperObj.getDriverObj();
	}

	
	@BeforeMethod
	public void b() {
		loginDataObj = new LoginPageData();
		loginDataObj.loginPageData(driverObj);
	}
	@Test

	public void login5() throws InterruptedException {

		
		loginDataObj.getUserNameElem().sendKeys("admin");
		loginDataObj.getPasswordElem().sendKeys("admin");
		loginDataObj.loginButtonElem.submit();
		Thread.sleep(2000);
	}

  
  
}
