package PinterestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pinterest {

	public class Pinterest {
		@FindBy (xpath ="//a[text()='About']")
		private WebElement about;
		
		@FindBy (xpath ="//a[text()='Business']")
		private WebElement business;
		
		@FindBy (xpath ="//a[text()='Blog']")
		private WebElement blog ;
		
		@FindBy (xpath ="//div[text()='Log in']")
		private WebElement logIn ;
		
		@FindBy (xpath ="//div[text()='Sign up']")
		private WebElement signUp;
				
		public Pinterest(WebDriver driver)
		{
		   PageFactory.initElements(driver, this);	
		}
		
		public void ClickaboutButton()
		{
			about.click();
		}
		public void ClickbusinessButton ()
		{
			business.click();
		}
		public void ClickblogButton()
		{
			blog.click();
		}
		public void ClicklogInButton()
		{
			logIn.click();
		}
		public void ClicksignUpButton()
		{
			signUp.click();
		}
		}

	}


