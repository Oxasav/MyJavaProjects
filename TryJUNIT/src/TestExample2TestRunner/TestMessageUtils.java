package TestExample2TestRunner;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMessageUtils 
{
	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage()
	{
		assertEquals(message, messageUtil.printMessage());
	}
}
