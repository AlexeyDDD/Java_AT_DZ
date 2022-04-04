package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YandexMarketPage extends YandexMainPage{
    //локаторы
    private static final String FIND_FIELD_LOC = "//input [@type='text'][@name='text'][@placeholder='Искать товары']";
    private static final String FIND_BUTTON_LOC = "//span [.='Найти'] /parent::button";
    //локаторы на фильтр
    private static final String PRICE_FROM_LOC = "//div [@data-auto='filter-range-glprice']//span [@data-auto='filter-range-min']";
    private static final String PRICE_TO_LOC = "//div [@data-auto='filter-range-glprice']//span [@data-auto='filter-range-max']";
    private static final String PRICE_FROM_ID = "glpricefrom";
    private static final String PRICE_TO_ID = "glpriceto";
    private static final String SHOW_ALL_LABEL_MAN_LOC = "//legend [text()='Производитель']/following-sibling::footer/button [text()='Показать всё']";
    private static final String MANUFACTURE_FIND_FIELD_LOC = "//input [@name='Поле поиска']";
    private static final String MANUFACTURE_CHECK_LOC = "//input [@name = 'Производитель Кошачье Счастье']/parent::label";
    private static final String DELIVERY_METHOD_LOC = "//span [text()='Доставка курьером']";

    //локаторы на товар
    private static final String RESULT_FIRST_LOC = "//div [@data-zone-data='{\"viewType\":\"grid\"}']/article[1]/div/h3/a";


    public YandexMarketPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void FindSomething(String findExpression){
        //поиск по ключевым словам
        webDriver.findElement(By.xpath(FIND_FIELD_LOC)).sendKeys(findExpression);
        webDriver.findElement(By.xpath(FIND_BUTTON_LOC)).click();
    }

    public void SetFilter(){
        //настройка фильтра
        //цена
        // ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);",
        //        webDriver.findElement(By.xpath(PRICE_FROM_LOC)));
        //webDriver.findElement(By.xpath(PRICE_FROM_LOC)).sendKeys("100");
        //webDriver.findElement(By.xpath(PRICE_TO_LOC)).sendKeys("1500");
        webDriver.findElement(By.id(PRICE_FROM_ID)).sendKeys("100");
        webDriver.findElement(By.id(PRICE_TO_ID)).sendKeys("1500");
        //производитель
        webDriver.findElement(By.xpath(SHOW_ALL_LABEL_MAN_LOC)).click();
        //WebElement manuFind = WebDriverWait(webDriver, Duration.ofSeconds(10)).
        //        until(ExpectedConditions.elementToBeClickable(By.xpath(MANUFACTURE_FIND_FIELD)));

        webDriver.findElement(By.xpath(MANUFACTURE_FIND_FIELD_LOC)).sendKeys("Кошачье счастье");
        webDriver.findElement(By.xpath(MANUFACTURE_CHECK_LOC)).click();
        //доставка
        webDriver.findElement(By.xpath(DELIVERY_METHOD_LOC)).click();
    }
    public void ChooseFirstItem(){
        //по результатам поиска выбираем первый товар и нажимаем сравнить
        //поднимаемся на верх страницы и выбираем первый товар
        ((JavascriptExecutor) webDriver)
                .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        //((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);",
        //        webDriver.findElement(By.xpath(RESULT_FIRST_LOC)));
        new WebDriverWait(webDriver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(RESULT_FIRST_LOC)));
        webDriver.findElement(By.xpath(RESULT_FIRST_LOC)).click();
        //переходим на крайнюю правую вкладку, т.к. в ней открылся товар
        for (String windowHandle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(windowHandle);
        }
    }
}
