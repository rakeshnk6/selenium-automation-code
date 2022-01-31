package TestNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass
{

	@DataProvider (name="create")
	public Object[][] dataset(Method m)
	{
		Object[][] data=null;
		
		if(m.getName().equals("test"))
		{
			data= new Object[][]{
					{"Rakesh","Nayak"},
					{"Sujata","Ghosh"}
					
			};
		}
			
			else if(m.getName().equals("test1"))
			{
				data=new Object[][]
						{
					
					{"Chinu","Ankit","Bhubaneswar"},
					{"Sonu","Yash","Balesor"},
					{"ItiBoudi","Subu bhai","Baripada"}
					
						};
			}
			else if(m.getName().equals("test2"))
			{
				data= new Object[][]
						{
					{"Dio","Honda","Riding in BBSR","IRT service WFH"},
					{"celerio","Maruti","Driving in BLS","IT service WFH"},
					{"BRV","Honda","Driving in BPD","Business Man"}
					
						};
			}
		
		return data;
			
		}
	}

