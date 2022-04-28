package Boundary;

public class MainPage extends Page{
    public void start(){
        System.out.println("\nHello! Welcome to our page!!");
        drawDivider("*");
        System.out.println();
    }

    public void loginSuccess(){
        System.out.println("\nLogin successfully!");
    }
}
