import common.TestBase;
import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.sideMenuPages.DraggablePage;

public class TestDragDraggableBox extends TestBase {


    private static final int DRAG_LENGTH = 70;
    DraggablePage draggablePage;
    private Point beforeLocation;
    private Point afterLocation;

    @BeforeClass
    public void openDraggablePage() {
        draggablePage = homePage.clickDraggableButton();
    }

    @Test
    public void draggableTest() {
        draggablePage.clickDefaultFunctionalityButton();
        beforeLocation = draggablePage.draggableBox.getLocation();
        screenshotMaker.takeScreenshot(driver);
        draggablePage.dragDraggableBox(DRAG_LENGTH, DRAG_LENGTH);
        afterLocation = draggablePage.draggableBox.getLocation();
        screenshotMaker.takeScreenshot(driver);


        Assert.assertTrue(afterLocation.getX() == beforeLocation.getX() + DRAG_LENGTH,
                "Failed to drag the box by correct X offset");
        Assert.assertTrue(afterLocation.getY() == beforeLocation.getY() + DRAG_LENGTH,
                "Failed to drag the box by correct Y offset");



    }


}
