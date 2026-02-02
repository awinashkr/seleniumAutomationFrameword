package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
//	private By userNameTextBox = By.xpath("//*[@id='username']");
//	private By passwordTextBox = By.xpath("//*[@id='password']");
//	private By signInButton = By.xpath("//*[@name='signin']");
	
	@FindBy(id = "username")
	private WebElement userNameTextBox;
	
	@FindBy(id="password")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//*[@name='signin']")
	private WebElement signInButton;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	
//	public void enterUserName(String username)
//	{
//		
//		driver.findElement(userNameTextBox).sendKeys(username);
//	}
//	
//	public void enterPassword(String password) {
//		driver.findElement(passwordTextBox).sendKeys(password);
//	}
//	
//	public void clickSignInButton() {
//		driver.findElement(signInButton).click();
//	}
	public void enterUserName(String username)
{
		
		userNameTextBox.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void clickSignInButton() {
		signInButton.click();
	}


}
