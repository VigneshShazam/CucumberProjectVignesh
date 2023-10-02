package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.superclass.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", dryRun = false, monochrome = true, tags = "@All", plugin = {
		"html:target\\Reports", "junit:target\\Reports\\HealthCareReport1.xml",
		"json:target\\Reports\\HealthCareReport2.json"})

public class Healthcare1TestRunnerClass extends JVMReports {

	@AfterClass
	public static void CallReport() {
		generateJVMReport(System.getProperty("user.dir") + "\\target\\Reports\\HealthCareReport2.json");
	}
}
