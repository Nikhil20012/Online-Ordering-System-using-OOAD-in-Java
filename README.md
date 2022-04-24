# Online-Ordering-System-using-OOAD-in-Java

This is a simple project in OOAD with java which is based on online ordering system where in a customer can login with his credentials to his account, once it’s authenticated a catalogue of items will be displayed through which he can select the type of items to that are to be purchased by him/her. After selecting the type of items, A list of the items belonging to that category will be displayed from which the customer can select the items he wants to purchase, and they will be added to the cart. Once the purchase is authenticated the bill will be displayed to the customer, The customer can even come out of the cart to add a different item so that he can buy more than 1 item at a time

# Overview of the code 

We have 4 packages in the code and 1 main file :
**The Boundary package** is a front-end for our project where it has 6 java files all which help in building up the interactions with the user

**The Control package** is a middleware which has has total of 4 java files which orchestrate the execution of the business logic is being computed and is updated to the backend

**The Database package** is the one where we create our own java database to store the user's account information locally , it has 5 txt for storing the product and user information and 1 java file which is the java database

**The Entity package** is the one which interacts which the database and helps in getting the relevant information , it contains total of 7 java files

**Main File** is the entry file from which we can synchronize everything and start the execution of the application
