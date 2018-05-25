package SandBox;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit2 extends TestCase {

	protected double fValue1;
	protected double fValue2;
	
	@Before
	public void setUp()
	{
		fValue1 = 2.0;
		fValue2 = 3.0;
	}
	
	@Test
	public void testAdd()
	{
		//count the number of test cases
		
	}
   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}