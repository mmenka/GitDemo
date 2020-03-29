package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener implements ITestListener {

		public void onTestStart(ITestResult result) {
			Reporter.log(result.getName() + " test case started");
		}

		public void onTestSuccess(ITestResult result) {
			Reporter.log("The name of the testcase passed is :" + result.getName());
		}

		public void onTestFailure(ITestResult result) {
			Reporter.log("The name of the testcase failed is :" + result.getName());
		}

		public void onTestSkipped(ITestResult result) {
			Reporter.log("The name of the testcase Skipped is :" + result.getName());
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub

		}

		public void onFinish(ITestContext context) {
		}
	  
	}


