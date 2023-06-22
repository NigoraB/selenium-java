package pageEvents;

import pageObjects.DashboardPageObjects;
import pageObjects.HomePageObjects;
import utils.FetchElement;

public class DashboardEvents {
    FetchElement ele = new FetchElement();
    public void hoverMainNavigation(){
        ele.getWebElement(FetchElement.SELECTOR.XPATH, DashboardPageObjects.mainNavigation).click();
    }
    public void clickContactMenu(){
        ele.getWebElement(FetchElement.SELECTOR.XPATH, DashboardPageObjects.contactMenu).click();
    }
}
