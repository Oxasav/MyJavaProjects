package TestExample2TestRunner;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestMessageSalutation 
{
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage()
	{
		System.out.println("Inside testSalutationMessage");
		message = "Hi!"+"Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}

}
