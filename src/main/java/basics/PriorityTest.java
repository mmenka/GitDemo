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

public class PriorityTest {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in beforeMethod2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("in afterMethod2");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("in beforeClass2");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("in afterClass2");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("in beforeTest2");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("in afterTest2");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in beforeSuite2");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("in afterSuite2");
	}
	@Test(priority=2)
	public void loginTest1() throws InterruptedException {
		System.out.println("method1P");
	}

	
	@Test(priority=1)
	public void runTest() throws InterruptedException {
		System.out.println("method2P ");
	}

	
	@Test(priority=4)
	public void employeeTest() throws InterruptedException {
		System.out.println("merhod 3P");
	}

	
	@Test(priority=3)
	public void login4() throws InterruptedException {
		System.out.println("merhod 4P");
	}



}
