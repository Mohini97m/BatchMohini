package PinterestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	//div[text()='Sign up']
		@FindBy (xpath ="//div[text()='Sign up']")
		private WebElement signUp;
		
		@FindBy (xpath ="//h1[text()='Welcome to Pinterest']")
		private WebElement welcometoPinterestText;
		
		@FindBy (xpath ="//div[text()='Find new ideas to try']")
		private WebElement findnewideastotryText;
		
		@FindBy (xpath ="//input[@type='email']")
		private WebElement email  ;
		
		@FindBy (xpath ="//input[@name='password']")
		private WebElement password ;
		
		@FindBy (xpath ="//input[@name='age']")
		private WebElement age;
				
		@FindBy (xpath ="//button[@type='submit']")
		private WebElement continue1;
		
		@FindBy (xpath ="//span[text()='Continue with Facebook']")
		private WebElement continuewithFacebook;
		
		@FindBy (xpath ="(//span[text()='Continue with Google'])[1]")
		private WebElement continuewithGoogle;
				
		public SignUp(WebDriver driver)
		{
		   PageFactory.initElements(driver, this);	
		}
		public void ClickSignUpButton()
		{
			 signUp.click();
		  
		}
		
		public void ShowwelcometoPinterestText()
		{
			String text = welcometoPinterestText.getText();
		    System.out.println(text);
		}
		public void ShowfindnewideastotryText ()
		{
		String text=findnewideastotryText.getText();
		System.out.println(text);
		}
		public void ClickemailButton1()
		{
			email.sendKeys("mohinimagar123@gmail.com");
		}
		public void ShowText()
		{
		password.sendKeys("Mohini@123");
		}
		public void ClickageButton()
		{
			age.sendKeys("19");
		}
		public void Clickcontinue1Button()
		{
			continue1.click();
		}
		public void ClickcontinuewithFacebookButton()
		{
			continuewithFacebook.click();
		}
		public void ClickcontinuewithGoogleButton()
		{
			continuewithGoogle.click();
		}
		}


