package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest 
{

	
	Boolean datasetup=false;
	
	@Test(enabled = false)
	public void skipTest1()
	{
		System.out.println("Skip this test case skipTest1");
	}
	
	
	@Test
	public void skipTest2()
	{
		System.out.println("Skip this test case forcefully");
		throw new SkipException("Skipping Test2 as of now");
	}
	
	
	@Test
	public void skipTest3()
	{
		System.out.println("Skip this test case based on condition");
		if(datasetup==true)
		{
			System.out.println("Execute the Test");
		}
		else
		{
			System.out.println("Do not execute further step");
			throw new SkipException("Do not execute further step");
		}
	}
	
	
	
}
