package Boundary;

import java.util.Scanner;
import Control.UserAuthenticationControl;
import java.lang.*;

public class LoginPage extends Page{
    private String userId;
    private String password;

    public void start(){
        System.out.println("\nLogin Page");
        drawDivider("*");
    }

    public void displayLoginForm(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter Your Username and Password!");

        System.out.print("Username: ");
        userId = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();
        
        System.out.println();
    }

    public void login(){

        displayLoginForm();

        UserAuthenticationControl userAuthenticationControl = new UserAuthenticationControl(
            userId, password
        );

        if(!(userAuthenticationControl.authenticate())){
            loginFail();
        }
    }

    public void loginFail(){
        System.out.println("\nLogin Failed!!!");
        System.out.println("\nTry Again....");

        java.lang.System.exit(0);
    }


}
