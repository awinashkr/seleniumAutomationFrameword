package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By userNameTextBox = By.xpath("//*[@id='username']");
	private By passwordTextBox = By.xpath("//*[@id='password']");
	private By signInButton = By.xpath("//*[@name='signin']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver; 
	}
	
	
	public void enterUserName(String username) {
		
		driver.findElement(userNameTextBox).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordTextBox).sendKeys(password);
	}
	
	public void clickSignInButton() {
		driver.findElement(signInButton).click();
	}
	
	

}
