package seleniumPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfile 
{

	
public static void main(String[] args) throws IOException
{
	Properties property= new Properties();
	
	FileInputStream file= new FileInputStream("C:\\Users\\Sujata Ghosh\\eclipse-workspace\\seleniumtraining\\src\\test\\resources\\property\\testdata.properties");
	property.load(file);
	
	System.out.println(property.get("browser"));
	System.out.println(property.get("Url"));
	
	
	FileOutputStream fout= new FileOutputStream("C:\\Users\\Sujata Ghosh\\eclipse-workspace\\seleniumtraining\\src\\test\\resources\\property\\testdata.properties");
	property.setProperty("Name","Rakesh Nayak");
	property.setProperty("Phone", "9438208656");
	property.store(fout, "Customer test data is stored");
	
}
}
