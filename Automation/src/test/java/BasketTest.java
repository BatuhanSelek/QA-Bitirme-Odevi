import Base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductDetailPage;
import pages.ProductListPage;

public class BasketTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ProductListPage productListPage = new ProductListPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Test(description = "Ürün detay sepete ekleme kontrol")
    public void addToBasket() {

        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLoginButton();


        productListPage.firstProductClick();
        sleep(5000);
        productDetailPage.addToBasket();


    }
}
