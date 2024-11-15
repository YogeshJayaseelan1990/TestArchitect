package DataHandlingFactory;

import java.util.logging.Logger;

public class ExcelInput implements TestDataProvider{

	private static final Logger logger = Logger.getLogger(ExcelInput.class.getName());
	
	public boolean TestDataSource() {
		logger.info("Input Data from Excel");
		return true;
	}

}
