package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class PropertiesFile {
	static String projectPath = System.getProperty("user.dir");
	static Properties prop = new Properties();

	public static void main(String[] args) {
		getProperties();

		setProperties();
	}	

	public static void getProperties() {

		try {

			String projectPath = System.getProperty("user.dir");

			InputStream inputFileStrm = new FileInputStream(projectPath + "/src/test/java/config/config.properties");
			prop.load(inputFileStrm);
			String browser = prop.getProperty("browser");

			System.out.println("property Value : " +browser);
			
			TestNG_Demo.browserName    =  browser;
					

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

	public static void setProperties() {

		try {

			OutputStream output = new FileOutputStream(projectPath + "/src/test/java/config/config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, "added browser Property");

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

}
