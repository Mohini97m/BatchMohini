package HeenakochharPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeenaLogOut {
	
	@FindBy (xpath ="(//a[@title='My account'])[1]")
	private WebElement myAccount;

	@FindBy (xpath ="(//span[text()='Logout'])[1]")
	private WebElement logout;


	
	public HeenaLogOut(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	   
	   
	}
	public void ClickmyAccounttButton()
	{
	myAccount.click();	
	}
	public void ClicklogoutButton()
	{
		logout.click();
	}
}
