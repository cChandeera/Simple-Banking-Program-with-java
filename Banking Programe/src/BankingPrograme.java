/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class BankingPrograme {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
 
        double balance = 0;
        double deposite;
        int input;
        boolean runTask = true;
        
        System.out.println("---- BANKING PROGRAMME ----");
        
        System.out.print("Enter current account balance ($): ");
        balance = scanner.nextDouble();
        
        if(balance < 0){
            System.out.println("Balance can't be Negative");
            runTask = false;
        }
        
        while(runTask){

            System.out.println(" 1 - Check Balance ");
            System.out.println(" 2 - Deposit money ");
            System.out.println(" 3 - Withdrow money ");
            System.out.println(" 4 - Exit ");

            System.out.print("Enter your Service (1-4): ");
            input = scanner.nextInt();

            switch(input){
                case 1 : showBalance(balance);
                        break;
                case 2 : balance = balance + deposit();
                        break;
                case 3 : balance = balance - withdrow(balance);
                        break;
                case 4 : runTask = false;
                        break;
                
                default : System.out.println("INVALID INPUT");
                        break;

            }
            System.out.println("*********************************");
        }
        System.out.println("---------------------------------");
        System.out.println("THANK YOU BANKING WITH US !");
        System.out.println("HAVE A NICE DAY !");
        
        scanner.close();
    }
    
    static void showBalance(double balance){
        System.out.println("---------------------------------");
        System.out.printf("Account Balance is $%,.2f \n",balance);
   
    }
    
    static double deposit(){
        
        double amount;
        
        System.out.print("Enter an amount to be deposited ($): ");
        amount = scanner.nextDouble();
        
        if(amount < 0){
            System.out.println("---------------------------------");
            System.out.println("Deposit amount can't be negetive\n");
            return 0;
        }
        else{
            return amount;
        }   
    }
    
    static double withdrow(double balance){
        double amount;
        
        System.out.print("Enter an amount to be Withdrowed ($): ");
        amount = scanner.nextDouble();
        
        if(amount > balance){
            System.out.println("---------------------------------");
            System.out.print("INVALID WITHDROW AMOUNT\n");
            return 0;
        }
        else if(amount < 0){
            System.out.println("---------------------------------");
            System.out.println("withdrowal amount can't be negetive\n");
            return 0;
        }
        else{
            return amount;
        }
    } 
    
}
