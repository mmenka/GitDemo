package dependency;

import org.testng.annotations.Test;

public class DependencyOnGroup {
	@Test(groups = { "init" })
	public void createAcc1() {
		System.out.println("testPrintMessage");
	}

	@Test(dependsOnGroups = { "init.*" })
	public void processUpdate() {
		System.out.println("Inside testSalutationMessage()");
	}

	@Test(groups = { "init" })
	public void createAcc2() {
		System.out.println("This is initEnvironmentTest");
	}
}
