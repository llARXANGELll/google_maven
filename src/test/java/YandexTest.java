import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class YandexTest {

//    public WebDriver webDriver = new ChromeDriver();
//    @BeforeTest
//    public void driverLaunch(){
//        System.getProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//    }

    @Test
    public void yandexx() {
        System.getProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://yandex.ru/ncr");
        webDriver.quit();

    }

//    public void driverOut(){
//        webDriver.quit();
//    }


}
