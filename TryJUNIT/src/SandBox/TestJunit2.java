package SandBox;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.After;
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
		System.out.println("No of Test Cases = "+this.countTestCases());
		
		//test getName
		String name  = this.getName();
		System.out.println("Update Test Case Name ="+ name);
		
		//test setName
		this.setName("testNewAdd");
		String newName = this.getName();
		System.out.println("Updated Test Case Name = "+ newName);
		
	}
	
	@Test
	public void testAddTwo()
	{
		int a=1;
		int b=3;
		
		org.junit.Assert.assertEquals(4, a+b);
	}
	
	@After
	
	//tearDown used to close the connection or clean up activities
	public void tearDown()
	{
		
	}
	
  /* String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());*/
   }
