package pageEvents;

import pageObjects.HomePageObjects;
import utils.FetchElement;

public class HomePageEvents {
    FetchElement ele = new FetchElement();
    public void clickSignInButton(){
        ele.getWebElement(FetchElement.SELECTOR.XPATH, HomePageObjects.loginButton).click();
    }
}
