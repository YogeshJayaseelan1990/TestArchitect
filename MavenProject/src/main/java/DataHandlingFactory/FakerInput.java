package DataHandlingFactory;

import java.util.logging.Logger;

public class FakerInput implements TestDataProvider{

	private static final Logger logger = Logger.getLogger(FakerInput.class.getName());
	
	public boolean TestDataSource() {
		logger.info("Input Data from Faker");
		return true;
	}

}
