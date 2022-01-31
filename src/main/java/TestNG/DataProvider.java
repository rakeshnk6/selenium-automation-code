package TestNG;

import org.testng.annotations.Test;

public class DataProvider 
{
	@Test (dataProvider = "create", dataProviderClass = DataProviderClass.class )
	public void test(String s1,String s2)
	{
		System.out.println(s1+"        "+s2);
	}
	
	@Test (dataProvider = "create", dataProviderClass = DataProviderClass.class )
	public void test1(String s1,String s2, String s3)
	{
		System.out.println(s1+"        "+s2+"        "+s3);
	}
	
	@Test (dataProvider = "create", dataProviderClass = DataProviderClass.class )
	public void test2(String s1,String s2, String s3, String s4)
	{
		System.out.println(s1+"        "+s2+"        "+s3+"        "+s4);
	}
}
