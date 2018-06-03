package util;

import common.LogFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;

import java.io.File;
import java.io.IOException;

public class ScreenshotMaker {

    private static final Logger LOG = LogFactory.getLogger(ScreenshotMaker.class);

    private File source;
    private WebDriver driver;

    public ScreenshotMaker(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenshot(WebDriver driver) {

        String screenshotName = ("target/screenshots/" + System.currentTimeMillis() + "sc.png");
        try {
            source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source,
                    new File(screenshotName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOG.info("Screenshot has been taken: " + screenshotName);
    }
}
