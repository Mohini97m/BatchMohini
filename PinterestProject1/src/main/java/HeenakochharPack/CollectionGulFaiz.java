package HeenakochharPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectionGulFaiz {
	public Actions act;
	private WebDriver driver;
	
	@FindBy (xpath ="(//span[text()='COLLECTIONS'])[1]]")
	private WebElement collections;
	
	@FindBy (xpath ="((//a[@class='woodmart-nav-link'])[2]")
	private WebElement gulFaiz;

	@FindBy (xpath ="//a[@aria-label='Grid view 2']")
	private WebElement gridview2;
	
	@FindBy (xpath ="//a[@aria-label='Grid view 3']")
	private WebElement gridview3; 
	
	@FindBy (xpath ="//a[@aria-label='Grid view 4']")
	private WebElement gridview4; 
	
	@FindBy (xpath ="//select[@name='orderby']")
	private WebElement orderby;
	
	@FindBy (xpath ="//option[text()='Sort by popularity']")
	private WebElement sortbypopularity; 
	

	@FindBy (xpath ="//option[text()='Sort by latest']")
	private WebElement sortbylatest; 
	
	@FindBy (xpath ="//option[text()='Sort by price: low to high']")
	private WebElement sortbypricelowtohigh; 
	
	@FindBy (xpath ="//option[text()='Sort by price: high to low']")
	private WebElement sortbypricehightolow; 
	
	public CollectionGulFaiz (WebDriver driver)
	{
		 PageFactory.initElements(driver, this);
		   this.driver=driver;
		   act = new Actions(driver);
	}
	public void ActionscollectionsButton()
	{
		collections.click();	
	}
	public void ClickgulFaizButton()
	{
		gulFaiz.click();		
	}
	public void Clickgridview2Button()
	{
		gridview2.click();
	}
	public void Clicgridview3Button()
	{
		gridview3.click();
	}
	public void Clickgridview4Button()
	{
		gridview4.click();
	}
	public void ClickorderbyButton()
	{
		orderby.click();
	}
	public void ClicksortbypopularityButton()
	{
		act.moveToElement(sortbypopularity).click().build().perform();
	}
	public void ClicksortbylatestButton()
	{
		act.moveToElement(sortbylatest).click().build().perform();
	}
	public void ClicksortbypricelowtohighButton()
	{
		act.moveToElement(sortbypricelowtohigh).click().build().perform();
	}
	public void ClicksortbypricehightolowButton()
	{
		act.moveToElement(sortbypricehightolow).click().build().perform();
	}
	
	
	}


