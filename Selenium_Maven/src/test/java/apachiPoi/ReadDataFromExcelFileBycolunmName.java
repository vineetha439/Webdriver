package apachiPoi;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcelFileBycolunmName {
	public FileInputStream fi;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow row;
	public XSSFCell cell;
  @Test
  public void f() throws Exception {
	  fi=new FileInputStream("ReadDataFromExcelSheet.xlsx");
	  w=new XSSFWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  row=s.getRow(0);
	  cell=null;
	  int colnum=-1;
	  
	  for (int i = 0; i < row.getLastCellNum(); i++) {
		  System.out.println(row.getCell(i).getStringCellValue());
		  if(row.getCell(i).getStringCellValue().equals("password")) {
			  colnum=i;
			  System.out.println(colnum);
		  }
		  
	  }
			  row=s.getRow(2);
			  cell=row.getCell(colnum);
			  String pwd=cell.getStringCellValue();
			  System.out.println("value in excel cell is :"+pwd);
			  
  }
}
