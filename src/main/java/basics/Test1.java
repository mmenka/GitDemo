package basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeTest
	public static void oneTime() {
		System.out.println("oneTime");
	}
	@AfterTest
	public static void clearAll() {
		System.out.println("clear all");
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("initialisation");
	}
	
	@Test
	public void validlogin() {
		System.out.println("test1");
	}

	@Test
	public void invalidlogin() {
		System.out.println("test2");
	}
	@AfterMethod
	public void clear() {
		System.out.println("clear");
	}
	
	

}
