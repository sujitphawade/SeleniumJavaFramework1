package utils;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet ;

	public ExcelUtils(String excepPath, String sheetName ) {

		try {
			//for new excel format (xlsx)
			workbook = new XSSFWorkbook(excepPath);
			//for new excel format (xls)
			//HSSFWorkbook workbook1 = new HSSFWorkbook();

			sheet = workbook.getSheet(sheetName); 


		} catch (IOException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}



	}


	public static void main(String[] args) {
		getRowCount();
		getColCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}

	public static int  getRowCount() {

		int rowCount = 0;
		try {
			

			 rowCount = sheet.getPhysicalNumberOfRows();

			System.out.println("Number of rows in sheet : "+rowCount);

		}catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();


		}
		
		return rowCount;
	}
	public static int getColCount() {
		int colCount = 0;

		try {
			

			 colCount = sheet.getRow(0).getPhysicalNumberOfCells();

			System.out.println("Number of Column in row : "+colCount);

		}catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();


		}
		return colCount;
	}
	public static String  getCellDataString(int rowNum, int colNum) {

		String cellData = null;
		try {


			 cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

			//System.out.println("cell String Data : "+cellData);

		}catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();


		}
		
		return cellData;
	}

	public static void getCellDataNumber(int rowNum, int colNum) {

		try {
			

			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

			System.out.println("cell Numeric Data : "+cellData);

		}catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();


		}
	}
}
