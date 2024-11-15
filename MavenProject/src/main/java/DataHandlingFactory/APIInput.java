package DataHandlingFactory;

import java.util.logging.Logger;

public class APIInput implements TestDataProvider{

	private static final Logger logger = Logger.getLogger(APIInput.class.getName());
	
	public boolean TestDataSource() {
		logger.info("Input Data from API");
		return true;
	}

}
