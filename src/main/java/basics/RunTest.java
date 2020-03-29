package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunTest {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("in afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("in beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("in afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("in beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("in afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("in afterSuite");
	}
	@Test(priority=2)
	public void loginTest1() throws InterruptedException {
		System.out.println("method1");
	}

	
	@Test(priority=1)
	public void runTest() throws InterruptedException {
		System.out.println("method2 ");
	}

	
	@Test(priority=1)
	public void employeeTest() throws InterruptedException {
		System.out.println("merhod 3");
	}

	
	@Test(priority=3)
	public void login4() throws InterruptedException {
		System.out.println("merhod 4");
	}


}
