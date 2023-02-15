package TestNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PinterestPack.LogIn1;

public class PinterestTest {

	@BeforeClass
		public void beforeClass() {
		System.out.println("Before Class");
		 WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   driver.manage().window().maximize();   
		  
	}
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Method");
	driver.get("https://www.redbus.in/bus-tickets");
	LogIn1 logIn1 = new LogIn1(driver);
	logIn1.ShowwelcometoPinterestText();
	logIn1.ClickemailButton();
	logIn1.ClickpasswordButton();
	logIn1.ShowforgotyourpasswordText();
	logIn1.ClicklogInText();
	logIn1.ClickcontinuewithFacebookButton();
	logIn1.ClickcontinuewithGoogleButton();
    }
	 
	@Test
	public void test() {
	System.out.println("Test");
    }

	@AfterMethod
	public void afterMethod() {
	System.out.println("After Method");
    }
	
    @AfterClass
    public void after() {
    	System.out.println("After class");
        }

	
	}


