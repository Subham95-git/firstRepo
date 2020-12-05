package subham;

public class ReportService {

	private ReportGenerator report;
	private int recordsPerPage;
	
	public ReportService() {
		// TODO Auto-generated constructor stub
	}
	
	public ReportService(ReportGenerator report, int recordsPerPage){
		this.report = report;
		this.recordsPerPage = recordsPerPage;
	}

	public void generateReport() {
        System.out.println(report.generateReport(recordsPerPage));
    }
	
	public ReportGenerator getReport() {
		return report;
	}

	public void setReport(ReportGenerator report) {
		this.report = report;
	}

	public int getRecordsPerPage() {
		return recordsPerPage;
	}

	public void setRecordsPerPage(int recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}
	
	
}
