package SandBox;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import TestExample2TestRunner.TestMessageUtils;
import TestExample1.TestEmployeeDetails;

public class TestRunner 
{
	
   public static void main(String[] args) 
   {
      Result result = JUnitCore.runClasses(TestMessageUtils.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
}  	