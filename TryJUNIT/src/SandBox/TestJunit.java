package SandBox;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
		
	   String message = "Hellow World";
	   MessageUtil messageUtil = new MessageUtil(message);
	
	   @Test
	   public void testPrintMessage() {
	      //String str = "Junit is working fine";
		  message = "New World";
	      assertEquals(message, messageUtil.printMessage());
	   }
	}
