package dip.violation;

public class TaxCalculator {

	private LogType logType;

	public TaxCalculator(LogType newLogType) {
		logType = newLogType;
	}

	public int calcTax(int amount, int rate) {
		
		int rent = 0;
		try {
			rent = amount / rate;
		} catch (Exception exp) {
			String errorMessage= exp.getMessage();
			if (logType == LogType.DATABASE) {
				new DatabaseLogger().log(errorMessage);;
			}
			if (logType == LogType.XML) {
				new XMLLogger();
			}
		}
		return rent;
	}
}
