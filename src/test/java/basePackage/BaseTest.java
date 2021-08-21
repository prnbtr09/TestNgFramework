package basePackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants;

public class BaseTest {

	public static WebDriver driver;
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	static ExtentTest logger;
	 

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+File.separator+"reports"+File.separator+"AutomtionReport.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation QA", "Prince Kumar");
	}

//	@AfterMethod
//	public void afterMethod(ITestResult testResult) {
//		System.out.println("after test");
//		if(testResult.getStatus()==ITestResult.SUCCESS) {
//			String methodName=testResult.getMethod().getMethodName();
//			String logText="Test case for "+methodName+" is Passed";
//			Markup markUp=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
//			logger.log(Status.PASS, markUp);
//		}else if(testResult.getStatus()==ITestResult.FAILURE) {
//			String methodName=testResult.getMethod().getMethodName();
//			String logText="Test case for "+methodName+" is Failed";
//			Markup markUp=MarkupHelper.createLabel(logText, ExtentColor.RED);
//			logger.log(Status.FAIL, markUp);
//		}
//		extent.flush();
//		
//	}

	@Parameters(value="browserName")
	@BeforeSuite
	public void beforeSuite(String browserName ) {
//		logger=extent.createTest(testmethod.getName());
		System.out.println("before suite");
		setUpDriver(browserName);
//		ChromeOptions options = new ChromeOptions(); 
//		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.APPLICATION_URL);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}
	
	@AfterTest(alwaysRun=true)
	public void afterTest() {
		System.out.println("test");
		driver.quit();
	}
	
	/*
	 * @AfterSuite(alwaysRun=true) public void afterTest() {
	 * 
	 * driver.close(); }
	 */
	
	
	
public void setUpDriver(String browserName) {
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prikumar9\\eclipse-workspace\\Interview\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		
	}
}
	
	
	
}
