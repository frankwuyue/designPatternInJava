package reporting;
import domain.Employee;
import enums.FormatType;

public class EmployeeReportFormatter extends ReportFormatter{
	
	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
	}

	public String getFormattedEmployee() {
		return getFormmatedValue();
	}
}
