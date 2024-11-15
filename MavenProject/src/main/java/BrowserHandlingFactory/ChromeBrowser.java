package BrowserHandlingFactory;


import java.util.logging.Logger;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeBrowser implements LaunchBrowser{

	public static RemoteWebDriver driver;
	Logger logger = Logger.getLogger(ChromeBrowser.class.getName());
 
	public RemoteWebDriver launchBrowser() {
		driver = new ChromeDriver();
		logger.info("Chrome Browser Is Laucnged");
		return driver;
		
	}

}
