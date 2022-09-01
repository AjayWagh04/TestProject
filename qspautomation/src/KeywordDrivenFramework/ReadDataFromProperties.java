package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {
	public static void main(String[] args) throws IOException {
		
		// Read the data from properties
		FileInputStream fis = new FileInputStream("./Data/config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("password");
		System.out.println(value);
		
	}

}
