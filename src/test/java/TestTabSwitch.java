import common.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.sideMenuPages.FramesAndWindowsPage;

import java.util.ArrayList;

public class TestTabSwitch extends TestBase {

    FramesAndWindowsPage framesAndWindowsPage;

    @BeforeClass
    public void openFrameAndWindowPage() {
        framesAndWindowsPage = homePage.clickFramesAndWindowsButton();

    }

    @Test
    public void stwitchTab() {
        framesAndWindowsPage.clickOpenNewWindowButton()
                .clickNewBrowserTab(); /* open new tab and switch on it */

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));  /* switch to previous tab */
    }
}
