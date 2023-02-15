package TestNgPack;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import HeenakochharPack.HeenaLogIn;
import utils.Utilitys;

public class HeenaTest extends Utilitys{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
	    
	     System.out.println("Before Class");
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");

	   WebDriver  driver = new ChromeDriver();
//	  int row=0;
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //   driver.manage().window().maximize();   
	     String actualTile="My Account - Heena Kochhar";
         String expectedTile="My Account - Heena Kochhar";
        driver.get("https://www.heenakochhar.com/my-account/?action=register");
        HeenaLogIn heenaLogIn = new HeenaLogIn(driver); 
        heenaLogIn.ClicklogInRegisterButton();
        heenaLogIn.ClickusernameButton(Utilitys.getDataFromExcelSheet("sheet1",1,0));
        heenaLogIn.ClickpasswordButton(Utilitys.getDataFromExcelSheet("sheet1",1,1));
        //heenaLogIn.ClicklogInButton();
        String s =driver.getTitle();
        System.out.println(s);
       
        Assert.assertEquals(actualTile, expectedTile,"Home page Title is wrong");
      
     }
	}


