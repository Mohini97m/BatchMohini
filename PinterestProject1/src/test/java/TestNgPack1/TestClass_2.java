package TestNgPack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass_2 {
	
		  
		  
		  @BeforeSuite
		  public void beforeSuite() {
		         System.out.println("Before Suite - TestClass_2");
		     }
		  @BeforeTest
		  public void beforeTest() {
		         System.out.println("Before Test - TestClass_2");
		     }
		  
	      @BeforeClass
	         public void beforeClass() {
	         System.out.println("Before Class - TestClass_2");
	     }
	      @BeforeMethod
	         public void beforeMethod() {
	         System.out.println("Before Method - TestClass_2");
	    }

	      @Test
	         public void testA() {
	         System.out.println("TestA - TestClass_2");
	    }
	      @Test
	         public void testB() {
	         System.out.println("TestB - TestClass_2");
	    }

	      @AfterMethod
	         public void afterMethod() {
	         System.out.println("After Method - TestClass_2");
	   }

	      @AfterClass
	         public void afterClass() {
	         System.out.println("After class - TestClass_2");
	}
	      @AfterTest
		  public void afterTest() {
		         System.out.println("After Test - TestClass_2");
		     }

	      @AfterSuite
		  public void afterSuite() {
		         System.out.println("After Suite - TestClass_2");
		     }
	}
	  
	  
	  
	  

