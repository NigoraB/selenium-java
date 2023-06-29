package pageEvents;

import pageObjects.DashboardPageObjects;
import utils.Constants;
import utils.FetchElement;

public class DashboardEvents {
    FetchElement ele = new FetchElement();
    public void hoverMainNavigation(){
        ele.getWebElement(Constants.SELECTOR.XPATH, DashboardPageObjects.mainNavigation_xPath).click();
    }
    public void clickContactMenu(){
        ele.getWebElement(Constants.SELECTOR.XPATH, DashboardPageObjects.contactMenu_xPath).click();
    }
}
