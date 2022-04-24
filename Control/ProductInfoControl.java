package Control;

import java.util.Vector;

import Boundary.ProductCatalogPage;
import Boundary.ProductInfoPage;
import Entity.Product;

public class ProductInfoControl {
    private Vector<Object> catalogContent = null;
    private Vector<Object> productInfo = null;

    public void getProductCatalog(String catalogNumber){

        Product product = new Product();
        ProductCatalogPage productCatalogPage = new ProductCatalogPage();

        catalogContent = product.getCatalog(catalogNumber);
        productCatalogPage.displayProductList(catalogContent); 
        productCatalogPage.selectProduct();

    }
    public void getProductInfoFromModel(String productNumber){

        Product product = new Product();
        product.getProductInfoFromDatabase(productNumber);
        ProductInfoPage productInfoPage = new ProductInfoPage(
            product.getProductNumber(),
            product.getName(),
            product.getPrice(),
            product.getDescription()
        );

        productInfoPage.displayProductInfo();     
    }


}
