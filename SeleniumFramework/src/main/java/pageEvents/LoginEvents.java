package pageEvents;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.FetchElement;

import static pageObjects.LoginPageObjects.*;


public class LoginEvents {
    FetchElement ele = new FetchElement();
    public void verifyLoginPageIsLoaded(){
        int size;
        size = ele.getWebElements(FetchElement.SELECTOR.XPATH, loginButton).size();
        boolean flag = size > 0;
        BaseTest.logger.info("Verify login page is loaded successfully - status : "+flag);
        Assert.assertTrue(flag, "Element Found");
    }

    public void enterCredentials(String email, String password){
        BaseTest.logger.info("Entering the credentials with parameters ["+email+"] "+"["+password+"]");
        WebElement txtEmail = ele.getWebElement(FetchElement.SELECTOR.NAME, emailTextField);
        txtEmail.clear();
        txtEmail.sendKeys(email);
        WebElement pwd = ele.getWebElement(FetchElement.SELECTOR.NAME, passwordTextField);
        pwd.clear();
        pwd.sendKeys(password);
    }

    public void clickLoginButton(){
        BaseTest.logger.info("Clicking the Login button");
        WebElement btnLogin = ele.getWebElement(FetchElement.SELECTOR.XPATH, loginButton);
        btnLogin.click();
    }
}
