package BrowserHandlingFactory;


import java.util.logging.Logger;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EdgeBrowser implements LaunchBrowser{

	public static EdgeBrowser driver;
	Logger logger = Logger.getLogger(ChromeBrowser.class.getName());
 
	public RemoteWebDriver launchBrowser() {
		EdgeDriver driver = new EdgeDriver();
		logger.info("Chrome Browser Is Laucnged");
		return driver;
		
	}

}
