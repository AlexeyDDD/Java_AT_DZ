package pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YandexMainPage extends BasePage{
    //локаторы
    private static final String YANDEX_LOGO_LOC = "//div[@class='home-logo__default']";
    private static final String MARKET_LOC = "//div [@class='services-new__item-title'][.='Маркет']";

    //переопределяем конструктор от BasePage
    public YandexMainPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void GoToMarket() {
        //проверка загрузки стартовой страницы по лого
        Assertions.assertTrue(webDriver.findElement(By.xpath(YANDEX_LOGO_LOC)).isDisplayed());
        //переход в маркет (в новую вкладку)
        WebElement webElement = webDriver.findElement(By.xpath(MARKET_LOC));
        webElement.click();
        //переходим на крайнюю правую вкладку, т.к. она в ней открылся маркет
        for (String windowHandle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(windowHandle);
        }
    }
}
