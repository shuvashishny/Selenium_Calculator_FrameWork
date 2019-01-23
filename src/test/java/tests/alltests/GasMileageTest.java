package tests.alltests;

import org.testng.annotations.Test;
import pages.allpages.GasMileagePage;
import pages.allpages.HomePage;
import tests.BaseTest;

public class GasMileageTest extends BaseTest{

    @Test
    public void calculateGasMileage(){
        page.getPage(HomePage.class)
                .navigateToHomePage()
                .clickLinkFromOtherCalculator("Gas Mileage Calculator");
        page.getPage(GasMileagePage.class).fillOutInfo();

    }
}
