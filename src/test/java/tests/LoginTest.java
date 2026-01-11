package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterPassword("awinash");
		loginPage.enterPassword("kumar");
		loginPage.clickSignInButton();
		System.out.println();
		driver.getTitle();
		System.out.println();
		
	}
	
	
}
