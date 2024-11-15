package DataHandlingFactory;

import java.util.logging.Logger;

public class DatabaseInput implements TestDataProvider{

	private static final Logger logger = Logger.getLogger(DatabaseInput.class.getName());
	
	public boolean TestDataSource() {
		logger.info("Input Data from Database");
		return true;
	}

}
