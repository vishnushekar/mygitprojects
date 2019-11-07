package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Data {

	@Test
	public void testConfig() throws IOException {
		File file=  new File("./Configuration/Config.property");
	try {
			FileInputStream fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
		
	
	

