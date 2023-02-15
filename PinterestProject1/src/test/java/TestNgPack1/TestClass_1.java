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
  public class TestClass_1{
	  
	  
	  @BeforeSuite
	  public void beforeSuite() {
	         System.out.println("Before Suite - TestClass_1");
	     }
	  @BeforeTest
	  public void beforeTest() {
	         System.out.println("Before Test - TestClass_1");
	     }
	  
      @BeforeClass
         public void beforeClass() {
         System.out.println("Before Class - TestClass_1");
     }
      @BeforeMethod
         public void beforeMethod() {
         System.out.println("Before Method - TestClass_1");
    }

      @Test
         public void test1() {
         System.out.println("Test1 - TestClass_1");
    }
      @Test
      public void test2() {
      System.out.println("Test2 - TestClass_1");
 }

      @AfterMethod
         public void afterMethod() {
         System.out.println("After Method - TestClass_1");
   }

      @AfterClass
         public void after() {
         System.out.println("After class - TestClass_1");
}
      @AfterTest
	  public void afterTest() {
	         System.out.println("After Test - TestClass_1");
	     }

      @AfterSuite
	  public void afterSuite() {
	         System.out.println("After Suite - TestClass_1");
	     }
}
  
  
  
  
  
  
  