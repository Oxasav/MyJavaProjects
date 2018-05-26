package TestExample2TestRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses(
		{
			TestMessageUtils.class,
			TestMessageSalutation.class
			
		})

public class TestSuiteMessageUtil 
{
	

}
