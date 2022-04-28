package Control;

import java.util.Vector;

import Boundary.ChartPage;
import Entity.Chart;
import Entity.ChartItem;
import Entity.Product;

public class ChartControl {
    private Vector<Object> chartContent;

    public ChartControl(){
        chartContent = new Vector<>();
    }

    public void orderProduct(String productNumber, int productQuantity){
        
        Chart chart = new Chart();

        if (productQuantity>0){
            chart.addToChart(productNumber, productQuantity);
        }

        chartContent.addElement(chart);

        getChartContentFromDB();

    }

    public void clearChart(){
        Chart chart = new Chart();
        chart.clear();
    }

    public boolean checkIfChartEmpty(){
        
        Chart chart = (Chart)chartContent.elementAt(0);
        return chart.isEmpty();
    }

    public void getChartContentFromDB(){
        
        Chart chart = (Chart)chartContent.elementAt(0);

        
        Vector<Product> products = new Vector<>();

        for (ChartItem item:chart.getChartItems()){
            Product product = new Product();
            product.getProductInfoFromDatabase(item.getProductNumber());
            products.addElement(product);
        }
        chartContent.addElement(products);
        chartContent.addElement(chart.calculatePriceOfChart());

        ChartPage chartPage = new ChartPage(chartContent);
        chartPage.start();
        chartPage.displayChartGoods();
        chartPage.displayOptionMenu();

        
    }

   

   
}
