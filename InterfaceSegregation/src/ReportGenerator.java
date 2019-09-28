
public class ReportGenerator {
	private Reporting reporting;
	
	public void generateReport() {
		System.out.println(reporting.getName() + reporting.getDate() + reporting.getProductBreakDown());
	}
}
