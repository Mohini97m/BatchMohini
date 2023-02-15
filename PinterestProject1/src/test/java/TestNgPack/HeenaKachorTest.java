package TestNgPack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasePack.BaseBrowser;
import HeenakochharPack.AccessoriesPrandi;
import HeenakochharPack.ChashParandi;
import HeenakochharPack.CollectionGulFaiz;
import HeenakochharPack.HeenaCheckOut;
import HeenakochharPack.HeenaLogIn;
import HeenakochharPack.ParantiArchive;
import utils.Utilitys;



public class HeenaKachorTest extends BaseBrowser  {
	 public WebDriver driver;
	 private HeenaLogIn heenaLogIn ;
	 private AccessoriesPrandi accessoriesPrandi;
	 private ParantiArchive parantiArchive ;
	 private ChashParandi chashParandi;
	String testID;
	 int row =1;
	@Parameters("browser123")
	@BeforeTest
	     public void beforeTest(String browser) {
	     System.out.println("Before Class");
	   
		     System.out.println("Before Class");
		     
		     if(browser.equals("Chrome")) 
		     {
		    	driver= openChrome();
		     }
			  if(browser.equals("Edge"))
		     {
				  driver = openEdge();   
		     }
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  //  driver.manage().window().maximize();   
	  }

	

	@BeforeClass
	public void createPOMObject() {
		 heenaLogIn = new HeenaLogIn(driver); ;
		 accessoriesPrandi = new AccessoriesPrandi(driver);
		 parantiArchive = new ParantiArchive(driver);
		 chashParandi = new ChashParandi(driver);
		 
	}
	
	
      @BeforeMethod
         public void beforeMethod() {
         System.out.println("Before Method");
         driver.get("https://www.heenakochhar.com/my-account/?action=register");
       
      }
       @Test (invocationCount = 3)
         public void test1() throws EncryptedDocumentException, IOException {
    	   testID = "T01";
    	  
         System.out.println("Test1");
         String actualTitle="My Account - Heena Kochhar";
         String expectedTitle="My Account - Heena Kochhar";
         String actualText="Accessories";
         String expectedText="Accessories";
         String actualText1="Chash Parandi";
         String expectedText1="Chash Parandi";
         String actualText2="SHOPPING CART";
         String expectedText2="SHOPPING CART";
         SoftAssert soft =new SoftAssert();
         heenaLogIn.ClicklogInRegisterButton();
         heenaLogIn.ClickusernameButton(Utilitys.getDataFromExcelSheet("sheet1",1,0));
         heenaLogIn.ClickpasswordButton(Utilitys.getDataFromExcelSheet("sheet1",2,1));
         heenaLogIn.ClicklogInButton();
         heenaLogIn.Clickreturn1Button();
         row++;
         Assert.assertEquals(actualTitle, expectedTitle,"Home page Title is wrong");
         accessoriesPrandi.ActionaccessoriesButton(); 
         accessoriesPrandi.ActionparandiButton();
         soft.assertEquals(actualText, expectedText,"Home page Text is wrong");
         parantiArchive.ActionchashParandiButton();
         soft.assertEquals(actualText1, expectedText1,"Home page Text1 is wrong");
         chashParandi.ClickaddtocartButton();
         chashParandi.ClickviewcartButton();
         soft.assertEquals(actualText2, expectedText2,"Home page Text2 is wrong");
         soft.assertAll();
      }
        @Test 
         public void test2() throws IOException {
          testID = "T02";
         System.out.println("Test2");
         String actualText="Parandi";
         String expectedText="Parandi";
         SoftAssert soft =new SoftAssert();
         accessoriesPrandi.ActionaccessoriesButton(); 
         accessoriesPrandi.ActionparandiButton();
         parantiArchive.ActionchashParandiButton();
         chashParandi.ClickaddtocartButton();
         chashParandi.ClickcheckoutButton();
        
        HeenaCheckOut heenaCheckOut = new HeenaCheckOut(driver); 
       // heenaCheckOut.ClickcheckoutButton();
         heenaCheckOut.ClickokButton();
         soft.assertEquals(actualText, expectedText,"Home page Text is wrong");
         
         soft.assertAll();
      }
       @AfterMethod
       public void  afterMethod(ITestResult result) throws IOException {
    	   System.out.println("Screenshot Captured");
    	   if(ITestResult.FAILURE == result.getStatus())
    	   {
    		   Utilitys.captureScreenshot(driver ,testID);  
    	   }
       }
 
@AfterClass
public void nullObject() {
	System.out.println("After class");
	heenaLogIn = null; 
	accessoriesPrandi = null;
	 parantiArchive = null;
	 chashParandi = null;
    }

  @AfterTest
  public void afterClass() {
	   
	  driver.close();
	  driver = null;
	  System.gc();
  }
}


