package pageobject.sideMenuPages;

import org.openqa.selenium.WebDriver;
import pageobject.SideMenu;

public class FramesAndWindowsPage extends SideMenu {

    private WebDriver driver;

    public FramesAndWindowsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}
