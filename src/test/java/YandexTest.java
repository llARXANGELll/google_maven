import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class YandexTest {

    @Test
    public void yandexx() {
        System.getProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://yandex.ru/ncr");
    }

}
