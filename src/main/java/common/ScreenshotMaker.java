package common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotMaker {
    private WebDriver driver;
    public void takeScreenshot() {
        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File("target/screenshots/" + System.currentTimeMillis() + "sc.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
