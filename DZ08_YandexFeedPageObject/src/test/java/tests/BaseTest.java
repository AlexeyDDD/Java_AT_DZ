package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

import java.time.Duration;

public class BaseTest {

    private static final String baseURL = "https://yandex.ru";

    protected WebDriver webDriver;

    //предусловие для каждого тестового класса
    @BeforeEach
    public void SetUp() {
        //указываем путь к драйверу браузера для управления браузером при тестировании
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        //экземпляр драйвера
        webDriver = new ChromeDriver();
        //запуск браузера (драйвера)
        webDriver.get(baseURL);
        webDriver.manage().window().maximize();
        //таймаут ожидания появления элемента на странице
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    //пост-действия по окончании каждого теста
    @AfterEach
    public void CloseBrowser(){
        //закрываем браузер (останавливаем драйвер)
       // webDriver.quit();
    }
}
