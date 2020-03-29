package logs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogTest1 {
	@Test
	public void test1() {
		Reporter.log("browser opened ");
	}

}

