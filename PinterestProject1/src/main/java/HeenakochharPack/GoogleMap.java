package HeenakochharPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMap {

	@FindBy (xpath ="//input[@class='searchboxinput xiQnY']")
	private WebElement searchGoogleMaps;
	
	@FindBy (xpath ="//span[text()='Roza’s Bake N Café']")
	private WebElement heenakochaar;
	
	@FindBy (xpath ="(//div[@role='gridcell'])[2]")
	private WebElement dropdown;

	
	@FindBy (xpath ="(//button[@aria-label='Search'])[1]")
	private WebElement search;
	
	@FindBy (xpath ="//button[@data-value='Directions']")
	private WebElement directions; 
	
	@FindBy (xpath ="(//input[@class='tactile-searchbox-input'])[1]")
	private WebElement tactilesearchbox; 
	 
	@FindBy (xpath ="//div[@aria-label='Bus, 12:12 PM from Khel Gaon, 22 hr 9 min']")
	private WebElement busClick;
	
	
	  public  GoogleMap(WebDriver driver)
		{
		   PageFactory.initElements(driver, this);	
	       
		}
		
		public void SendsearchGoogleMaps(String search)
		{
			 searchGoogleMaps.sendKeys(search);
		}
		
		public void ClickheenakochaarButton()
		{
			heenakochaar.click();
		}
		public void ClickdrpdownButton ()
		{
			dropdown.click();
		}
		public void Clicksearch()
		{
			search.click();
		}
		public void ClickdirectionsButton ()
		{
			directions.click();
		}
		public void ClicktactilesearchboxButton (String search)
		{
			tactilesearchbox.sendKeys(search)	;	
			}
		
		public void ClickbusClickButton ()
		{
			busClick.click();
		}

		

		
		
		
	}

