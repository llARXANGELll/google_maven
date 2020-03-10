
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class YandexTest {

    public WebDriver webDriver;

    @Test
    public void driver() {
        webDriver = new ChromeDriver();
    }

    @Test
    public void yandexx() {

        webDriver.get("https://google.com/ncr");
        webDriver.get("https://google.com");

        WebElement input = webDriver.findElement(By.name("q"));
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.quit();


    }

    @After
    public void driverOut() {

    }
}


