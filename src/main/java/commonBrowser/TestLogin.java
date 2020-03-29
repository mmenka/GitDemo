package commonBrowser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin {
	
		WebDriver driver = null;
		
		@Parameters("browser")
		@BeforeMethod
		public void before(String browser) {
			driver = CommonBrowser.getDriver(browser);
		}
		
		@Test
		public void t1() throws InterruptedException {
			driver.get("http://gmail.com");
			Thread.sleep(5000);
			driver.close();
		}
	}


