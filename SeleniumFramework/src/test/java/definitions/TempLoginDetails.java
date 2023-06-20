package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginDetailsPage;

public class TempLoginDetails {
    private WebDriver driver;
    private LoginDetailsPage loginDetailsPage;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginDetailsPage = new LoginDetailsPage(driver);
    }

    @After
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }
    @Given("User is on the get login details page")
    public void user_is_on_the_get_login_details_page() {
        driver.get("https://demo.guru99.com/");
    }

    @When("The user provides a valid email id")
    public void the_user_provides_a_valid_email_id() {
        loginDetailsPage.enterEmailId("guru99@gmail.com");
    }
    @And("The user submits a request")
    public void the_user_submits_a_request() {
        loginDetailsPage.clickSubmit();
    }
    @Then("The temporary login details are shown")
    public void the_temporary_login_details_are_shown() {
        boolean flag = loginDetailsPage.checkGeneratedUserId();
        flag = loginDetailsPage.checkGeneratedPassword();
    }

    @When("The user provides an invalid {string}")
    public void the_user_provides_an_invalid_email_id(String emailId) {
        loginDetailsPage.enterEmailId(emailId);
    }
    @Then("An {string} is displayed")
    public void an_error_message_is_displayed(String msg) {
        boolean flag = loginDetailsPage.checkErrorMessage(msg);
    }
}
