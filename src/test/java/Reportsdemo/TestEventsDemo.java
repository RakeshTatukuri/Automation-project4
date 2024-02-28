package Reportsdemo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestEventsDemo implements ITestListener{
 
	public void onstart() {
		System.out.println("Test started");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test success "+result.getName());//return test name that is pass
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failure "+result.getName());
	}
}
