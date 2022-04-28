package Boundary;

import java.util.Scanner;
import Control.UserAuthenticationControl;
import Control.newUser;

import java.lang.System;

public class LoginPage extends Page{
    private String userId;
    private String password;
    private int count=0;
    private String userrep;

    public void start(){
        System.out.println("\nLogin Page");
        drawDivider("*");
    }

    public void displayLoginForm(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nDo u want to register? Type yes or no");
        userrep = input.nextLine();

        if(userrep.equals("yes") ){
            newUser  newuser = new newUser(); 
            newuser.registeruser();
            System.out.println("\nUser registered!");
            displayLoginForm();


        }

        else if(userrep.equals("no")){

            System.out.println("\nEnter Your Username and Password!");
            System.out.print("Username: ");
            userId = input.nextLine();

            System.out.print("Password: ");
            password = input.nextLine();
            
            System.out.println();
        }
        else{
            System.out.println("Enter valid input!");
        }
        
    }

    public void login(){

        displayLoginForm();

        UserAuthenticationControl userAuthenticationControl = new UserAuthenticationControl(
            userId, password
        );

        if(!(userAuthenticationControl.authenticate())){
            count++;
            loginFail();
        }
    }

    public void loginFail(){
        System.out.println("\nLogin Failed!!!");
        
        
        if(count<=2)
        {
            System.out.println("\nTry Again....");
            login();
        }
        else{
            System.out.println("Maximum tries excceeded....Bye");
            java.lang.System.exit(0);
        }
    }
   


}
