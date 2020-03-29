package addEmployee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.FirefoxUtils;


public class AddEmpTest {
	static WebDriver driverObj;
	static AddEmpData addEmployeeObj = null;
	static AddEmpTest checkEnb = null;

	@BeforeTest
	public static void intialize() {
		driverObj = FirefoxUtils.driver;
		addEmployeeObj = new AddEmpData();
		addEmployeeObj.addEmployeeData(driverObj);
		checkEnb = new AddEmpTest();
	}

	@Test
	public void addEmpTest1() throws InterruptedException {
		checkEnb.checkEnable();
		addEmployeeObj.getSubmitElm().submit();
		Thread.sleep(5000);
		Alert alert = driverObj.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals( alertMessage,"Please provide loginName!");
		Thread.sleep(2000);
		alert.accept();
	}

	@Test
	public void addEmpTest2() throws InterruptedException {
		checkEnb.checkEnable();
		addEmployeeObj.getEmploginName().sendKeys("menka");
		Thread.sleep(2000);
		addEmployeeObj.getSubmitElm().submit();
		Alert alert = driverObj.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals("Please provide Password!", alertMessage);
		Thread.sleep(2000);
		alert.accept();

	}

	@Test
	public void addEmpTest3() throws InterruptedException {
		addEmployeeObj.getEmploginName().clear();
		checkEnb.checkEnable();
		addEmployeeObj.getEmploginName().sendKeys("menka");
		addEmployeeObj.getPwd().sendKeys("123456");
		addEmployeeObj.getSubmitElm().submit();
		Alert alert = driverObj.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals("Please provide first Name!", alertMessage);
		Thread.sleep(2000);
		alert.accept();

	}

	// for designation
	@Test
	public void addEmpTest4() throws InterruptedException {
		addEmployeeObj.getEmploginName().clear();
		addEmployeeObj.getPwd().clear();
		checkEnb.checkEnable();
		checkEnb.newEmpDataDetails();
		Select designation = new Select(addEmployeeObj.getDesignation());
		List<WebElement> options = designation.getOptions();
		List<String> expectedDesigValues = Arrays.asList("Associate Engineer", "Senior Engineer", "Analyst",
				"Systen Engineer", "Manager");

		Assert.assertNotNull(expectedDesigValues);
		designation.selectByVisibleText("Analyst");
		Thread.sleep(2000);
	}

	// for gender
	@Test
	public void addEmpTest5() throws InterruptedException {
		checkEnb.checkEnable();
		addEmployeeObj.getMaleElm();
		addEmployeeObj.getFemaleElm();
		Map<String, WebElement> map = new HashMap<String, WebElement>();
		map.put("male", addEmployeeObj.getMaleElm());
		map.put("female", addEmployeeObj.getFemaleElm());
		Assert.assertTrue( addEmployeeObj.getMaleElm().isSelected(),"male is not selectect by default");
		addEmployeeObj.getFemaleElm().click();
		Thread.sleep(2000);
	}
	//for Date of Birth
	@Test
	public void addEmpTest6() throws InterruptedException {
		checkEnb.checkEnable();
		addEmployeeObj.getDob().sendKeys("11/20/1992");
		Thread.sleep(2000);	
	}
	//for status
		@Test
		public void addEmpTest7() throws InterruptedException {
			checkEnb.checkEnable();
			Select status = new Select(addEmployeeObj.getStatus());
			List<WebElement> options = status.getOptions();
			List<String> expectedGenValues = Arrays.asList("Active","Inactive");
					
			Assert.assertNotNull(expectedGenValues);
			status.selectByVisibleText("Inactive");
			Thread.sleep(2000);	
		}
		//for department
		@Test
		public void addEmpTest8() throws InterruptedException {
			checkEnb.checkEnable();
			Select department = new Select(addEmployeeObj.getDepartment());
			List<WebElement> options = department.getOptions();
			List<String> deptValues = Arrays.asList("HR","IT","admin","myde");
			Assert.assertNotNull(deptValues);
			department.selectByVisibleText("IT");
			Thread.sleep(2000);	
		}
		//for salary
		@Test
		public void addEmpTest9() throws InterruptedException {
			checkEnb.checkEnable();
			addEmployeeObj.getEmpSalary().sendKeys("30000.0");
			Thread.sleep(2000);	
		}
		@Test
		public void addEmpTest10() throws InterruptedException {
			checkEnb.checkEnable();
			addEmployeeObj.getMobNo().sendKeys("9886701439");
			addEmployeeObj.getSubmitElm().submit();
			
			Thread.sleep(2000);	
		}
		
	
	

	// method to check enable or not
	public void checkEnable() {
		Assert.assertTrue( addEmployeeObj.getEmploginName().isEnabled(),"login name is not enable");
		Assert.assertTrue( addEmployeeObj.getEmploginName().isDisplayed(),"login name is not displayed");
		Assert.assertTrue( addEmployeeObj.getPwd().isEnabled(),"password is not enable");
		Assert.assertTrue( addEmployeeObj.getPwd().isDisplayed(),"password is not displayed");
		Assert.assertTrue( addEmployeeObj.getFirstName().isEnabled(),"firstName is not enable");
		Assert.assertTrue( addEmployeeObj.getLastName().isEnabled(),"lastName is not enable");
		Assert.assertTrue( addEmployeeObj.getDob().isEnabled(),"DateOfBirth is not enable");
		Assert.assertTrue( addEmployeeObj.getEmpSalary().isEnabled(),"empSalary is not enable");
		Assert.assertTrue( addEmployeeObj.getMobNo().isEnabled(),"empMobNo is not enable");
		Assert.assertTrue( addEmployeeObj.getPresentAddLine1().isEnabled(),"presentaddLine1 is not enable");
		Assert.assertTrue( addEmployeeObj.getPresentAddLine2().isEnabled(),"presentaddLine2 is not enable");
		Assert.assertTrue( addEmployeeObj.getPresentCity().isEnabled(),"presentCity is not enable");
		Assert.assertTrue( addEmployeeObj.getPresentState().isEnabled(),"presentState is not enable");
		Assert.assertTrue( addEmployeeObj.getPresentCountry().isEnabled(),"presentCountry is not enable");
		Assert.assertTrue( addEmployeeObj.getPermanentAddLine1().isEnabled(),"permanentaddLine1 is not enable");
		Assert.assertTrue( addEmployeeObj.getPermanentAddLine2().isEnabled(),"permanentaddLine2 is not enable");
		Assert.assertTrue( addEmployeeObj.getPermanentCity().isEnabled(),"permanentCity is not enable");
		Assert.assertTrue( addEmployeeObj.getPermanentState().isEnabled(),"permanenState is not enable");
		Assert.assertTrue( addEmployeeObj.getPermanentCountry().isEnabled(),"permanentCountry is not enable");


	}

	// method for sending data
	public void newEmpDataDetails() {
		addEmployeeObj.getEmploginName().sendKeys("user1");
		addEmployeeObj.getPwd().sendKeys("123456");
		addEmployeeObj.getFirstName().sendKeys("emp1");
		addEmployeeObj.getLastName().sendKeys("emp1");

	}
}
