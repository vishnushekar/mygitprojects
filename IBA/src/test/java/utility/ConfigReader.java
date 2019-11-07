package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ConfigReader {
	
	Properties prop;
	
	public ConfigReader() {
		
		
		try {
			File file=  new File("./Configuration/Config.property");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is ="+e.getMessage());
		
		
	}
	}
	public String getChromepath() {
		String path = prop.getProperty("ChromeDriver");
		return path;
		/*return prop.getProperty("ChromeDriver");*/
		
	}
	public String getWebURL() {
		return prop.getProperty("URL");
		
	}
	public String getusername() {
		return prop.getProperty("Username");
	}
	public String getpassword() {
		return prop.getProperty("Password");
	}
	public String getusername2() {
		return prop.getProperty("Username2");
	}
	public String getpassword2() {
		return prop.getProperty("Password2");
	}
}

