import common.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.sideMenuPages.SelectablePage;

public class TestSelectable extends TestBase {

    SelectablePage selectablePage;
    @BeforeClass
    public void openSelectablePage() {
        selectablePage = homePage.clickSelectablebleButton();
    }

    @Test
    public void clickGridElements() {
        selectablePage.clickDisplayAsGridButton();
        new Actions(driver)
                .keyDown(Keys.LEFT_CONTROL)
                .click(selectablePage.gridElement1)
                .click(selectablePage.gridElement5)
                .click(selectablePage.gridElement6)
                .click(selectablePage.gridElement11)
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
        screenshotMaker.takeScreenshot(driver);
        Assert.assertTrue(selectablePage.gridElement1.isEnabled(), "This item is not selected");
        Assert.assertTrue(selectablePage.gridElement5.isEnabled(), "This item is not selected");
        Assert.assertTrue(selectablePage.gridElement6.isEnabled(), "This item is not selected");
        Assert.assertTrue(selectablePage.gridElement11.isEnabled(), "This item is not selected");

    }
}
