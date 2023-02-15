package HeenakochharPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChashParandi {
	@FindBy (xpath ="//button[text()='Add to cart']")
	private WebElement addtocart;

	@FindBy (xpath ="(//a[text()='View cart'])[2]")
	private WebElement viewcart;
	
	@FindBy (xpath ="//a[text()='Checkout']")
	private WebElement checkout; 
	
	@FindBy (xpath ="//strong[text()='- By Prior Appointments Only']")
	private WebElement byPriorAppointmentsOnly; 
	
	@FindBy (xpath ="(//a[@aria-label='Facebook social link'])[2]")
	private WebElement facebooksociallink; 
	
	public ChashParandi(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);	
	}
	public void ClickaddtocartButton()
	{
		addtocart.click();
	}

	public void ClickviewcartButton()
	{
		viewcart.click();
	}
	public void ClickcheckoutButton()
	{
		checkout.click();
	}
	public void ClickbyPriorAppointmentsOnlyButton()
	{
		byPriorAppointmentsOnly.click();
	}
	public void ClickfacebooksociallinkButton()
	{
		facebooksociallink.click();
	}
	
	}


