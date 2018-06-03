import common.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.sideMenuPages.FramesAndWindowsPage;

import java.util.ArrayList;

public class TestFrameTabSwitching extends TestBase {

    FramesAndWindowsPage framesAndWindowsPage;

    @BeforeClass
    public void openFrameAndWindowPage() {
        framesAndWindowsPage = homePage.clickFramesAndWindowsButton();
    }

    @Test
    public void switchFrame() {
        framesAndWindowsPage.clickFrameset()
                .clickOpenFramesetWindow();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.switchTo().frame(framesAndWindowsPage.contentFrame);


    }

}
