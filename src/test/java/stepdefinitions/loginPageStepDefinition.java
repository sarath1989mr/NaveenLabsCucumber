package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.loginPage;

public class loginPageStepDefinition {
	WebDriver driver;
	String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
	loginPage lPage;
	HomePage hPage;

	@Before
	public void start() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		lPage = new loginPage(driver);
	}

	@After
	public void tearDown() {
		try {
			Thread.sleep(2000);
			driver.quit();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.err.println("Exeption : " + e);
		}

	}

	@Given("I have entered invalid {string} and {string}")
	public void I_have_entered_invalid_user_name_and_password(String un, String pwd) {

	}

	@Then("I should see an error message indicating {string}")
	public void I_should_see_an_error_message_indicating_error_msg(String errMsg) {

	}

	@Given("User is in the open cart website page")
	public void user_is_in_the_open_cart_website_page() {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}

	@Given("I have entered a valid user name and password")
	public void i_have_entered_a_valid_user_name_and_password() {
		lPage.enterUserCredentials("ds@df.com", "kingkobra");
	}

	@Then("I click on the login button")
	public void i_click_on_the_login_button() {
		lPage.clickLoginButton();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		hPage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertTrue(hPage.isInLandingPage(), "Unable to login to cart");
	}

	@When("I click on the {string} link")
	public void i_click_on_the_link(String string) {

	}

	@Then("I should be redirected to the password reset page")
	public void i_should_be_redirected_to_the_password_reset_page() {

	}

	@Then("logout from the cart")
	public void logout_from_the_cart() {
		try {
			hPage.logout();
		} catch (Exception e) {
			System.err.println("Exception : " + e);
		}
	}
}
