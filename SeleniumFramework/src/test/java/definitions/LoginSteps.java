package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }
    @After
    public void tearDown(){
        if (driver!=null) {
            driver.quit();
        }
    }

    @Given("I am on the PHPTravels login page")
    public void i_am_on_the_php_travels_login_page() {
        driver.get("https://phptravels.net/login");
    }
    @When("I provide the valid login credentials")
    public void i_provide_the_valid_login_credentials() {
        loginPage.enterUsername("reyeston22@gmail.com");
        loginPage.enterPassword("Passw0rd.3");
    }
    @And("I click on Login button")
    public void i_click_on_login_button() {
        loginPage.clickLogin();
    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        loginPage.findLogoutLink();
    }

    @When("I provide an invalid {string} and {string}")
    public void i_provide_an_invalid_and(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
    @Then("I should be logged in unsuccessfully")
    public void i_should_be_logged_in_unsuccessfully() {
        loginPage.findLogoutLink();
    }
}
