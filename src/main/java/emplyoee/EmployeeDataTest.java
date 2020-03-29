package emplyoee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.FirefoxUtils;

public class EmployeeDataTest {
	static WebDriver driverObj;
	static EmployeeData empObj = null;
	

	@BeforeTest
	public static void intialize() {
		driverObj = FirefoxUtils.driver;
		empObj = new EmployeeData();
		empObj.navigateEmp(driverObj);
		
	}

	@Test
	public void moveEmp() throws InterruptedException {

		Actions action = new Actions(driverObj);
		action.moveToElement(empObj.getEmp()).build().perform();
		Thread.sleep(2000);
		empObj.getaddEmp().click();
		Thread.sleep(2000);

	}

}
