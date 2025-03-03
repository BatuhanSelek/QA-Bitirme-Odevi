package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("Kullanıcı Adı alanına veri girişi sağlanır.")
    public LoginPage fillUsername(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        return this;
    }

    @Step("Parola alanına veri girişi sağlanır.")
    public LoginPage fillPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    @Step("Giriş butonuna tıklama işlemi sağlanır.")
    public LoginPage clickLoginButton() {
        driver.findElement(By.cssSelector("[class='submit-button btn_action']")).click();
        return this;
    }

    @Step("Hata mesajı ekrandan çekilir.")
    public String getErrorMessage() {
        //screenshot();
        return driver.findElement(By.cssSelector("[class='error-message-container error']")).getText();

    }
}
