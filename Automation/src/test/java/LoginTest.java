import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test(description = "Başarılı kullanıcı giriş testi.")
    public void successfulLogin() {
        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLoginButton();
        mainPage.getMenu();
        sleep(3500);

    }

    @Test(description = "Başarısız kullanıcı girişi testi")
    public void unsuccessfulLogin() {
        loginPage.fillUsername(username)
                .fillPassword(password + "a")
                .clickLoginButton();
        sleep(3500);
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
    }


}
