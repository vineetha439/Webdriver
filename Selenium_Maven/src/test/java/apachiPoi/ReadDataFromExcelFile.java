package apachiPoi;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcelFile {
  @Test
  public void f() throws Exception {
	  FileInputStream fi=new FileInputStream("ReadDataFromExcelSheet.xlsx");//finding Excel sheet path and reading data
	  XSSFWorkbook w=new XSSFWorkbook(fi);//finding workbook
	  XSSFSheet s=w.getSheet("Sheet1");//getting sheet from workbook
	  XSSFRow row=s.getRow(5);//finding row in sheet
	  XSSFCell cell=row.getCell(1);//column
	  System.out.println(cell.getStringCellValue());
	  
  }
}
