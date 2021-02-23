package org.rununknownfailedtestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class KnownFailedTest implements IRetryAnalyzer{
	int minCount=0,maxCount=5;

	public boolean retry(ITestResult result) {
		if (minCount<maxCount) {
			minCount++;
			return true;
			
		}
		return false;
	}

}
