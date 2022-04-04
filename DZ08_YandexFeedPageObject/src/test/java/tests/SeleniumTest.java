package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.YandexItemPage;
import pages.YandexMainPage;
import pages.YandexMarketPage;

public class SeleniumTest extends BaseTest {
/*    private WebDriver webDriver;

    public SeleniumTest(WebDriver webDriver) {
        super(webDriver);
    }
*/

    @Test
    @DisplayName("Поиск корма с фильтрами")
    public void CatFeedTest() {
        YandexMainPage yandexMainPage = new YandexMainPage(webDriver);
        yandexMainPage.GoToMarket();

        YandexMarketPage yandexMarketPage = new YandexMarketPage(webDriver);
        yandexMarketPage.FindSomething("Корм для кота");
        yandexMarketPage.SetFilter();
        yandexMarketPage.ChooseFirstItem();

        YandexItemPage yandexItemPage = new YandexItemPage(webDriver);
        yandexItemPage.AddForCompare();


    }


}
