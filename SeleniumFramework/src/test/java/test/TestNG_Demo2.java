package test;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Demo2 {

	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {

		System.out.println("***************Test Started succesfully**********");

		// get driver exe path 
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");

		// Initiate driver
		driver = new ChromeDriver();

	}
	@Test
	public  void googleSearch2() {

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
	@Test
	public  void googleSearch3() {

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
