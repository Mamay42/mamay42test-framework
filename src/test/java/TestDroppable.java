import common.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.sideMenuPages.DroppablePage;

public class TestDroppable extends TestBase {

    private DroppablePage droppablePage;

    @BeforeClass
    public void openDroppablePage() {
        droppablePage = homePage.clickDroppableButton();
    }

    @Test
    public void dropElementToDroppableBox() {
        droppablePage.clickDefaultFunctionalityButton();
        droppablePage.dropDraggableViewBox();

        Assert.assertTrue(droppablePage.nameAfterDroppableAction.isDisplayed());

    }


}
