package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "(//*[text()='Logout'])[2]")
	WebElement logout;

	public boolean isInLandingPage() {
		boolean status = false;
		try {
			String tex = logout.getText().toString().trim();
			status = tex.equalsIgnoreCase("Logout");
		} catch (Exception e) {
			System.err.println("Exception : " + e);
		}
		return status;
	}

	public void logout() {
		try {
			logout.click();
		} catch (Exception e) {
			System.err.println("Exception : " + e);
		}
	}

}
