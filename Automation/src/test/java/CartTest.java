import Base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductDetailPage;
import pages.ProductListPage;

public class CartTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ProductListPage productListPage = new ProductListPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    CartPage cartPage = new CartPage();

    @Test(description = "Sepet görüntüleme ve sepetten ürün silme kontrol")
    public void removeProduct() {

        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLoginButton();

        productListPage.firstProductClick();
        sleep(5000);
        productDetailPage.addToBasket();
        productDetailPage.goToBasket();
        sleep(5000);
        cartPage.removeProduct();
    }




}
