package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductDetailPage extends BaseTest {

    @Step("Add to Cart butonuna tıklanır ve ürün sepete eklenir.")
    public ProductDetailPage addToBasket() {

        driver.findElement(By.cssSelector("[class='btn btn_primary btn_small btn_inventory")).click();
        //screenshot();
        return this;
    }

    @Step("Sepete gitme işlemi sağlanır.")
    public ProductDetailPage goToBasket() {
        driver.findElement(By.cssSelector("[class='shopping_cart_container']")).click();
        return this;
    }
}
