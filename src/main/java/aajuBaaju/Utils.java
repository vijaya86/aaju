package aajuBaaju;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {
	public static  Properties loadProperties(String filepath) 
	{
		System.out.println(filepath);
	Properties prop = new Properties();
 try {
	prop.load(new FileInputStream(filepath));
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 return prop;
	}

}
