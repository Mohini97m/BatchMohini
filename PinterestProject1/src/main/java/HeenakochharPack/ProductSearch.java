package HeenakochharPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductSearch {
	
	@FindBy (xpath ="(//a[@aria-label='Search'])[1]")
	private WebElement search;

	@FindBy (xpath ="(//input[@title='Search for products'])[2]")
	private WebElement searchforproducts;
	
	@FindBy (xpath ="(//div[@class='suggestion-thumb'])[1]")
	private WebElement clickProduct;
	
	@FindBy (xpath ="//select[@id='pa_size']")
	private WebElement selectSize;
	
	public ProductSearch(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);	
	}
	public void ClicksearchButton()
	{
		search.click();
	}
	public void ClicksearchforproductsButton ()
	{
		searchforproducts.sendKeys("jut");
	}
	public void ClickclickProductButton()
	{
		clickProduct.click();
	}
	public void ClickselectSizeButton()
	{
		Select s = new Select(selectSize);
		s.selectByVisibleText("36");
		
	}
}
	
	


