package Reportsdemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//Ready made library use it to every project 
public class ExtentManager {

	public static ExtentReports extent;
	public static ExtentReports getInstance() 
	{
		
		if(extent==null)
		{
			extent=createInstance();
			return extent;
		}
		else 
		{
			return extent;
		}
		
	}
	private static ExtentReports createInstance() {
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports"+System.currentTimeMillis()+"/swaglab.html");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("NewTestReport");
		sparkReporter.config().setDocumentTitle("sprint 1 report");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		return extent;
		
	}
}
