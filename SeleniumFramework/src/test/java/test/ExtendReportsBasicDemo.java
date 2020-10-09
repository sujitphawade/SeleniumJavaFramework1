package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentHtmlReporter  htmlReport = new ExtentHtmlReporter("extentReports.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReport);

		ExtentTest test1 = extent.createTest("Google Search Test One", "This is test to validate google search funcationality");

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");

		// Initiate driver
		driver = new ChromeDriver();

		test1.log(Status.INFO, "Starting Test Case");

		// goto google.com
		driver.get("https://google.com/");

		test1.pass("Navigated to google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");

		test1.pass("Entered text in search box ");

		driver.findElement(By.xpath("//input[@class='gNO89b']")).sendKeys(Keys.RETURN);

		test1.pass("pressed Keyboard eneter key");


		driver.close();
		driver.quit();

		test1.pass("Closed the browser");

		test1.info("Test Completed");

		
		//**************
		ExtentTest test2 = extent.createTest("Google Search Test One", "This is test to validate google search funcationality");

		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");

		// Initiate driver
		driver = new ChromeDriver();

		test2.log(Status.INFO, "Starting Test Case");

		// goto google.com
		driver.get("https://google.com/");

		test2.pass("Navigated to google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");

		test2.pass("Entered text in search box ");

		driver.findElement(By.xpath("//input[@class='gNO89b']")).sendKeys(Keys.RETURN);

		test2.fail("pressed Keyboard eneter key");


		driver.close();
		driver.quit();

		test2.pass("Closed the browser");

		test2.info("Test Completed");
		
		
		
		extent.flush();

	}

}
