package common;

import enums.BrowserEnum;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {

    public static final String DEMOQA_URL = "http://demoqa.com/";
    protected WebDriver driver;
    protected ScreenshotMaker screenshotMaker;


    @BeforeClass
    @Parameters("browser")
    public void beforeClass(@Optional("CHROME") BrowserEnum browserEnum) {
        driver = new WebDriverFactory(browserEnum).getDriver();
        driver.get(DEMOQA_URL);
    }


    @AfterClass
    public void tearDown() {
        driver.quit();


    }
}