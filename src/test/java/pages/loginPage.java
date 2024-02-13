package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	private WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By userNameField = By.cssSelector(" input[placeholder='E-Mail Address']");
	private By passwordField = By.xpath("//*[@type='password']");
	private By loginButton = By.xpath("//input[@type='submit']");
	private By forgotPassword = By.xpath("(//*[text()='Forgotten Password'])[1]");

	public void enterUserCredentials(String userName, String password) {
		try {
			driver.findElement(userNameField).sendKeys(userName);
			driver.findElement(passwordField).sendKeys(password);
		} catch (Exception e) {
			System.err.println("Exception : " + e);
		}
	}

	public void clickLoginButton() {
		try {
			driver.findElement(loginButton).click();
		} catch (Exception e) {
			System.err.println("Exception : " + e);
		}
	}

	public void clickForgotPassword() {
		try {
			driver.findElement(forgotPassword).click();
		} catch (Exception e) {
			System.err.println("Exception : " + e);
		}
	}
}
