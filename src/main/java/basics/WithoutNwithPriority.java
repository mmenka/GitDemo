package basics;

import org.testng.annotations.Test;

public class WithoutNwithPriority {
	@Test(priority=2)
	public void loginTest1() throws InterruptedException {
		System.out.println("method1");
	}

	
	@Test
	public void runTest() throws InterruptedException {
		System.out.println("method2 ");
	}

	
	@Test
	public void employeeTest() throws InterruptedException {
		System.out.println("merhod 3");
	}

	
	@Test(priority=1)
	public void login4() throws InterruptedException {
		System.out.println("merhod 4");
	}




}
