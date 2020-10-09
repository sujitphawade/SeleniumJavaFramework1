package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;
	private static GoogleSearchPage gooleSearchpg = null;

	public static void main(String[] args) {

		googleSearch();
	}

	public static void googleSearch() {




		System.out.println("***************Test Started succesfully**********");

		// get driver exe path 
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");

		// Initiate driver
		driver = new ChromeDriver();
		gooleSearchpg = new GoogleSearchPage();

		// goto google.com
		driver.get("https://google.com/");

		gooleSearchpg.textBox_search(driver).sendKeys("Automation Step by Step");
		gooleSearchpg.button_search(driver).sendKeys(Keys.RETURN);


		driver.close();

		System.out.println("***************Test Completed succesfully**********");

	}

}
