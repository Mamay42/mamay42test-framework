package pageobject.sideMenuPages;

import common.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import pageobject.SideMenu;

public class DraggablePage extends SideMenu {

    private static final Logger LOG = LogFactory.getLogger(DraggablePage.class);

    @FindBy(id = "ui-id-1")
    public WebElement defaultFunctionalityButton;

    @FindBy(id="draggable")
    public WebElement draggableBox;

    @FindBy(id = "ui-id-2")
    public WebElement constrainMovementButton;

    @FindBy(id = "ui-id-3")
    public WebElement cursorStyleButton;

    @FindBy(id = "ui-id-4")
    public WebElement eventsButton;

    @FindBy(id = "ui-id-5")
    public WebElement draggableSortableButton;


    private WebDriver driver;

    public DraggablePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public DraggablePage clickDefaultFunctionalityButton(){
        defaultFunctionalityButton.click();
        LOG.info("Default functionality selected");
        return this;
    }

    public void dragDraggableBox(int xOffset, int yOffset) {
        new Actions(driver)
                .dragAndDropBy(draggableBox, xOffset, yOffset)
                .build()
                .perform();
    }

    public DraggablePage clickConstrainMovementButton(){
        constrainMovementButton.click();
        LOG.info("Constrain movement selected");
        return this;
    }
    public DraggablePage clickCursorStyleButton(){
        cursorStyleButton.click();
        LOG.info("Cursor Style selected");
        return this;
    }
    public DraggablePage clickEventsButton(){
        eventsButton.click();
        LOG.info("Events selected");
        return this;
    }
    public DraggablePage clickDraggablrSortableButton(){
        draggableSortableButton.click();
        LOG.info("Draggablr & Sortable selected");
        return this;
    }

}