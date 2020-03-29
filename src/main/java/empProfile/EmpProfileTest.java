package empProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.FirefoxUtils;

public class EmpProfileTest {
	static WebDriver driverObj;
	static EmpProfileData employeeObj = null;

	@BeforeTest
	public static void intialize() {
		driverObj = FirefoxUtils.driver;
		employeeObj = new EmpProfileData();
		employeeObj.commonProfileData(driverObj);
	}

	@Test
	public void myProfileElemTest() throws InterruptedException {
		Assert.assertNotNull(employeeObj.getMyprofile());

		Thread.sleep(2000);

	}
	
	@Test
	public void employeeElemTest() throws InterruptedException {
		Assert.assertNotNull(employeeObj.getEmployeeElem());
		Thread.sleep(2000);
		
	}
	@Test
	public void departmentElemTest() throws InterruptedException {
		Assert.assertNotNull(employeeObj.getDepartmentElem());
		Thread.sleep(2000);
		
	}
	@Test
	public void logoutElemTest() throws InterruptedException {
		Assert.assertNotNull(employeeObj.getLogoutElem());
		Thread.sleep(2000);
		
	}
	
	@Test
	
	public void navigateAddEmp() throws InterruptedException {
	Actions action = new Actions(driverObj);
	action.moveToElement(employeeObj.getEmployeeElem()).build().perform();
	Thread.sleep(2000);
	driverObj.findElement(By.linkText("Add New Employee")).click();
	Thread.sleep(2000);
}

}
