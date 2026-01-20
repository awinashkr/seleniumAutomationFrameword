package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;


import utils.ExtentReportManager;

public class BaseTest {
	protected WebDriver driver;
	protected static ExtentReports extent;
	protected ExtentTest test;
	
	@BeforeSuite
	public void setupReport() {
		extent = ExtentReportManager.getReportsInstance();
		
	}
	@AfterSuite
	public void teardownReport() {
		extent.flush();
		
	}
	
	@BeforeMethod
	public void setUp(ITestResult result) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus()== ITestResult.FAILURE) {
			String screenshotpath = ExtentReportManager.captureScreenshot(driver, "LoginFailure");
			test.fail("Test Failed.. check screenshoy", 
					MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
		
		}
		
		if(result.getStatus()== ITestResult.SUCCESS) {
			String screenshotpath = ExtentReportManager.captureScreenshot(driver, "LoginFailure");
			test.fail("Test passed.. check screenshoy", 
					MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
		
		}
		
		if(driver != null ) {
			driver.quit();
		}
	}
	
	public void takeScreenShot() {
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File srcs = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshot/helo.png";
		try {
			FileUtils.copyFile(srcs, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public void readExcel() {
		
//		C:\Users\AWINASH KUMAR\testData.xlsx
		
		
		
		
		
	}
	
}
