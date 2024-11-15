package BrowserHandlingFactory;


import java.util.logging.Logger;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxBrowser implements LaunchBrowser{

	public static FirefoxBrowser driver;
	Logger logger = Logger.getLogger(ChromeBrowser.class.getName());
 
	public RemoteWebDriver launchBrowser() {
		FirefoxDriver driver = new FirefoxDriver();
		logger.info("Chrome Browser Is Laucnged");
		return driver;
		
	}

}
