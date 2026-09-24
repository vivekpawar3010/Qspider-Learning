package TestCases;

import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ThirdParyReport {

	
	@Test
	public void main1() throws InterruptedException {
	
		
		// first we have to create the object for spark reprot 
		
		ExtentSparkReporter spark = new ExtentSparkReporter(".\\src\\test\\resources\\simple.html");
		
		// configure report details
		spark.config().setDocumentTitle("DemoWebshop");
		spark.config().setReportName("Raju");
		spark.config().setTheme(Theme.DARK);
		
		
		// create the report 
		ExtentReports report = new ExtentReports();
		
		// add the system configration 
		report.setSystemInfo("Os", "windows-11");
		report.setSystemInfo("Broswer", "chrome-11");
		
		//attach spart to the report
		report.attachReporter(spark);
		
		
		// ---------------- Create the Reprot --------------
		
		ExtentTest test1 = report.createTest("main1");
		test1.log(Status.INFO, "Test1 is Executed");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(7000);
		
		//attach screenshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		test1.addScreenCaptureFromBase64String(screenshot);
		Thread.sleep(1000);
		
		driver.close();
		
		test1.log(Status.PASS, "Test1 is having Passed");
		
		
		
		
		
//		ExtentTest test2 = report.createTest("main2");
//		test2.log(Status.INFO, "Test2 is Executed");
//		test2.log(Status.SKIP, "Test2 is skipped becuase test 1 is failed");
//		
		
		
		
		//disconnect
		report.flush();
	}
}
