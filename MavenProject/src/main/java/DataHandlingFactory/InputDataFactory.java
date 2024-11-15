package DataHandlingFactory;

public class InputDataFactory {

	public static TestDataProvider SwitchDataProvider(InputType datatype) {
		switch(datatype) {
		case API:
			return new APIInput();
		case Database:
			return new DatabaseInput();
		case Faker:
			return new FakerInput();
		case Hardcoded:
			return new HardcodedInput();
		case Excel:
		return new ExcelInput();
		default:
			throw new IllegalArgumentException("Unknow Input Type");
	}

}
}