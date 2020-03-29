package parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.HomePageHelper;
import login.LoginPageData;

public class Test1 {
	static WebDriver driverObj;

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driverObj = new FirefoxDriver();

	}

	@Test
	public void test1() throws InterruptedException {

		driverObj.get("https://www.google.com");
		Thread.sleep(2000);

	}

	@Test
	public void test2() throws InterruptedException {

		driverObj.get("https://www.gmail.com");

	}

}
