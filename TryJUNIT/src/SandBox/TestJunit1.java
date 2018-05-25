package SandBox;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class TestJunit1 {

  /* String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);*/
   
  /* @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }*/
	
	@Test
	public void testAdd() 
	{
		//test data
		int num = 5;
		String temp = null;
		String str = "Junit is working fine";
		
		//check for equality
		assertEquals("Junit is working fine", str);
		
		//check for false condition
		assertFalse(num >6);
		
		//check for null
		assertNotNull(str);
				
	}
	
	
}