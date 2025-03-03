package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductListPage extends BaseTest {

    @Step("Ürün listesinden ilk ürüne tıklanma işlemi sağlanır.")
    public ProductListPage firstProductClick() {

        driver.findElements(By.cssSelector("[class='inventory_item_img']")).get(0).click();
        //screenshot();

        return this;
    }
}
