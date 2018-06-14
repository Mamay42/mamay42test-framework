package pageobject.sideMenuPages;

import common.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import pageobject.SideMenu;

public class DroppablePage extends SideMenu {

    private static final Logger LOG = LogFactory.getLogger(DroppablePage.class);

    @FindBy(id = "ui-id-1")
    public WebElement defaultFunctionalityButton;

    @FindBy(id = "draggableview")
    public WebElement draggableviewBox;

    @FindBy(id = "droppableview")
    public WebElement droppableviewBox;

    @FindBy(xpath = "//p[.='Dropped!']")
    public WebElement nameAfterDroppableAction;


    @FindBy(id = "ui-id-2")
    public WebElement AcceptButton;

    @FindBy(id = "ui-id-3")
    public WebElement preventPropagationButton;

    @FindBy(id = "ui-id-4")
    public WebElement revertDraggablePositionButton;

    @FindBy(id = "ui-id-5")
    public WebElement shoppingCartDemoButton;


    private WebDriver driver;

    public DroppablePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public DroppablePage clickDefaultFunctionalityButton() {
        defaultFunctionalityButton.click();
        LOG.info("Default functionality selected");
        return this;
    }

    public void dropDraggableViewBox() {
        new Actions(driver)
                .dragAndDrop(draggableviewBox, droppableviewBox)
                .build()
                .perform();
    }
}
