package subham;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		ReportService rsv = (ReportService)context.getBean("reportService");
		rsv.generateReport();

	}

}
