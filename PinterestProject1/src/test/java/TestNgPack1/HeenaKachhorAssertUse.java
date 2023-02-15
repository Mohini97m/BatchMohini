package TestNgPack1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
import HeenakochharPack.HeenaCheckOut;
import HeenakochharPack.HeenaLogIn;
import HeenakochharPack.HelpAbout;
import HeenakochharPack.ParantiArchive;
import HeenakochharPack.ProductSearch;
import utils.Utilitys;

public class HeenaKachhorAssertUse extends Utilitys {

	 public WebDriver driver;
	 private HeenaLogIn heenaLogIn ;
	 private AccessoriesPrandi accessoriesPrandi;
	 private ParantiArchive parantiArchive ;
	 private ChashParandi chashParandi;
	 private ProductSearch productSearch;
     private HelpAbout	helpAbout;
     private HeenaCheckOut heenaCheckOut;
    String testID;
    int row=1;
    int row1=1;
   
 // //  @Parameters("browser123")
	  @BeforeTest
	     public void beforeTest() {
	     System.out.println("Before Class");
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)-109.0.5414.74version\\chromedriver.exe");
	      driver = new ChromeDriver();
	     
	     
	     
	 /*    if(browser.equals("Chrome")) {
	        driver =openChrome();
	     }
	     if(browser.equals("Edge")) {
		        driver =openEdge();
		     }*/
	     
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  //   driver.manage().window().maximize();   
	  }
	
	
	

	@BeforeClass
	public void createPOMObject() {
		 heenaLogIn = new HeenaLogIn(driver); ;
		 accessoriesPrandi = new AccessoriesPrandi(driver);
		 parantiArchive = new ParantiArchive(driver);
		 chashParandi = new ChashParandi(driver);
		 productSearch = new ProductSearch(driver);
		 helpAbout = new HelpAbout(driver);
		 heenaCheckOut = new HeenaCheckOut(driver);
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
         String actualText="Parandi";
         String expectedText="Parandi";
         String actualText1="Chash Parandi";
         String expectedText1="Chash Parandi";
         String actualText2="SHOPPING CART";
         String expectedText2="SHOPPING CART";
         SoftAssert soft =new SoftAssert();
         heenaLogIn.ClicklogInRegisterButton();
         
         heenaLogIn.ClickusernameButton(Utilitys.getDataFromExcelSheet("sheet1",row,0));
      // heenaLogIn.ClickemailButton(Utilitys.getDataFromExcelSheet("sheet1",1,1));
         heenaLogIn.ClickpasswordButton(Utilitys.getDataFromExcelSheet("sheet1",row,1));
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
         public void test2() {
         testID = "T02"; 
         System.out.println("Test2");
      
         accessoriesPrandi.ActionaccessoriesButton(); 
         accessoriesPrandi.ActionparandiButton();
         
         parantiArchive.ActionchashParandiButton();
        
         chashParandi.ClickaddtocartButton();
         chashParandi.ClickcheckoutButton();
        
       //heenaCheckOut.ClickcheckoutButton();
         heenaCheckOut.ClickokButton();
      }
       
        @Test 
        public void test3() {
        testID = "T03"; 
        System.out.println("Test3");
       
         String actualUrl="https://www.heenakochhar.com/product-category/accessories/parandi/";
         String expectedUrl="https://www.heenakochhar.com/product-category/accessories/parandi/";
         String actualText="Wishlist";
         String expectedText="Wishlist";
         SoftAssert soft =new SoftAssert();

        accessoriesPrandi.ActionaccessoriesButton(); 
        accessoriesPrandi.ActionparandiButton();
        accessoriesPrandi.Clickgridview2Button();
        accessoriesPrandi.Clickgridview3Button();
        accessoriesPrandi.Actionaddtowishlist1Button();
        accessoriesPrandi.Actionaddtowishlist2Button();
        accessoriesPrandi.Actionaddtowishlist3Button();
        accessoriesPrandi.ClickwishListButton();
     //   accessoriesPrandi.ClickwishlistremoveButton();
        soft.assertEquals(actualText, expectedText,"Home page Text is wrong");
         Assert.assertEquals(actualUrl, expectedUrl,"Home page Url is wrong");
        
         }  
        @Test
        public void test4() {
        testID = "T04"; 
        System.out.println("Test4");
        String actualUrl="https://www.heenakochhar.com/product-category/accessories/parandi/";
        String expectedUrl="https://www.heenakochhar.com/product-category/accessories/parandi/";
        String actualText="SAMAH";
        String expectedText="SAMAH";
        SoftAssert soft =new SoftAssert();

        productSearch.ClicksearchButton();
        productSearch.ClicksearchforproductsButton();
        Assert.assertEquals(actualUrl, expectedUrl,"Home page Url is wrong");

        productSearch.ClickclickProductButton();
        productSearch.ClickselectSizeButton();
        soft.assertEquals(actualText, expectedText,"Home page Text is wrong");
        soft.assertAll();
        }
       
        
        @Test (invocationCount = 3)
        public void test5() throws EncryptedDocumentException, IOException {
        testID = "T05"; 
        System.out.println("Test5");
       
        helpAbout.ActionhelpButton();
        helpAbout.ClickcontactButton();
        helpAbout.sendyourname(Utilitys.getDataFromExcelSheet("sheet1",row1,2));
        helpAbout.Sendyouremail(Utilitys.getDataFromExcelSheet("sheet1",row1,3));
        helpAbout.Sendyoursubject(Utilitys.getDataFromExcelSheet("sheet1",row1,4));
        helpAbout.Sendyourmessage(Utilitys.getDataFromExcelSheet("sheet1",row1,5));
        helpAbout.ClicksubmitButton();
        row1++;
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
	 productSearch = null;
	 helpAbout = null;
    }

  @AfterTest
  public void afterTest() {
	   
//	  driver.close();
//	 driver = null;
//	  System.gc();
  }
}



	


