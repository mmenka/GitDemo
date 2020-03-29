package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeUtils {
	public static final String CHROME_PATH = "C:\\chromedriver.exe";
	public static final String BASE_URL = "http://localhost:8080/EmpDemo/";

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", CHROME_PATH);
		System.out.println("path - " + System.getProperty("webdriver.chrome.driver"));
		WebDriver driver = new ChromeDriver();

		Options manage = driver.manage();

		manage.timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}


}
