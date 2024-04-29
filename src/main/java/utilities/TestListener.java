package utilities;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {
	
	@Override
	public void onTestSuccess(ITestResult tr) {	
		System.out.println("In listeners: test passed");
	}
	
	@Override
	public void onTestFailure(ITestResult tr) {	
		System.out.println("In listeners: test failed");
	}

	
}
