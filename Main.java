import Boundary.*;
import Entity.ChartItem;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        LoginPage loginPage = new LoginPage();
        loginPage.start();
        loginPage.login();

        ProductCatalogPage productCatalogPage = new ProductCatalogPage();
        

        
        productCatalogPage.start();
        productCatalogPage.displayCatalogList();
        productCatalogPage.selectCatalog();
        
    }
}
