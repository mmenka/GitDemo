package groupingTest;

import org.testng.annotations.Test;

public class GroupingTestClasses {
	@Test(groups = { "login" })
	public void login1() {
		System.out.println("login2");
	}

	@Test(groups = { "login" })
	public void login2() {
		System.out.println("login1");
	}

	@Test(groups = { "register" })
	public void register1() {
		System.out.println("register1");

	}

	@Test(groups = { "register" })
	public void register2() {
		System.out.println("register2");
	}

	@Test(groups = { "login", "other" })
	public void loginx() {
		System.out.println("loginx");
	}
	

}
