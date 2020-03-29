package LogicSir;


	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.Options;
	import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

	public class ClassCommon {
		
		public static final String GECKO_PATH = "C:\\geckodriver.exe";
		
		public static final String BASE_URL = "http://localhost:8080/EmpDemo/";
		
		
		public static final String LOGIN = "login";
		public static final String PASSWORD = "password";
		public static final String LOGIN_NAME = "loginName";

		
	// path for firefox driver
		
		public static WebDriver getDriver(){
			  System.setProperty("webdriver.gecko.driver", GECKO_PATH);
			  WebDriver driver = new FirefoxDriver(); 
		     Options manage = driver.manage();
		     manage.timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
		
		
		public static void checkenabledAndDisplayed(WebElement... elements) //ARRAY of web element objects
		{
			for(WebElement e: elements) {
			
				Assert.assertTrue(e.isDisplayed() && e.isEnabled(), "Web elements is not displayed and enabled");
				
			}
	}
		
	   public static void checkValues(Map < String, WebElement> map) {
		   for(Entry< String, WebElement> entry:map.entrySet()) {
			    WebElement c= entry.getValue();
			    String actual = c.getAttribute("value");
			    String expected =entry.getKey();
			    
			    if(! expected.equals(actual))
			    {
			    	System.out.println("Invalid values");
			    }
			    
		   }
		   
	   }
	   
		
	}





