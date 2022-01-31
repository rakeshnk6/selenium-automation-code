package TestNG;

import org.testng.annotations.Test;


@Test(groups ="User-registration")
public class GroupTestDemo 

{

	@Test (priority = 1, groups = "Regression")
	public void Test1()
	{
		System.out.println("Test 1");
	}
	
	@Test  (priority = 2, groups = "Regression")
	public void Test2()
	{
		System.out.println("Test 2");
	}
	
	
	@Test(groups = "bvt")
	public void Test3()
	{
		System.out.println("Test 3");
	}
	
	@Test (groups = {"Regression","bvt"})
	public void Test4()
	{
		System.out.println("Test 4");
	}
}
