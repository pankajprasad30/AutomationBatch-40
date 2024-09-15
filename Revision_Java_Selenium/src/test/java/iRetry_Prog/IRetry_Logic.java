package iRetry_Prog;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetry_Logic implements IRetryAnalyzer
{
	int count=1;
	int retry=2;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(count < retry)
		{
			count++;
			return true;
		}
		return false;
	}
	
	

}
