package tests;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExtentReportManager;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin() {
		
		test = ExtentReportManager.createTest("Login Test");
		test.info("Navigating to url");
		LoginPage loginPage = new LoginPage(driver);
		test.info("enter the user anem");
		loginPage.enterPassword("awinash");
		loginPage.enterPassword("kumar");
		loginPage.clickSignInButton();
		test.info("login successfully");
		System.out.println();
		driver.getTitle();
		System.out.println();
		test.pass("Login happented");
	}
	
	@Test(invocationCount = 5,enabled=false )
	public void testLogin() {
		
		test = ExtentReportManager.createTest("Login Test");
		test.info("Navigating to url");
		LoginPage loginPage = new LoginPage(driver);
		test.info("enter the user anem");
		loginPage.enterPassword("awinash");
		loginPage.enterPassword("kumar");
		loginPage.clickSignInButton();
		test.info("login successfully");
		System.out.println();
		driver.getTitle();
		System.out.println();
		test.pass("Login happented");
	}
	
	@Test
	public void testGoogle() {
		test = ExtentReportManager.createTest("Login Test");
		test.info("Navigating to url");
		LoginPage loginPage = new LoginPage(driver);
		test.info("enter the user anem");
		loginPage.enterPassword("awinash");
		loginPage.enterPassword("kumar");
		loginPage.clickSignInButton();
		test.info("login successfully");
		System.out.println();
		driver.getTitle();
		System.out.println();
		test.pass("Login happented");
	}
	
	
}
