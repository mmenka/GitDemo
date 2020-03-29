package common;

import org.openqa.selenium.WebDriver;

import driver.FirefoxUtils;

public class HomePageHelper {

	private WebDriver driverObj = null;

	public void loadHomePage() {

		// driverObj = this.getDriverObj();
		driverObj = FirefoxUtils.getDriver();

		// load home page
		driverObj.get(FirefoxUtils.BASE_URL + "login.jsp");

	}

	public WebDriver createDriverObj() {
		// get driver object
		driverObj = FirefoxUtils.getDriver();
		return driverObj;
	}

	public WebDriver getDriverObj() {

		return driverObj;
	}

	public void closeHomePage() {
		driverObj.close();
	}
}
