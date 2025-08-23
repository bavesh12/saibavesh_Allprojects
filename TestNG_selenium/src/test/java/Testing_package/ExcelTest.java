package Testing_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest {
 
  
  @DataProvider(name="excelData")
  public Object[][] excelDataProvider() throws IOException{
	  String excelpath="C:\\Users\\saiba\\Desktop\\test\\LoginData.xlsx";
	  String sheetname="sheet1";
	  FileInputStream fis=new  FileInputStream(excelpath);
	  Workbook workbook=WorkbookFactory.create(fis);
	  Sheet sheet =workbook.getSheet(sheetname);
	  int rows=sheet.getPhysicalNumberOfRows();
	  int cols=sheet.getRow(0).getLastCellNum();
	   
	  Object[][] data=new Object[rows-1][cols]; 
	  for(int i=1;i<rows;i++) {
		  Row row=sheet.getRow(i);
		  for(int j=0;j<cols;j++) {
			  Cell cell=row.getCell(j);
			  data[i-1][j]=(cell==null)? "":cell.toString();
		  }
	  }
	  workbook.close(); 
	  fis.close();
	  return data;
  }
  @Test(dataProvider="excelData")
  public void testLogin(String username1,String password1) {
	  System.out.println("Username: "+username1+" |Password: "+password1);
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://zero.webappsecurity.com/login.html");
	  WebElement usr=driver.findElement(By.id("user_login"));
	  usr.sendKeys(username1);
	  WebElement psw=driver.findElement(By.id("user_password"));
	  psw.sendKeys(password1);
	  driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
	  
  }
  
  
}