package Boundary;

import java.util.Scanner;
import java.util.Vector;

import Control.ChartControl;
import Control.OrderControl;
import Entity.Chart;
import Entity.ChartItem;
import Entity.Product;

public class ChartPage extends Page{
    private String productNumber;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private double subtotal;
    private double totalAmount;
    private Vector<Object> chartContent;
    boolean chartEmpty = true;

    public ChartPage( Vector<Object> chartContent ){
        this.chartContent = chartContent;
    }

    
    public void start(){
        System.out.println();
        System.out.println("【This is your chart】");
        drawDivider("*");
    }

    
    public void displayChart(){

        System.out.println();

        System.out.print(productName);
        System.out.println("(" + productNumber + ")");
        drawDivider("-");
        System.out.println("Price: " + productPrice);
        System.out.println("Quantity: " + productQuantity);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total price: " + totalAmount);
    }

    public void displayChartGoods(){

        Vector<ChartItem> chartItems = ((Chart)chartContent.elementAt(0)).getChartItems();
        Vector<Product> products = (Vector<Product>)chartContent.elementAt(1);

        chartEmpty = chartItems.isEmpty();

        totalAmount = (double)chartContent.elementAt(2);

        for (int i=0; i<chartItems.size(); i++){

            Product product = products.elementAt(i);
            ChartItem chartItem = chartItems.elementAt(i);

            productName = product.getName();
            productNumber = product.getProductNumber();
            productPrice = product.getPrice();
            productQuantity = chartItem.getProductQuantity();
            subtotal = chartItem.getSubtotal();

            System.out.println();

            System.out.print( "# "+ productName);
            System.out.println("(" + productNumber + ")");
            drawDivider("-");
            System.out.println("Price: " + productPrice );
            System.out.println("Quantity: " + productQuantity );
            System.out.println("Subtotal: " + subtotal );
        }

        System.out.println("\nTotal price: " + totalAmount);

        // displayOptionMenu();
    }

    public void displayChartInfo(){

        Vector<ChartItem> chartItems = (Vector<ChartItem>)chartContent.elementAt(0);

        totalAmount = 0;

        for (int i=1, j=0; i<chartContent.size(); i++){
            Product product = (Product)chartContent.elementAt(i);
            ChartItem chartItem = chartItems.elementAt(j);

            productName = product.getName();
            productNumber = product.getProductNumber();
            productPrice = product.getPrice();
            productQuantity = chartItem.getProductQuantity();
            subtotal = chartItem.getSubtotal();
            totalAmount += subtotal;

            System.out.println();

            System.out.print(productName);
            System.out.println("(" + productNumber + ")");
            drawDivider("-");
            System.out.println("Price: " + productPrice );
            System.out.println("Quantity: " + productQuantity );
            System.out.println("Subtotal: " + subtotal );
            
        }
        System.out.println("\nTotal price: " + totalAmount);
    }

    public void displayOptionMenu(){
        System.out.println("\n[Option menu]\n");

        System.out.println("1. Order other products.");
        System.out.println("2. Clear Chart.");
        System.out.println("3. Checkout.");

        System.out.print("\nYour choice: ");

        Scanner input = new Scanner(System.in);
        int selectedItem = Integer.parseInt(input.nextLine());

        switch (selectedItem) {

            case 1:
                
                ProductCatalogPage productCatalogPage = new ProductCatalogPage();
                productCatalogPage.start();
                productCatalogPage.displayCatalogList();
                productCatalogPage.selectCatalog();
                break;

            case 2:
                
                ChartControl chartControl = new ChartControl();
                chartControl.clearChart();
                System.out.println("\nChart has been empty now.");
                break;
            
                
            case 3:
                
                if (!chartEmpty){
                    //displayChartInfo();
                    OrderControl orderControl = new OrderControl();
                    orderControl.checkout();
                }
                else{
                    System.out.println("\nYour chart is empty!!!");
                }
                break;

            default:
                
                System.out.println("bye");
                break;    
        }
    }
}
