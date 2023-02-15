package HeenakochharPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeenaLogIn{
	@FindBy (xpath ="(//a[@title='My account'])[1]")
	private WebElement logInRegister;

	@FindBy (xpath ="//input[@id='username']")
	private WebElement username;

	@FindBy (xpath ="//input[@id='reg_email']")
	private WebElement email;

	@FindBy (xpath ="//input[@type='password']")
	private WebElement password;

	@FindBy (xpath ="//button[@value='Log in']")
	private WebElement logIn;
	
	@FindBy (xpath ="//a[text()='Return to the site home page']")
	private WebElement return1;
	public HeenaLogIn(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);	
	}
	public void ClicklogInRegisterButton()
	{
		logInRegister.click();
	}
	public void ClickusernameButton(String name)
	{
		username.sendKeys(name);
	}/*
	public void ClickemailButton(String em)
	{
		email.sendKeys(email);
	}
	*/
	public void ClickpasswordButton(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void ClicklogInButton()
	{
		logIn.click();
	}
	public void Clickreturn1Button()
	{
		return1.click();
	}
}
	
	

