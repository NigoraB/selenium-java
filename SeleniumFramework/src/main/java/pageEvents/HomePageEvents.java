package pageEvents;

import pageObjects.HomePageObjects;
import utils.Constants;
import utils.FetchElement;

public class HomePageEvents {
    FetchElement ele = new FetchElement();
    public void clickSignInButton(){
        ele.getWebElement(Constants.SELECTOR.XPATH, HomePageObjects.loginButton_xPath).click();
    }
}
