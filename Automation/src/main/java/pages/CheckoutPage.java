package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CheckoutPage extends BaseTest {

    @Step("Checkout butonuna tıklama sağlanır.")
    public CheckoutPage checkoutClick() {
        driver.findElement(By.id("checkout")).click();
        return this;
    }

    @Step("First Name alanına veri girişi sağlanır.")
    public CheckoutPage fillFirstName(String firstName) {

        driver.findElement(By.id("first-name")).sendKeys(firstName);
        return this;
    }

    @Step("Last Name alanına veri girişi sağlanır.")
    public CheckoutPage fillLastName(String LastName) {

        driver.findElement(By.id("last-name")).sendKeys(firstName);
        return this;
    }

    @Step("Postal Code alanına veri girişi sağlanır.")
    public CheckoutPage fillPostalCode(String postalCode) {

        driver.findElement(By.id("postal-code")).sendKeys(postalCode);
        return this;
    }

    @Step("Continue butonuna tıklama sağlanır.")
    public CheckoutPage clickContinueButton() {
        driver.findElement(By.cssSelector("[class='submit-button btn btn_primary cart_button btn_action']")).click();
        return this;
    }

    @Step("Hata mesajı ekrandan çekilir.")
    public String getErrorMessageCheckout() {
        //screenshot();
        return driver.findElement(By.cssSelector("[class='error-message-container error']")).getText();

    }

    @Step("Finish butonuna tıklanma sağlanır.")
    public CheckoutPage clickFinished() {
        driver.findElement(By.id("finish")).click();
        return this;
    }

    @Step("Başarılı alışveriş mesajı ekrandan çekilir.")
    public String getSuccesfullShoppingMessage(){
        return driver.findElement(By.cssSelector("[class='complete-text']")).getText();
    }


}


