package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.Optional;


public class WDriver {
    private static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
    private static final long WAIT_TIMEOUT = 5;
    private static final long PAGE_TIMEOUT = 15;
    private WDriver() {
    }
    public static void getWebDriverInstance() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIMEOUT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_TIMEOUT));
        webDriverThreadLocal.set(driver);
    }

    public static WebDriver getDriver() {
        return webDriverThreadLocal.get();
    }

    public static void quitDriver() {
      Optional.ofNullable(getDriver()).ifPresent(WebDriver::quit);
    }
}
