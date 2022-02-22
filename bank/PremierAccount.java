/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marl.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dmute
 */
public class PremierAccount extends AccountHolder {
   
    private final int numberOfAccountHolders;
    
    private final ArrayList<AccountHolder> accounts;
    private final Scanner scanner;
   
    public PremierAccount (int numberOfAccountHolders) {
        this.numberOfAccountHolders = numberOfAccountHolders;
        accounts = new ArrayList<>();
        scanner = new Scanner(System.in);
        displayMenu();
    }
    
    private void displayMenu() {
        while(true) {
            System.out.println("Welcome to Marl Bank!");
            System.out.println("Choose one of the options you would like to undertake: ");
            System.out.println("Create my Marl Account. (press 1)");
            System.out.println("Withdraw money from my account. (Press 2)");
            System.out.println("Deposit money to my account. (Press 3)");
            System.out.println("Check the status of my account. (Press 4)");
            System.out.println("Start a lock savings account. (Press 5)");
            System.out.println("Delete my account. (Press 6)");
            String line = scanner.nextLine();
            int command = 0;
            try {
                command = Integer.parseInt(line);
            } catch (Exception e) {
        }
           switch(command) {
               case 1:
                createAccount();
           break;
           
               case 4: checkStatus();
               break;
               case 6:
                   deleteAccount();
            break;
           
                   
           default:
           System.out.println("Wrong command, try again please.");

        }
    }
    }


private void createAccount(){
if(accounts.size() == numberOfAccountHolders) {
    System.out.println("Can't add more accounts in the system. :( ");
    return;
}

AccountHolder youraccount = new AccountHolder();
System.out.println("Enter your full name please: ");
String line = scanner.nextLine();
youraccount.fullName(line);

if(accounts.contains(youraccount)) {
    System.out.println("You already have an account registered under Marl Bank. ");
    return;
}
System.out.println("Insert your age: ");
line = scanner.nextLine();
// youraccount.setage(); //*******************************
accounts.add(youraccount);

}

private void checkStatus(){
    System.out.println("Insert your registered account name.");
    String line = scanner.nextLine();
    for(AccountHolder youraccount : accounts) {
     if(youraccount.getfullName().equals(line)){
         System.out.println("Account" + youraccount.getfullName() + "Statistics" );
         System.out.println(youraccount.getfullName());
     }
}
}
private void deleteAccount() {
    System.out.println("Insert your registered name: ");
    String line = scanner.nextLine();
    for(AccountHolder youraccount : accounts) {
        if(youraccount.getfullName().equals(line)){
        accounts.remove(youraccount);
        System.out.println("Account: " + youraccount.getfullName() + " has been removed.");
        System.out.println("We are sorry to see you leave. :-( ");
        return;
    }
    }
     if (age<18){ //// FIX THISSSSSSS ***********************************
            System.out.println("No such account in the Marl Bank account system.");
        }
    
    System.out.println("No such account in the Marl Bank account system.");
}
}