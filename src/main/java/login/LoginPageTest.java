package login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.HomePageHelper;

public class LoginPageTest {

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
	//@Test
	public void login1() throws InterruptedException {
		Assert.assertTrue(loginDataObj.getUserNameElem().isEnabled(), "user name is not given");
		Assert.assertTrue(loginDataObj.getPasswordElem().isEnabled(), "password is not given");
		Assert.assertTrue(loginDataObj.getPasswordElem().isDisplayed(), "password is not displayed");
		Assert.assertTrue(loginDataObj.getLoginButtonElem().isEnabled(), "login not enabled");
		loginDataObj.getLoginButtonElem().submit();
		Thread.sleep(2000);
		Alert alert = driverObj.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals("Please provide loginName!", alertMessage);
		alert.accept();
	}

	@Test
	public void login2() throws InterruptedException {
		Assert.assertTrue(loginDataObj.getUserNameElem().isEnabled(), "user name is not given");
		Assert.assertTrue(loginDataObj.getPasswordElem().isEnabled(), "password is not given");
		Assert.assertTrue(loginDataObj.getPasswordElem().isDisplayed(), "password is not displayed");
		Assert.assertTrue(loginDataObj.getLoginButtonElem().isEnabled(), "login not enabled");
		System.out.println("data = "+loginDataObj.getUserNameElem().getText());
		loginDataObj.getUserNameElem().sendKeys("admin");
		loginDataObj.getLoginButtonElem().submit();
		Thread.sleep(2000);
		Alert alert = driverObj.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals("Please provide Password!", alertMessage);
		alert.accept();
	}

	// test3
	//@Test
	public void login3() throws InterruptedException {

		loginDataObj.getUserNameElem().clear();
		loginDataObj.getPasswordElem().sendKeys("admin");
		loginDataObj.getLoginButtonElem().submit();
		Thread.sleep(2000);
		Alert alert = driverObj.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals("Please provide loginName!", alertMessage);
		alert.dismiss();
	}

	// test4
	//@Test
	public void login4() throws InterruptedException {

		loginDataObj.getUserNameElem().clear();
		loginDataObj.getPasswordElem().clear();
		loginDataObj.getUserNameElem().sendKeys("admin");
		loginDataObj.getPasswordElem().sendKeys("admi");
		loginDataObj.getLoginButtonElem().submit();
		Thread.sleep(2000);
		Alert alert = driverObj.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals("password has to be minimum 5 chars and max 10 chars!", alertMessage);
		alert.dismiss();
	}

	// test5
	@Test

	public void login5() throws InterruptedException {

		loginDataObj.getUserNameElem().clear();
		loginDataObj.getPasswordElem().clear();
		loginDataObj.getUserNameElem().sendKeys("admin");
		loginDataObj.getPasswordElem().sendKeys("admin");
		loginDataObj.loginButtonElem.submit();
		Thread.sleep(2000);
	}

}
