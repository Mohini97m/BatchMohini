package PinterestPack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn1 {
	@FindBy (xpath ="//div[text()='Log in']")
	private WebElement logIn1;

	@FindBy (xpath ="//h1[text()='Welcome to Pinterest']")
	private WebElement welcometoPinterest;
	
	@FindBy (xpath ="//input[@type='email']")
	private WebElement email;
	
	@FindBy (xpath ="//input[@type='password']")
	private WebElement password ;
	
	@FindBy (xpath ="//a[text()='Forgot your password?']")
	private WebElement forgotyourpassword;
	
	@FindBy (xpath ="(//div[text()='Log in'])[2]")
	private WebElement logIn;
			
	@FindBy (xpath ="//span[text()='Continue with Facebook']")
	private WebElement continuewithFacebook;
	
	@FindBy (xpath ="(//span[text()='Continue with Google'])[1]")
	private WebElement continuewithGoogle;
			
	public LogIn1(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);	
	}
	public void ClicklogIn1Button()
	{
		logIn1.click();
	}
	
	public String ShowwelcometoPinterestText()
	{
	 String text =welcometoPinterest.getText();
	 System.out.println(text);
	 return text;
	}
	public void ClickemailButton ()
	{
		email.sendKeys("mohinimagar123@gmail.com");
	}
	public void ClickpasswordButton()
	{
		password.sendKeys("Mohini@123");
	}
	public void ShowforgotyourpasswordText()
	{
	String text=forgotyourpassword.getText();
	System.out.println(text);
	}
	public void ClicklogInText()
	{
		logIn.click();
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
