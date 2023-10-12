package listenersPack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("---------onTestStart--------"+ result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("---------onTestSuccess-------"+ result.getMethod().getMethodName());
			}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("---------onTestFailure--------"+ result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("---------onTestSkipped--------"+ result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("---------onTestPartial--------"+ result.getMethod().getMethodName());
			}
	

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("---------onTestFailedTimeout--------"+ result.getMethod().getMethodName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("---------onStart--------"+ context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("---------onFinish--------"+ context.getName());
			}

}
