import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class YandexTest {

//    public WebDriver webDriver = new ChromeDriver();
//    @BeforeTest
//    public void driverLaunch(){
//        System.getProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//    }

    WebDriver webDriver = new ChromeDriver();
    @Test
    public void yandexx() {
        System.getProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver.get("https://yandex.ru");
        WebElement input = webDriver.findElement(By.name("text"));
        input.sendKeys("руддщ цкщдв",Keys.ENTER);



    }

    @After
    public void driverOut(){
        webDriver.quit();
    }


}
