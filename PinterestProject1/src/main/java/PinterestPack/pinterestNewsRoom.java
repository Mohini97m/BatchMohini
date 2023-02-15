package PinterestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pinterestNewsRoom {
	@FindBy (xpath ="//a[text()='Newsroom']")
	private WebElement newsroom;
	
	@FindBy (xpath ="//a[text()='News']")
	private WebElement news;
	
	@FindBy (xpath ="(//a[text()='Pinsights'])[1]")
	private WebElement pinsights ;
	
	@FindBy (xpath ="(//a[text()='Company'])[1]")
	private WebElement company;
	
	@FindBy (xpath ="(//a[text()='Gallery'])[1]")
	private WebElement gallery;
			
	@FindBy (xpath ="(//a[text()='Products'])[1]")
	private WebElement products;
	
	@FindBy (xpath ="(//a[text()='Investor relations'])[1]")
	private WebElement investorRelations;
			
	public void PinterestNewsRoom(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);	
	}
	
	public void ShownewsroomText()
	{
		newsroom.click();
	}
	
	public void ClicknewsButton ()
	{
		 news.click();
	}
	public void ClickpinsightsButton()
	{
		pinsights.click();
	}
	public void ClickcompanyButton()
	{
		company.click();
	}
	public void ClickgalleryButton()
	{
		gallery.click();
	}
	public void ClickproductsButton()
	{
		products.click();
	}
	public void ClickinvestorRelationsButton()
	{
		investorRelations.click();
	}
	
}
	


