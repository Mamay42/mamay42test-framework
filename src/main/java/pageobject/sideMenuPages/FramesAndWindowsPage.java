package pageobject.sideMenuPages;

import common.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import pageobject.SideMenu;

public class FramesAndWindowsPage extends SideMenu {

    private static final Logger LOG = LogFactory.getLogger(FramesAndWindowsPage.class);


    @FindBy(id = "ui-id-1" )
    public WebElement openNewWindowButton;
    @FindBy(id = "ui-id-2" )
    public WebElement openSeprateNewWindowButton;
    @FindBy(id ="ui-id-3" )
    public WebElement framesetButton;


    @FindBy(xpath = "//a[text()='New Browser Tab']")
    public WebElement newBrowserTab;

    @FindBy(xpath = "//a[text()='Open New Seprate Window']")
    public WebElement openNewSeprateWindow;

    @FindBy(xpath = "//a[text()='Open Frameset Window']")
    public WebElement openFramesetWindow;

    @FindBy(xpath = "//frame[@name= 'contentFrame']")
    public WebElement contentFrame;


    protected WebDriver driver;

    public FramesAndWindowsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public FramesAndWindowsPage clickOpenNewWindowButton(){
        openNewWindowButton.click();
        LOG.info("Open New Window Button selected");
        return this;
        }
    public FramesAndWindowsPage clickOpenSeprateNewWindow(){
        openSeprateNewWindowButton.click();
        LOG.info("Open Seprate New Window selected");
        return this;
    }
    public FramesAndWindowsPage clickFrameset(){
        framesetButton.click();
        LOG.info("Frameset selected");
        return this;
    }

    public FramesAndWindowsPage clickNewBrowserTab(){
        newBrowserTab.click();
        LOG.info("New Browser Tab clicked");
        return this;
    }
    public FramesAndWindowsPage clickOpenNewSeprateWindow(){
        openNewSeprateWindow.click();
        LOG.info("open New Seprate Window clicked");
        return this;
    }
    public FramesAndWindowsPage clickOpenFramesetWindow(){
        openFramesetWindow.click();
        LOG.info("Open Frameset Window clicked");
        return this;
    }

}
