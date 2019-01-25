package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThreadLocalDriverFactory {
    public static ThreadLocal<WebDriver> tlDriver =  new ThreadLocal<>();

    public synchronized  static  void setDriver(String browser){

        if (browser.equalsIgnoreCase("firefox")) {
            tlDriver = ThreadLocal.withInitial(() -> new FirefoxDriver(OptionsManager.getFirefoxOptions()));
        } else if (browser.equalsIgnoreCase("chrome")) {
            tlDriver = ThreadLocal.withInitial(() -> new ChromeDriver(OptionsManager.getChromeOptions()));
        }
    }

    public synchronized static WebDriver getDriver () {
        return tlDriver.get();
    }
}
