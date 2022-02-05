package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue="org.steps", dryRun=false, monochrome=true, strict=true,tags="@sanity",
plugin= {"pretty",
		"html:C:\\Users\\Praveen\\eclipse-workspace\\Cucumber4.30Pm\\Reports\\HTMLReport",
		"json:C:\\Users\\Praveen\\eclipse-workspace\\Cucumber4.30Pm\\Reports\\JSONReport\\jsonreport.json",
		"junit:C:\\Users\\Praveen\\eclipse-workspace\\Cucumber4.30Pm\\Reports\\JUNITReport\\junitreport.xml",
		"rerun:C:\\Users\\Praveen\\eclipse-workspace\\Cucumber4.30Pm\\Failedscenarios\\failed.txt"})
public class TestRunner {
	@AfterClass
	public static void jvm() {
		JvmReport.jvmReportGenerate("C:\\Users\\Praveen\\eclipse-workspace\\Cucumber4.30Pm\\Reports\\JSONReport\\jsonreport.json");
	}

}
