package dip.solution;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String errorMessage) {
		System.out.println(errorMessage);
		System.out.println("Error message logged into Database Logger!");
	}

}
