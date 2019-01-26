package pages.allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class GasMileagePage extends BasePage {
    By cOdometer = By.id("uscodreading");
    By podometer = By.id("uspodreading");
    By totalGasAmount = By.id("usgasputin");
    By gasPrice = By.id("usgasprice");
    By calculatebutton = By.cssSelector("input[alt='Calculate']");

    public GasMileagePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void fillOutInfo() {
        writeText(cOdometer, "23000");
        writeText(podometer, "22400");
        writeText(totalGasAmount, "40");
        writeText(gasPrice, "3.24");
        click(calculatebutton);
    }
}
