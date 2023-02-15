package HeenakochharPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpAbout {
	public Actions act;
	
	public WebDriver driver;
	
	@FindBy (xpath ="(//span[text()='Help'])[1]")
	private WebElement help;
	
	@FindBy (xpath ="(//a[text()='Contact'])[1]")
	private WebElement contact;
	
	@FindBy (xpath ="//input[@name='your-name']")
	private WebElement yourname; 
	
	@FindBy (xpath ="//input[@name='your-email']")
	private WebElement youremail; 
	 
	@FindBy (xpath ="//input[@name='your-subject']")
	private WebElement yoursubject;
		
	@FindBy (xpath ="//textarea[@name='your-message']")
	private WebElement  yourmessage;
			
	@FindBy (xpath ="(//input[@type='submit'])[1]")
	private WebElement submit;
	
	
	  public  HelpAbout(WebDriver driver)
		{
		   PageFactory.initElements(driver, this);	
	       this.driver=driver;	 //Initialize the global driver
		   act = new Actions(driver);
		}
		
		public void ActionhelpButton()
		{
		 act.moveToElement(help).click().build().perform();
		}
		
		public void ClickcontactButton ()
		{
			contact.click();
		}
		public void sendyourname (String name)
		{
			yourname.sendKeys(name);
		}
		public void Sendyouremail (String email)
		{
			youremail.sendKeys(email);
		}
		public void Sendyoursubject (String subject)
		{
			yoursubject.sendKeys(subject);
		}
		public void  Sendyourmessage (String message)
		{
            yourmessage.sendKeys(message);
		}
		public void ClicksubmitButton()
		{
		       submit.click();
		}
				
		
	}



