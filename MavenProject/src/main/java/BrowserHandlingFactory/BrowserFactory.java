package BrowserHandlingFactory;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {

	   public static RemoteWebDriver driver;
	   
	  
	   // TODO Auto-generated constructor stub
		public BrowserFactory(BrowserType browserType)throws IllegalAccessException {
		
			switch(browserType) {
			case Chrome:
				driver = new ChromeBrowser().launchBrowser();
				break;
				
			case Edge:
				driver = new EdgeBrowser().launchBrowser();
				break;
				
			default:
				throw new IllegalAccessException("Browser Not Valid");
			}
			browsersAction();
		}
		
		public void browsersAction() {
			BrowserHelper browserHelper = new BrowserHelper(driver);
			browserHelper.MaximizeBrowser();
			browserHelper.Timeouts();
			browserHelper.LaunchUrl();
			
			
			
		}
	}

