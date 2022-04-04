package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YandexItemPage extends YandexMainPage{
    //Локаторы
    private static final String ADD_TO_COMPARE_LOC = "//div [@data-node-name='comparison']";

    public YandexItemPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void AddForCompare(){
        webDriver.findElement(By.xpath(ADD_TO_COMPARE_LOC)).click();
    }
}
