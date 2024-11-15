package DataHandlingFactory;

import java.util.logging.Logger;

public class HardcodedInput implements TestDataProvider{

	private static final Logger logger = Logger.getLogger(HardcodedInput.class.getName());
	
	public boolean TestDataSource() {
		logger.info("Input Data from HardCoded");
		return true;
	}

}
