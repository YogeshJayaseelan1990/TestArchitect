package DataHandlingFactory;

public class TestData {

	public static void main(String[] args) {
		InputDataFactory.SwitchDataProvider(InputType.API).TestDataSource();
		InputDataFactory.SwitchDataProvider(InputType.Database).TestDataSource();
		InputDataFactory.SwitchDataProvider(InputType.Excel).TestDataSource();
		InputDataFactory.SwitchDataProvider(InputType.Faker).TestDataSource();
		InputDataFactory.SwitchDataProvider(InputType.Hardcoded).TestDataSource();
		
	}

}
