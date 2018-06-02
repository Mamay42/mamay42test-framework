package common;

import enums.BrowserEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {
    private WebDriver driver;

    public  WebDriverFactory(BrowserEnum browserEnum){
        if (browserEnum.equals(BrowserEnum.CHROME)){
            System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browserEnum.equals(BrowserEnum.FIREFOX)){
            System.setProperty("webdriver.gecko.driver","src\\main\\resources\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public WebDriver getDriver(){
        return this.driver;
    }


}
