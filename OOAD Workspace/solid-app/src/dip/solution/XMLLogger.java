package dip.solution;

public class XMLLogger implements ILogger {

	@Override
	public void log(String errorMessage) {

		System.out.println(errorMessage);
		System.out.println("Error message logged into XML Logger!");
	}

}
