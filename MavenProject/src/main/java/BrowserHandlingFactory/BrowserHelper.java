package BrowserHandlingFactory;

import java.time.Duration;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserHelper {

		
		public static RemoteWebDriver driver;
		Logger logger = Logger.getLogger(BrowserHelper.class.getName());
		public BrowserHelper(RemoteWebDriver driver){
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		// TODO Auto-generated constructor stub
		public void MaximizeBrowser() {
			driver.manage().window().maximize();
			logger.info("Browser Maximized");
		}
		
		public void Timeouts() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			logger.info("Set Timeout");
		}
		
		public void LaunchUrl() {
			driver.get("www.google.com");
			 logger.info("Launched URL");
			
		}
		
		
	}

