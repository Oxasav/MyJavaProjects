package SandBox;

import org.junit.Test;
import org.junit.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class TestJunit3 extends TestResult
{
	//add the error
	public synchronized void addError(Test test, Throwable t)
	{
		super.addError((junit.framework.Test) test, t);
	}
	
	//add the failure
	public synchronized void addFailure(Test test, AssertionFailedError t)
	{
		super.addFailure((junit.framework.Test)test, t);
	}
	
	@Test
	public void testAdd()
	{
		int a=1;
		int b=3;
		
		org.junit.Assert.assertEquals(4, a+b);
	}
	
	//Mark that the test run should stop
	
	public synchronized void stop()
	{
		//stop the test here
	}

}
