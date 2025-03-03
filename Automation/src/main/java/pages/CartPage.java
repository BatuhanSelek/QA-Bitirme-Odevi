package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CartPage extends BaseTest {

    @Step("Remove butonuna tıklama işlemi sağlanır. ")
    public CartPage removeProduct() {

        driver.findElement(By.cssSelector("[class='btn btn_secondary btn_small cart_button']")).click();
        return this;
    }
}
