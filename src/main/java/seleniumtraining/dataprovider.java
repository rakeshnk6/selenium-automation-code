package seleniumtraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider

{

	@DataProvider
	public Object[][] test()
	{
		Object[][] data= new Object[2][2];
		data[0][0]="Rakesh";
		data[0][1]="Nayak";
		data[1][0]="Sujata";
		data[1][1]="Ghosh";
		
		return data;
				
		
	}
	
	@DataProvider
	public Object[][]test1()
	{
		Object[][] data=new Object[3][3];
		
		data[0][0]=1;
		data[0][1]=2;
		data[0][2]=3;
		
		data[1][0]=4;
		data[1][1]=5;
		data[1][2]=6;
		
		data[2][0]=7;
		data[2][1]=8;
		data[2][2]=9;
		
		return data;
	}
	@Test(dataProvider = "test")
	public void test2(String s1, String s2)
	{
		System.out.println("S1= "+s1+" "+"S2= "+s2);
	}
	
	@Test(dataProvider = "test1")
	public void test3(int n1,int n2, int n3)
	{
		System.out.println("N1= "+n1+" "+"N2= "+n2+" "+"n3= "+n3);
	}
}
