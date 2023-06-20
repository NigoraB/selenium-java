package pageEvents;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.FetchElement;

import static pageObjects.LoginPageObjects.*;


public class LoginEvents {
    FetchElement ele = new FetchElement();
    public void verifyLoginPageIsLoaded(){
        Assert.assertEquals(ele.getWebElements(FetchElement.SELECTOR.XPATH, loginButton).size(), 0, "Element found");
    }

    public void enterCredentials(String email, String password){

        WebElement txtEmail = ele.getWebElement(FetchElement.SELECTOR.NAME, emailTextField);
        txtEmail.clear();
        txtEmail.sendKeys(email);
        WebElement pwd = ele.getWebElement(FetchElement.SELECTOR.NAME, passwordTextField);
        pwd.clear();
        pwd.sendKeys(password);
    }

    public void clickLoginButton(){
       WebElement btnLogin = ele.getWebElement(FetchElement.SELECTOR.XPATH, loginButton);
       btnLogin.click();
    }
}
