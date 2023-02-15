package HeenakochharPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPrandi {
	  private WebDriver driver;
		
		private Actions act;
		
		@FindBy (xpath ="//h1[@class='entry-title title']")
		private WebElement parandiText;
		
		@FindBy (xpath ="(//span[text()='Accessories'])[1]")
		private WebElement accessories;
		
		@FindBy (xpath ="(//a[text()='Parandi'])[1]")
		private WebElement parandi;
		
		@FindBy (xpath ="//a[@aria-label='Grid view 2']")
		private WebElement gridview2; 
		
		@FindBy (xpath ="//a[@aria-label='Grid view 3']")
		private WebElement gridview3; 
		 
		@FindBy (xpath ="(//span[text()='Add to wishlist'])[1]")
		private WebElement addtowishlist1;
			
		@FindBy (xpath ="(//span[text()='Add to wishlist'])[2]")
		private WebElement addtowishlist2 ;
				
		@FindBy (xpath ="(//span[text()='Add to wishlist'])[3]")
		private WebElement addtowishlist3;
				
		@FindBy (xpath ="(//div[@title='My Wishlist'])[1]")
		private WebElement wishList;
		
		@FindBy (xpath ="//a[@class='wd-wishlist-remove']")
		private WebElement wishlistremove;
		
		  public  AccessoriesPrandi(WebDriver driver)
			{
			   PageFactory.initElements(driver, this);	
		       this.driver=driver;	 //Initialize the global driver
			   act = new Actions(driver);
			}
		  public void ShowparandiText ()
			{
			  parandiText.click();
			}
			
			public void ActionaccessoriesButton()
			{
			 act.moveToElement(accessories).click().build().perform();
			}
			
			public void ActionparandiButton ()
			{
				act.moveToElement(parandi).click().build().perform();
			}
			public void Clickgridview2Button ()
			{
				gridview2.click();
			}
			public void Clickgridview3Button ()
			{
				gridview3.click();
			}
			public void Actionaddtowishlist1Button ()
			{
				act.moveToElement(addtowishlist1).click().build().perform();
			}
			public void Actionaddtowishlist2Button ()
			{
				act.moveToElement(addtowishlist2).click().build().perform();
			}
			public void Actionaddtowishlist3Button ()
			{
				act.moveToElement(addtowishlist3).click().build().perform();
			}
			public void ClickwishListButton ()
			{
				wishList.click();
			}
			public void ClickwishlistremoveButton ()
			{
			       wishlistremove.click();
			}
			
			
		}




