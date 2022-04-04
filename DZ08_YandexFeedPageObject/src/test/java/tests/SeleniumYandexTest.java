package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.YandexItemPage;
import pages.YandexMainPage;
import pages.YandexMarketPage;
import tests.BaseTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumYandexTest extends BaseTest {


    @Test
    @DisplayName("Поиск корма с фильтрами")
    public void CatFeedTest() {
        YandexMainPage yandexMainPage = new YandexMainPage(webDriver);
        yandexMainPage.GoToMarket();
/*
        YandexMarketPage yandexMarketPage = new YandexMarketPage(webDriver);
        yandexMarketPage.FindSomething("Корм для кота");
        yandexMarketPage.SetFilter();
        yandexMarketPage.ChooseFirstItem();

        YandexItemPage yandexItemPage = new YandexItemPage(webDriver);
        yandexItemPage.AddForCompare();

        */
    }


}
