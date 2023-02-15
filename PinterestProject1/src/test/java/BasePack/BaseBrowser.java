package BasePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseBrowser{
	
	public static WebDriver openChrome()
	{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)-109.0.5414.74version\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     return driver;
	}
	public static WebDriver openEdge()
	{
	 System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64 (1)-110version\\msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
    return driver;
	}	
	
	
}
//"C:\Users\Admin\Downloads\edgedriver_win64 (1)-110version\msedgedriver.exe"