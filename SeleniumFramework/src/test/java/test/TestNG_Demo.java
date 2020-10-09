package test;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;


public class TestNG_Demo {

	WebDriver driver = null;
	public static String browserName= null;
	String projectPath = System.getProperty("user.dir");

	@BeforeTest
	public void setUpTest() {

		System.out.println("***************Test Started succesfully**********");

		PropertiesFile.getProperties(); 
		
		if(browserName.equalsIgnoreCase("chrome")) {

			// get driver exe path 
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			// Initiate driver
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			// get driver exe path 
						System.setProperty("webdriver.geco.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
						// Initiate driver
						driver = new FirefoxDriver();
		}

	}
	@Test
	public  void googleSearch() {

		// goto google.com
		driver.get("https://google.com/");

		// eneter text in search textbox
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("Automation Step by Step");

		// click on google search button
		//driver.findElement(By.name("btnk")).click();
		// we can goole and find kesy example: selenium how to press enter key
		driver.findElement(By.xpath("//input[@class='gNO89b']")).sendKeys(Keys.RETURN);




	}
	@AfterTest
	public void tearDownTest() {

		driver.close();
		driver.quit();
		System.out.println("***************Test Completed succesfully**********");

	}

}
