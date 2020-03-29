package checkEnable;

import org.testng.annotations.Test;

public class CheckEnable {
	@Test
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

	
	@Test
	public void login4() throws InterruptedException {
		System.out.println("merhod 4");
	}
	@Test(enabled = false) 
	public void myTest() {
		System.out.println("in test case 3");
	}


}
