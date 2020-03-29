package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxUtils {

	public static final String GECKO_PATH = "C:\\geckodriver.exe";
	public static final String BASE_URL = "http://localhost:8080/EmpDemo/";
	public static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.gecko.driver", GECKO_PATH);
		System.out.println("path - " + System.getProperty("webdriver.gecko.driver"));
		driver = new FirefoxDriver();

		Options manage = driver.manage();

		manage.timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}
}



