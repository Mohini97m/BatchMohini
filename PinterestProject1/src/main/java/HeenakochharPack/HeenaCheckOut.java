package HeenakochharPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeenaCheckOut {
	@FindBy (xpath ="//a[text()='Checkout']")
	private WebElement checkout;

	@FindBy (xpath ="//a[text()='OK']")
	private WebElement ok;

	
	public HeenaCheckOut(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);	
	}
	public void ClickcheckoutButton()
	{
	       checkout.click();
	}
	public void ClickokButton()
	{
		ok.click();
	}
}