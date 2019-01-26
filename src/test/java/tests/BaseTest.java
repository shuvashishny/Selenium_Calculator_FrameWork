package tests;

import browser.ThreadLocalDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.Page;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public Page page;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(@Optional("firefox")String browser ){

        //Set & Get ThreadLocal Driver with Browser
        System.out.println("Browser is "+browser);
        ThreadLocalDriverFactory.setDriver(browser);
        wait = new WebDriverWait(ThreadLocalDriverFactory.getDriver(), 15);
        driver = ThreadLocalDriverFactory.getDriver();

        //Create a wait. All test classes use this.
        wait = new WebDriverWait(driver,30);

        //Maximize Window
        driver.manage().window().maximize();

        //Instantiate the Page Class
        page = new Page(driver,wait);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
