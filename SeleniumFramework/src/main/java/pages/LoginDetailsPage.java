package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDetailsPage {

    private final WebDriver driver;

    //Locators
    private By emailIdLocator = By.name("emailid");
    private By submitBtnLocator = By.name("btnLogin");
    private By msgLabelLocator = By.id("message9");
    private By userIdLocator = By.xpath("//td[contains(text(),'User ID')]");
    private By passwordLocator = By.xpath("//td[contains(text(),'Password')]");


    public LoginDetailsPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmailId(String email){
        WebElement emailId = driver.findElement(emailIdLocator);
        emailId.clear();
        emailId.sendKeys(email);
    }
    public void clickSubmit(){
        WebElement submitBtn = driver.findElement(submitBtnLocator);
        submitBtn.click();
    }
    public boolean checkErrorMessage(String msg){
        boolean flag = false;
        WebElement msgTxt = driver.findElement(msgLabelLocator);
        if(msgTxt.getText().equals(msg)){
           flag = true;
        }
        return flag;
    }

    public boolean checkGeneratedUserId(){
        WebElement genUserId = driver.findElement(userIdLocator);
        return genUserId.isDisplayed();
    }

    public boolean checkGeneratedPassword(){
        WebElement genPwd = driver.findElement(passwordLocator);
        return genPwd.isDisplayed();
    }


}
