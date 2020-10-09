import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
		
		System.out.println("............Start Firefox.....");
		
		// This path can be set to envirment variable and no need to define here	
//		 System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
//			
//			WebDriver driver = new  FirefoxDriver();
//			driver.get("http://seleniumhq.org/");
//			//driver.close();
//		
//		System.out.println(".............End Firefox.....");
		
		
		
		System.out.println("*************Chrome Started*************");
		
		    System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		
			WebDriver cDriver = new  ChromeDriver();
			//cDriver.get("http://seleniumhq.org/");
			
			cDriver.get("https://google.com/");
			
			//List<WebElement> textbox = driver.findElements(By.id("realbox"));
	
			//	<input class="gLFyf gsfi" maxlength="2048" name="q" type="text" jsaction="paste:puy29d" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwifwv6gkIDsAhXL-KQKHb4PCV0Q39UDCAY">
			// elements looks like above for google search form
			//WebElement textbox2 = cDriver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
			
			WebElement textbox2 = cDriver.findElement(By.xpath("//input[@name='q']"));
			
			List <WebElement> listOfEle = cDriver.findElements(By.xpath("//input"));
			
			int count = listOfEle.size();
			System.out.println("Input count = "+count);
			//realbox-input-wrapper
			//realbox
			//gLFyf gsfi
			textbox2.sendKeys("Automation Step by Step");
			
			//textbox2.submit();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//cDriver.close();
		
		System.out.println("**************Chrome End***************");
		
		
		
//		System.out.println("*************IE Explorer Started*************");
//		// To Run this IE driver , go to IE  -> tools -> Internet options -> Security -> disable check box "Enable Protected mode"
//		  System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");	
//		  
//		  WebDriver ieDriver = new InternetExplorerDriver();
//		
//		  ieDriver.get("http://seleniumhq.org/");
//		  	
//		
//		System.out.println("*************IE Explorer End*************");
		
	}

}
