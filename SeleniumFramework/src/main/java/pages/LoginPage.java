package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;

    //Locators
    private final By usernameInputLocator = By.name("email");
    private final By passwordInputLocator = By.name("password");
    private final By loginButtonLocator = By.id("submitBTN");
    private final By logoutLinkLocator = By.xpath("//a[contains(text(), 'Logout')]");

    //constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String email){
        WebElement emailInput = driver.findElement(usernameInputLocator);
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String pwd){
        WebElement pwdInput = driver.findElement(passwordInputLocator);
        pwdInput.clear();
        pwdInput.sendKeys(pwd);
    }

    public void clickLogin(){
        WebElement loginBtn = driver.findElement(loginButtonLocator);
        loginBtn.click();
    }

    public boolean findLogoutLink(){
        WebElement logoutLink = driver.findElement(logoutLinkLocator);
        return logoutLink.isDisplayed();
    }
}
