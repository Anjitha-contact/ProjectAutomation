package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.Contants;

public class GrocceryExcelUtilities {
	static FileInputStream f; // class in java to get the excel access
	static XSSFWorkbook wb; // inbuilt class to get details from workbook
	static XSSFSheet sh; // inbuilt class to get details from a sheet of excel

	public static String getStringData(int a, int b, String loginsheet) throws IOException {
		f = new FileInputStream(
				Contants.EXCELPATH);
		wb = new XSSFWorkbook(f);// from file
		sh = wb.getSheet(loginsheet); // used to get the details from sheet
		XSSFRow r = sh.getRow(a); // to get data from row
		XSSFCell c = r.getCell(b); // get data from cell
		return c.getStringCellValue(); // to access string value
	}

	public static String getIntegerData(int a, int b,String loginsheet) throws IOException {
		f = new FileInputStream(Contants.EXCELPATH);
				;
		wb = new XSSFWorkbook(f);// that reads Excel files (.xlsx) using Apache POI.
		sh = wb.getSheet(loginsheet);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int x = (int) c.getNumericCellValue();// to get access number
		return String.valueOf(x); // type conversion any data to string

	}

}
