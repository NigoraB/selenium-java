package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.*;
import utils.FetchElement;

public class E2ETest extends BaseTest {
    FetchElement ele = new FetchElement();
    LoginEvents loginEvents = new LoginEvents();
    HomePageEvents homePage = new HomePageEvents();
    ContactEvents contactEvents = new ContactEvents();
    DashboardEvents dashboardEvents = new DashboardEvents();
    @Test
    public void loginScenarioTest(){
        homePage.clickSignInButton();
        loginEvents.verifyLoginPageIsLoaded();
        loginEvents.enterCredentials("test@test.com", "password");
        loginEvents.clickLoginButton();
    }
//
//    @Test
//    public void createContact(){
//
//    }


}
