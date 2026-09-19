package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class FactoryClass {
	public static String factoryMethod(String key) {
		FileInputStream fileIn;
		Properties props=new Properties();
		try {
			fileIn = new FileInputStream(".\\src\\test\\resources\\configure.properties");
			props.load(fileIn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return(props.getProperty(key));
	}
}
