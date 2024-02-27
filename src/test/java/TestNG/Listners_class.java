package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

//This is main class in which we give all method and this clas we provide in other class to call method from this class
//always implement listner class with ITestListener

public class Listners_class implements ITestListener  {
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase execution is started");
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase is completed successfully");
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase is skipped");
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Testcase failed with few steps passed");
	}
}
