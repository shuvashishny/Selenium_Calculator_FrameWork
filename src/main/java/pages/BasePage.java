package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage extends Page {
    public BasePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void click(By element){
        waitForElementClickable(element);
        driver.findElement(element).click();
    }

    public void writeText(By element, String text){
        waitForElementVisible(element);
        driver.findElement(element).sendKeys(text);
    }

    public String getText(By element){
        waitForElementVisible(element);
        return driver.findElement(element).getText();
    }

    public void waitForElementVisible(By element){
        WebElement webElement = driver.findElement(element);
        wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
    }

    public void waitForElementClickable(By element){
        WebElement webElement = driver.findElement(element);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public WebElement getElement(By element){
        waitForElementVisible(element);
        return driver.findElement(element);
    }

    public List<WebElement> getElements(By element){
        waitForElementVisible(element);
        return driver.findElements(element);
    }
}
