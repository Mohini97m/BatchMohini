package TestNgPack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
import HeenakochharPack.Facebook;
import HeenakochharPack.GoogleMap;
import HeenakochharPack.HeenaLogIn;
import HeenakochharPack.HeenaLogOut;
import HeenakochharPack.HelpAbout;
import HeenakochharPack.ParantiArchive;
import HeenakochharPack.ProductSearch;
import utils.Utilitys;

public class HeenaKachorTest1 extends BaseBrowser{
	public class HeenaKachorTest {
		 public WebDriver driver;
		 private AccessoriesPrandi accessoriesPrandi ; 
		 private  ProductSearch productSearch;
		 private HelpAbout helpAbout ;
		 private HeenaLogIn heenaLogIn ;
		 private ParantiArchive parantiArchive ;
		 private ChashParandi chashParandi;
		 String testID;
		 int row = 1;
	    @Parameters("browser123")
		@BeforeTest
		 public void beforeTest(String browser) {
		 System.out.println("Before Class");
		if(browser.equals("Chrome")) {
		     driver = openChrome();
		}
		if(browser.equals("Edge")) {
		     driver = openEdge();
		}
		
		
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  // driver.manage().window().maximize(); 
		 } 
		
		@BeforeClass
		
		public void beforeClass() {
			System.out.println("Before Class");
			
			accessoriesPrandi = new AccessoriesPrandi(driver);
			 productSearch = new ProductSearch(driver);
			 helpAbout = new HelpAbout(driver);
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
	      @Test 
	         public void test1() throws EncryptedDocumentException, IOException {
	    	  testID="T03";
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
	         heenaLogIn.ClickusernameButton(Utilitys.getDataFromExcelSheet("sheet1",1,0));
	         heenaLogIn.ClickpasswordButton(Utilitys.getDataFromExcelSheet("sheet1",1,1));
	         heenaLogIn.ClicklogInButton();
	        // heenaLogIn.ClickreturntothesitehomepageButton();
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
	      @Test (priority = 1)
	        public void test2() {
	    	  testID="T04";
	        System.out.println("Test2");
	        System.out.println("Test1");
	         String actualUrl="https://www.heenakochhar.com/product/chash-parandi/";
	         String expectedUrl="https://www.heenakochhar.com/product/chash-parandi/";
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
	         soft.assertEquals(actualUrl, expectedUrl,"Home page Url is wrong");
	         soft.assertAll();
	         }  
	        @Test (priority = 2)
	        public void test3() {
	        	 testID="T05";
	        System.out.println("Test3");
	       
	        productSearch.ClicksearchButton();
	        productSearch.ClicksearchforproductsButton();
	        productSearch.ClickclickProductButton();
	        productSearch.ClickselectSizeButton();
	        
	        }
	       
	        
	        @Test (priority = 3)
	        public void test4() throws EncryptedDocumentException, IOException {
	        System.out.println("Test4");
	        testID="T06";
	        helpAbout.ActionhelpButton();
	        helpAbout.ClickcontactButton();
	        helpAbout.sendyourname(Utilitys.getDataFromExcelSheet("sheet1",row,2));
	        helpAbout.Sendyouremail(Utilitys.getDataFromExcelSheet("sheet1",row,3));
	        helpAbout.Sendyoursubject(Utilitys.getDataFromExcelSheet("sheet1",row,4));
	        helpAbout.Sendyourmessage(Utilitys.getDataFromExcelSheet("sheet1",row,5));
	        helpAbout.ClicksubmitButton();
	        row++;
	        }
	     @AfterMethod
	     public void afterMethod(ITestResult result) throws IOException {
	     System.out.println("After Method");
	     if(ITestResult.FAILURE == result.getStatus())
  	   {
  		   Utilitys.captureScreenshot(driver ,testID);  
  	   }
	     }

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
		accessoriesPrandi = null;
		 productSearch = null;
		 helpAbout = null;
		 heenaLogIn = null;
		 accessoriesPrandi = null;
		 parantiArchive = null;
		 chashParandi = null;
		
	    }
	@AfterTest
		public void afterTest() {
		 driver.close();
		  driver = null;
		  System.gc();
	  }
		
	}
}

	




