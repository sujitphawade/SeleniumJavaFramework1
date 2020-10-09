package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
System.out.println("***************Test Started succesfully**********");
		
		// get driver exe path 
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
      
		//https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		  // properties from above link 
		// this setting wil ingore proetected mode 
		
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		// Initiate driver
		//WebDriver driver = new InternetExplorerDriver(caps);
		WebDriver driver = new ChromeDriver(caps);
		
		// goto google.com
		driver.get("https://google.com/");
		
		// eneter text in search textbox
		//WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		WebElement element =  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		element.sendKeys("ABCD");
		
		driver.findElement(By.xpath("//input[@class='gNO89b']")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
		

	}

}
