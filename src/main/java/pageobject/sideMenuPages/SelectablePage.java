package pageobject.sideMenuPages;

import common.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import pageobject.SideMenu;

public class SelectablePage extends SideMenu {

    private static final Logger LOG = LogFactory.getLogger(SelectablePage.class);

    @FindBy(id = "ui-id-1")
    public WebElement defaultFunctionalityButton;

    @FindBy(id = "//*[@id=\"selectable\"]/li[1]")
    public WebElement functionalityElement1;
    @FindBy(id = "//*[@id=\"selectable\"]/li[2]")
    public WebElement functionalityElement2;
    @FindBy(id = "//*[@id=\"selectable\"]/li[3]")
    public WebElement functionalityElement3;
    @FindBy(id = "//*[@id=\"selectable\"]/li[4]")
    public WebElement functionalityElement4;
    @FindBy(id = "//*[@id=\"selectable\"]/li[5]")
    public WebElement functionalityElement5;
    @FindBy(id = "//*[@id=\"selectable\"]/li[6]")
    public WebElement functionalityElement6;
    @FindBy(id = "//*[@id=\"selectable\"]/li[7]")
    public WebElement functionalityElement7;

    @FindBy(id = "ui-id-2")
    public WebElement displayAsGridButton;

    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[1]")
    public WebElement gridElement1;
    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[2]")
    public WebElement gridElement2;
    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[3]")
    public WebElement gridElement3;
    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[4]")
    public WebElement gridElement4;
    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[5]")
    public WebElement gridElement5;
    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[6]")
    public WebElement gridElement6;
    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[7]")
    public WebElement gridElement7;
    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[8]")
    public WebElement gridElement8;
    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[9]")
    public WebElement gridElement9;
    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[10]")
    public WebElement gridElement10;
    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[11]")
    public WebElement gridElement11;
    @FindBy(xpath ="//*[@id=\"selectable_grid\"]/li[12]")
    public WebElement gridElement12;

    @FindBy(id = "ui-id-3")
    public WebElement serializeButton;

    @FindBy(xpath = "//*[@id=\"selectable-serialize\"]/li[1]")
    public WebElement serializeElement1;
    @FindBy(xpath = "//*[@id=\"selectable-serialize\"]/li[2]")
    public WebElement serializeElement2;
    @FindBy(xpath = "//*[@id=\"selectable-serialize\"]/li[3]")
    public WebElement serializeElement3;
    @FindBy(xpath = "//*[@id=\"selectable-serialize\"]/li[4]")
    public WebElement serializeElement4;
    @FindBy(xpath = "//*[@id=\"selectable-serialize\"]/li[5]")
    public WebElement serializeElement5;
    @FindBy(xpath = "//*[@id=\"selectable-serialize\"]/li[6]")
    public WebElement serializeElement6;


    protected WebDriver driver;
    public SelectablePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

//    public void clickAndHoldDiferentElements() {
//        new Actions(driver)
//                .keyDown(Keys.LEFT_CONTROL)
//                .click(gridElement1)
//                .click(gridElement5)
//                .click(gridElement6)
//                .click(gridElement11)
//                .keyUp(Keys.LEFT_CONTROL)
//                .build()
//                .perform();
//    }

    public SelectablePage clickDefaultFunctionalityButton(){
        defaultFunctionalityButton.click();
        LOG.info("Default functionality selected");
        return this;
    }

            public SelectablePage clickFunctionalityElement1(){
                functionalityElement1.click();
                LOG.info("functionalityElement1 selected");
                return this;
            }
            public SelectablePage clickFunctionalityElement2(){
                functionalityElement2.click();
                LOG.info("functionalityElement2 selected");
                return this;
            }public SelectablePage clickFunctionalityElement3(){
                functionalityElement3.click();
                LOG.info("functionalityElement3 selected");
                return this;
            }public SelectablePage clickfunctionalityElement4(){
                functionalityElement4.click();
                LOG.info("functionalityElement4 selected");
                return this;
            }
            public SelectablePage clickFunctionalityElement5(){
                functionalityElement5.click();
                LOG.info("functionalityElement5 selected");
                return this;
            }
            public SelectablePage clickFunctionalityElement6(){
                functionalityElement6.click();
                LOG.info("functionalityElement6 selected");
                return this;
            }
            public SelectablePage clickFunctionalityElement7(){
                functionalityElement7.click();
                LOG.info("functionalityElement7 selected");
                return this;
            }

    public SelectablePage clickDisplayAsGridButton(){
        displayAsGridButton.click();
        LOG.info("Display as Grid selected");
        return this;
    }
            public SelectablePage clickgridElement1(){
                gridElement1.click();
                LOG.info("gridElement1 selected");
                return this;
            }
            public SelectablePage clickgridElement2(){
                gridElement2.click();
                LOG.info("gridElement2 selected");
                return this;
            }
            public SelectablePage clickGridElement3(){
                gridElement3.click();
                LOG.info("gridElement3 selected");
                return this;
            }
            public SelectablePage clickGridElement4(){
                gridElement4.click();
                LOG.info("gridElement4 selected");
                return this;
            }
            public SelectablePage clickGridElement5(){
                gridElement5.click();
                LOG.info("gridElement5 selected");
                return this;
            }
            public SelectablePage clickGridElement6(){
                gridElement6.click();
                LOG.info("gridElement6 selected");
                return this;
            }
            public SelectablePage clickGridElement7(){
                gridElement7.click();
                LOG.info("gridElement7 selected");
                return this;
            }
            public SelectablePage clickGridElement8(){
                gridElement8.click();
                LOG.info("gridElement8 selected");
                return this;
            }
            public SelectablePage clickGridElement9(){
                gridElement9.click();
                LOG.info("gridElement9 selected");
                return this;
            }
            public SelectablePage clickGridElement10(){
                gridElement10.click();
                LOG.info("gridElement10 selected");
                return this;
            }
            public SelectablePage clickGridElement11(){
                gridElement11.click();
                LOG.info("gridElement11 selected");
                return this;
            }public SelectablePage clickGridElement112(){
                gridElement12.click();
                LOG.info("gridElement12 selected");
                return this;
            }
    public SelectablePage clickSerializeButton(){
        serializeButton.click();
        LOG.info("Serialize selected");
        return this;
    }
            public SelectablePage clickserializeElement1(){
                serializeElement1.click();
                LOG.info("serializeElement1 selected");
                return this;
            }
            public SelectablePage clickserializeElement2(){
                serializeElement2.click();
                LOG.info("serializeElement2 selected");
                return this;
            }
            public SelectablePage clickserializeElement3(){
                serializeElement3.click();
                LOG.info("serializeElement3 selected");
                return this;
            }
            public SelectablePage clickserializeElement4(){
                serializeElement4.click();
                LOG.info("serializeElement4 selected");
                return this;
            }
            public SelectablePage clickserializeElement5(){
                serializeElement5.click();
                LOG.info("serializeElement5 selected");
                return this;
            }
            public SelectablePage clickserializeElement6(){
                serializeElement6.click();
                LOG.info("serializeElement6 selected");
                return this;
            }





}
