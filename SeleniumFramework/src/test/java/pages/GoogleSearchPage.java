package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	private static WebElement webElement = null;

	public static WebElement textBox_search(WebDriver driver) {
		webElement  = driver.findElement(By.xpath("//input[@name='q']"));
		return webElement;
	}


	public static WebElement button_search(WebDriver driver) {
		webElement  = driver.findElement(By.xpath("//input[@class='gNO89b']"));
		return webElement;
	}



}
