package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Utilitys  {
		/*  public static  void captureScreenshot(WebDriver driver) throws IOException  {
	    	
	    	TakesScreenshot t = (TakesScreenshot)driver;
	    
			DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd-MM-yyyyHH:mm:ss");
	    	LocalDateTime DT = LocalDateTime.now();
	    	File src =t.getScreenshotAs(OutputType.FILE);
	    	File des = new File("C:\\Users\\Admin\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\mohini_files//CaptuteScreen"+ DTF.format(DT)+ ".jpeg");
	    	FileHandler.copy(src, des);  */
	
	    	public static void captureScreenshot(WebDriver driver ,String fileName)throws IOException 
	    	{
        	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());	
	    	FileHandler.copy(scrFile, new File("C:\\\\Users\\\\Admin\\\\AppData\\\\Roaming\\\\Microsoft\\\\Windows\\\\Network Shortcuts\\\\mohini_files//CaptuteScreen" + fileName+" "+timestamp));
	    	
	    	}

	   
			public static  String getDataFromExcelSheet(String sheetName , int row , int cell)throws IOException, EncryptedDocumentException 
	    	{ 
				
				
		   
	    String path = "C:\\Users\\Admin\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\mohini_files\\Test1.xlsx";
        InputStream file = new FileInputStream(path);
        Sheet sheet =  WorkbookFactory.create(file).getSheet(sheetName);
        String s;
        try {
        	s = sheet.getRow(row).getCell(cell).getStringCellValue();
	   	}
	   
        catch (Exception e) {
        	
			double n = sheet.getRow(row).getCell(cell).getNumericCellValue();
	    	long nu = (long) n ;
	          s = Long.toString(nu);
	    	e.printStackTrace();
	    	String x = e.toString();
	    	System.out.println(x);
	    }
		return s;
	   
	    }
}
	    	
   

	
	
