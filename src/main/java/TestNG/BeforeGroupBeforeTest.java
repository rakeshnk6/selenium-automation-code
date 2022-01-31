package TestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeGroupBeforeTest 

{
	
	@AfterGroups(groups = "regression")
	public void afterGroup()
	{
		System.out.println("this is After Group");
	}

	
//	@AfterTest
//	public void AfterTest()
//	{
//		System.out.println("this is After Test");
//	}
//
//	@BeforeTest
//	public void BeforeTest()
//	{
//		System.out.println("this is before Test");
//	}

	
	@Test
	public void test2()
	{
		System.out.println("this is test2");
	}
	
	@Test(groups = "regression")
	public void test4()
	{
		System.out.println("this is test4");
	}

	
	@Test(groups = "regression")
	public void test3()
	{
		System.out.println("this is test3");
	}

	
	@BeforeGroups(value = "regression")
	public void beforeGroup()
	{
		System.out.println("this is before group");
	}

}
