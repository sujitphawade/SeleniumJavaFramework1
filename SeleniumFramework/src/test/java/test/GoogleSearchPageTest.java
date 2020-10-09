package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();

	}

	public static void googleSearchTest() {
		// get driver exe path 
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");

		// Initiate driver
		driver = new ChromeDriver();

      		// goto google.com
		driver.get("https://google.com/");
		 
	  GoogleSearchPageObjects googleSearchObj = new GoogleSearchPageObjects(driver);
		 
	  googleSearchObj.setTextInSearchBox("Automation Step by Step");
	  googleSearchObj.clickSearchButton();
	  
	  driver.close();
	  
	}

}
