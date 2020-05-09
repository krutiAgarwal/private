package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing {

	@BeforeTest
	public void beforeTestExecution(){
		
		System.out.println("Iam runnig the @Before test");
	}
	
	@BeforeSuite
	public void beforeTestSuiteExecution(){
		
		System.out.println("Iam running the @BeforeTestSuiteExecution");
	}
	
	
	
	@Test
	
	public void testExecution(){
		
		System.out.println("I am running the @TestExecution");
	}
	
	@AfterTest
	
	public void afterTest(){
		
		System.out.println("I am running the @AfterTestExecution");
	}
	
	@AfterSuite
	
	public void afterSuite(){
		
		System.out.println("I am running the @AfterSuiteExecution");
	}
	
}
