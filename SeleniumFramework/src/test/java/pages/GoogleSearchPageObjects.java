package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By textbox_search = By.xpath("//input[@name='q']");
	By button_search = By.xpath("//input[@class='gNO89b']");
	public GoogleSearchPageObjects(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void setTextInSearchBox (String tex) {
		driver.findElement(textbox_search).sendKeys(tex);
	}
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);;
	}

}
