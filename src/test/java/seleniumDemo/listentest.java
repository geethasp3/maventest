package seleniumDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listentest implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("on Test Start");
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("on Test success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("on Test failure"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test skipped"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTest Failed But Within SuccessPercentage"+result.getName());
	}

	public void onStart(ITestContext context) {
		
		System.out.println("on Start" );
	}

	public void onFinish(ITestContext context) {
		System.out.println("on finish");
		
	}

}
