package tests.alltests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class GoogleTest extends BaseTest {

    @Test
    public void GOOGLE1() throws Exception {
        System.out.println("Google1 Test Started! " + Thread.currentThread().getId());
        driver.navigate().to("http://www.google.com");
        System.out.println("Google1 Test's Page title is: " + driver.getTitle() + " " + Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google1 Test Ended! " + Thread.currentThread().getId());
    }

    @Test
    public void YANDEX() throws Exception {
        System.out.println("Yandex Test Started! " + Thread.currentThread().getId());
        driver.navigate().to("http://www.yandex.com");
        System.out.println("Yandex Test's Page title is: " + driver.getTitle() + " " + Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "Yandex");
        System.out.println("Yandex Test Ended! " + Thread.currentThread().getId());
    }
}
