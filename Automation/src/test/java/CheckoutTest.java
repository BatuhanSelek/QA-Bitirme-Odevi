import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ProductListPage productListPage = new ProductListPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    CheckoutPage checkoutPage = new CheckoutPage();


    @Test(description = "Başarılı checkout adımı.")
    public void successfulCheckoutStepOne() {
        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLoginButton();

        productListPage.firstProductClick();
        sleep(5000);
        productDetailPage.addToBasket();
        productDetailPage.goToBasket();
        checkoutPage.checkoutClick();
        sleep(5000);
        checkoutPage.fillFirstName(firstName)
                .fillLastName(lastName)
                .fillPostalCode(postalCode)
                .clickContinueButton();

    }

    @Test(description = "Başarısız checkout adımı")
    public void unsuccessfulCheckoutStepOne() {
        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLoginButton();

        productListPage.firstProductClick();
        sleep(5000);
        productDetailPage.addToBasket();
        productDetailPage.goToBasket();
        checkoutPage.checkoutClick();
        sleep(5000);
        checkoutPage.fillFirstName("")
                .fillLastName("")
                .fillPostalCode(postalCode)
                .clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorMessageCheckout(), "Error: First Name is required");
    }

    @Test(description = "Başarılı alışveriş tamamlama işlemi.")
    public void finishedCheckout() {
        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLoginButton();

        productListPage.firstProductClick();
        sleep(5000);
        productDetailPage.addToBasket();
        productDetailPage.goToBasket();
        checkoutPage.checkoutClick();
        sleep(5000);
        checkoutPage.fillFirstName(firstName)
                .fillLastName(lastName)
                .fillPostalCode(postalCode)
                .clickContinueButton()
                .clickFinished();
        Assert.assertEquals(checkoutPage.getSuccesfullShoppingMessage(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
    }


}
