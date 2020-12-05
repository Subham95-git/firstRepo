package subham;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class ReportService {

	@Autowired
	@Qualifier("htmlReportGenerator")
	private ReportGenerator report;
	
	@Value("100")
	private int recordsPerPage;

	public ReportService() {
		System.out.println("Default Constructor");
	}

	public ReportService(int recordsPerPage) {
		System.out.println("Parametrize Constructor");
		this.recordsPerPage = recordsPerPage;
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
	
	//the method with will show the result
	public void generateReport(){
		System.out.println(report.generateReport(recordsPerPage));
	}
	
}

