package org.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void jvmReportGenerate(String json) {
		File f = new File("C:\\Users\\Praveen\\eclipse-workspace\\Cucumber4.30Pm\\Reports\\JVMReport");
		Configuration c = new Configuration(f, "Social Application");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Browser", "Chrome");
		List<String> l = new LinkedList<String>();
		l.add(json);
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
	}

}
