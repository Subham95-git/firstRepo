package subham;

public class HTMLReportGenerator implements ReportGenerator {

	@Override
	public String generateReport(int recordsPerPage) {
		// TODO Auto-generated method stub
		return "Generated HTML Report with "+ recordsPerPage+" records";
	}

}
