package commonBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonBrowser {
	

	public static WebDriver getChromeDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
		
		Options manage = driver.manage();
		manage.deleteAllCookies();
		manage.timeouts().pageLoadTimeout(60, 
				TimeUnit.SECONDS); //Identify performance issues
		manage.timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}
	
	
	public static WebDriver getFireFoxDriver(){
        System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Options manage = driver.manage();
		manage.deleteAllCookies();
		manage.timeouts().pageLoadTimeout(60, 
				TimeUnit.SECONDS); //Identify performance issues
		return driver;
	}
	public static WebDriver getDriver(String browser) {
		if("chrome".equals(browser)) {
			return getChromeDriver();
		}
		
		if("firefox".equals(browser)) {
			return getFireFoxDriver();
		}
		
		return null;
	}
}
