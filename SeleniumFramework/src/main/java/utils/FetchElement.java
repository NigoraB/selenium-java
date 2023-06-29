package utils;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Constants.SELECTOR;

import java.util.List;

public class FetchElement{

    public WebElement getWebElement(SELECTOR identifierType , String identifierValue) {
        WebElement result;
        switch (identifierType) {
            case XPATH:
                result = BaseTest.driver.findElement(By.xpath(identifierValue));
                break;
            case CSS:
                result = BaseTest.driver.findElement(By.cssSelector(identifierValue));
                break;
            case NAME:
                result = BaseTest.driver.findElement(By.name(identifierValue));
                break;
            case ID:
                result = BaseTest.driver.findElement(By.id(identifierValue));
                break;
            default:
                result = null;
                break;
        }
        return result;
    }
    public List<WebElement> getWebElements(SELECTOR identifierType, String identifierValue){
        switch (identifierType){
            case XPATH:
                return BaseTest.driver.findElements(By.xpath(identifierValue));
            case CSS:
                return BaseTest.driver.findElements(By.cssSelector(identifierValue));
            case NAME:
                return BaseTest.driver.findElements(By.name(identifierValue));
            case ID:
                return BaseTest.driver.findElements(By.id(identifierValue));
            default:
                return null;
        }
    }

}
