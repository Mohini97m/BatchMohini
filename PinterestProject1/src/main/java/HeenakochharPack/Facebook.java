package HeenakochharPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {

	@FindBy (xpath ="(//span[text()='Photos'])[2]")
	private WebElement photos;
	
	@FindBy (xpath ="(//img[@alt='May be an image of 1 person'])[1]")
	private WebElement image;
	
	@FindBy (xpath ="//div[@aria-label='Enter full-screen']")
	private WebElement enterfullscreen ;

	
	
	
	  public  Facebook(WebDriver driver)
		{
		   PageFactory.initElements(driver, this);	
	       
		}
		
		public void ClickPhotosButton()
		{
			photos.click();
		}
		
		public void ClickImage()
		{
			image.click();
		}
		public void ClickenterfullscreenButton ()
		{
			enterfullscreen.click();
		}
		
		

}
