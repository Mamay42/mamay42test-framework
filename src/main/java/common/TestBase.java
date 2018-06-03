package common;

import enums.BrowserEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pageobject.HomePage;
import util.ScreenshotMaker;

public class TestBase {

    public static final String DEMOQA_URL = "http://demoqa.com/";
    protected WebDriver driver;
    protected HomePage homePage;
    protected ScreenshotMaker screenshotMaker = new ScreenshotMaker(driver);


    @BeforeClass
    @Parameters("browser")
    public void beforeClass(@Optional("CHROME") BrowserEnum browserEnum) {
        driver = new WebDriverFactory(browserEnum).getDriver();
        driver.get(DEMOQA_URL);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @AfterClass
    public void tearDown() {
        driver.quit();


    }
}
