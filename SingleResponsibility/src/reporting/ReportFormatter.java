package reporting;

import enums.FormatType;

public class ReportFormatter {
	
	String formattedString;
	
	public ReportFormatter(Object object, FormatType formatType) {
		switch (formatType) {
		case CSV:
			formattedString = convertObjectToCSV(object);
			break;
		case XML:
			formattedString = convertObjectToXML(object);
			break;
		}
	}
	
	private String convertObjectToXML (Object object) {
		return "XML : <title>" + object.toString() + "</title>";
	}
	
	private String convertObjectToCSV (Object object) {
		return "CSV : ,,," + object.toString() + ",,,";
	}
	
	public String getFormmatedValue() {
		return formattedString;
	}
}
