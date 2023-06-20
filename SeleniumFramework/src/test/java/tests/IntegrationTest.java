package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginEvents;
import utils.FetchElement;

public class IntegrationTest extends BaseTest {
    FetchElement ele = new FetchElement();
    LoginEvents loginEvents = new LoginEvents();
    HomePageEvents homePage = new HomePageEvents();

    @Test
    public void loginScenarioTest(){
        homePage.clickSignInButton();
        loginEvents.verifyLoginPageIsLoaded();
        loginEvents.enterCredentials("test@test.com", "password");
        loginEvents.clickLoginButton();
    }
}
