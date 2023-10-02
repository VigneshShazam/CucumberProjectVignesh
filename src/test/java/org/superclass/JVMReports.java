package org.superclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	public static void generateJVMReport(String jsonpath) {
		
		File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\Cucumber");
		
		Configuration vi = new Configuration(f, "HealthCareProject");
		vi.addClassifications("Browser Name", "Edge Browser");
		vi.addClassifications("Browser Version", "116.0.1938.69");
		vi.addClassifications("Operating System", "Windows 10 PRO");
		vi.addClassifications("Name", "VIGNESH.D");
		vi.addClassifications("Time Zone", "IST");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder(li, vi);
		r.generateReports();
	}
}
