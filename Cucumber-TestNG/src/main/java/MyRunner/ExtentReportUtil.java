package MyRunner;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * Created by Karthik on 21/09/2019.
 */


public class ExtentReportUtil extends BaseUtil{
	
	

    String fileName = reportLocation + "extentreport.html";
    
    
   


    public void ExtentReport() {
        //First is to create Extent Reports
        extent = new ExtentReports();
System.out.println("Need to knowwwwwwwwwww"     +File.separator);
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Test report for Selenium Basic");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Test report");

        extent.attachReporter(htmlReporter);

    }

        public void FlushReport(){
        extent.flush();
    }




}
