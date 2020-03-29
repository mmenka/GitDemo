package parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParrallelMethod {

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

	}

	@Test
	public void test1() throws InterruptedException {
		WebDriver driverObj = new FirefoxDriver();
		driverObj.get("https://www.google.com");
		Thread.sleep(2000);

	}

	@Test
	public void test2() throws InterruptedException {
		WebDriver driverObj = new FirefoxDriver();
		driverObj.get("https://www.gmail.com");
		Thread.sleep(2000);

	}

}
