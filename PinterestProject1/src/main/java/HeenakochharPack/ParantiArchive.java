package HeenakochharPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParantiArchive {
	@FindBy (xpath ="(//img[@decoding='async'])[1]")
	private WebElement chashParandi;
	
	
	
	  public  ParantiArchive(WebDriver driver)
		{
		   PageFactory.initElements(driver, this);	
	       
		}
		
		public void ActionchashParandiButton()
		{
			chashParandi.click();
		}
		
		
		
	}



