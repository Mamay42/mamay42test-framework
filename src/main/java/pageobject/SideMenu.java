package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobject.sideMenuPages.RegistrationPage;

public class SideMenu extends  TopMenu{
//    private static  final Logger LOG = LogFactory.getLogger(SideMenu.class);


    @FindBy(id = "menu-item-374")
    protected WebElement registrationButton;
    @FindBy(id = "menu-item-140")
    protected WebElement draggableButton;
    @FindBy(id = "menu-item-141")
    protected WebElement droppablebleButton;
    @FindBy(id = "menu-item-143")
    protected WebElement resizableButton;
    @FindBy(id = "menu-item-142")
    protected WebElement selectablebleButton;
    @FindBy(id = "menu-item-151")
    protected WebElement sortableButton;
    @FindBy(id = "menu-item-144")
    protected WebElement accordionButton;
    @FindBy(id = "menu-item-145")
    protected WebElement autocomleteButton;
    @FindBy(id = "menu-item-146")
    protected WebElement datepickerButton;
    @FindBy(id = "menu-item-147")
    protected WebElement menuButton;
    @FindBy(id = "menu-item-97")
    protected WebElement sliderButton;
    @FindBy(id = "menu-item-98")
    protected WebElement tabsButton;
    @FindBy(id = "menu-item-99")
    protected WebElement tooltipButton;
    @FindBy(id = "menu-item-148")
    protected WebElement framesAndWindowsButton;

    private WebDriver driver;

    public SideMenu(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public RegistrationPage clickRegistrationButton() {
        registrationButton.click();
        return PageFactory.initElements(driver, RegistrationPage.class);

    }
    public SideMenu clickDraggableButtonButton() {
        draggableButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }
    public SideMenu clickDroppablebleButtonButton() {
        droppablebleButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }
    public SideMenu clickResizableButtonButton() {
        resizableButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }
    public SideMenu clickSelectablebleButtonButton() {
        selectablebleButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }
    public SideMenu clickSortableButtonButton() {
        sortableButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }
    public SideMenu clickAccordionButtonButton() {
        accordionButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }public SideMenu clickAutocomleteButtonButton() {
        autocomleteButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }
    public SideMenu clickDatepickerButtonButton() {
        datepickerButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }
    public SideMenu clickMenuButtonButton() {
        menuButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }
    public SideMenu clickSliderButtonButton() {
        sliderButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }
    public SideMenu clickTabsButtonButton() {
        tabsButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }
    public SideMenu clickTooltipButtonButton() {
        tooltipButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }
    public SideMenu clickFramesAndWindowsButtonButton() {
        framesAndWindowsButton.click();
        return PageFactory.initElements(driver, SideMenu.class);

    }


}
