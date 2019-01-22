package pages.allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.util.List;

public class HomePage extends BasePage {

    String baseURL = "https://www.calculator.net/";
    By otherCalculatorLinks = By.cssSelector("#hl5 a");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public HomePage navigateToHomePage(){
        driver.navigate().to(baseURL);
        return this;
    }

    public void clickLinkFromOtherCalculator(String linkName){
        List<WebElement> links = driver.findElements(otherCalculatorLinks);

        for(WebElement element: getElements(otherCalculatorLinks)){
            if(getText(element).equalsIgnoreCase())
        }
    }


}
