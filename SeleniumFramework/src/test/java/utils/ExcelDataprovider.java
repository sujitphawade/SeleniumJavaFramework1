package utils;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;


public class ExcelDataprovider {

	 WebDriver driver = null;
	 
	public static void main(String[] args) {


	}
	@BeforeTest
	public void setUpTest() {

		String projectPath = System.getProperty("user.dir");
		// get driver exe path 
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		// Initiate driver
		driver = new ChromeDriver();


	}

	@Test(dataProvider = "test1Data")
	public void test1(String userName, String password ) {
		System.out.println(userName+" | "+ password);

         driver.get("https://www.orangehrm.com/");

	}
	@DataProvider(name = "test1Data")
	public  Object [][] getData() {
		String excelPath = "C:\\Java Projects\\SeleniumFramework\\excel\\data.xlsx";

		Object data [][] = testData(excelPath, "sheet1");

		return data;

	}
	public  Object [][] testData(String excelPath, String sheetName) {

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);


		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		// rowCount-1 : subtract header from the sheet
		Object data [][] = new Object[rowCount-1][colCount];

		// note int value 1 as in excel first row is header , will get actul data from row 1
		for (int i = 1;  i < rowCount; i++) {

			// get colum data 
			for (int j=0; j< colCount; j++) {

				String cellData =  excel.getCellDataString(i, j);
				//System.out.print(cellData +" | ");
				data[i-1][j]  = cellData;
			}
			System.out.println();

		}
		return data;

	}

}
