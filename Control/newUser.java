package Control;


import java.util.Scanner;

import Database.Database;

import java.io.*;

public class newUser {
    public String username;
    public String password;

    public void registeruser(){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Username");
    username = input.nextLine();

    System.out.println("Enter Password");
    password = input.nextLine();

    Database newMember = new Database();
    newMember.register(username,password);

    }


    
}
