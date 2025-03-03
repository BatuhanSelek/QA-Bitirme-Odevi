package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends BaseTest {

    @Step("Menü butonuna tıklama işlemi sağlanır.")
    public MainPage getMenu() {
        driver.findElement(By.cssSelector("[class='bm-burger-button'] #react-burger-menu-btn")).click();
        //screenshot();
        return this;
    }
}
