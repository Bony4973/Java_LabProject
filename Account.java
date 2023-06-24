package Mypackage;// Package created.
import java.util.Scanner;// Scanner class imported.
public class Account{ // A class created.
    Scanner sc=new Scanner(System.in); // Object of scanner class created.
    public double WithdrawlMoney; // Variable declared in line 5 to 9.
    private String Account_number;
    public double Account_balance=0;
    public double DepositMoney=0;
    public boolean permission;
    public Account(){ // Constructor created.
        this.Account_number=Account_number;
        this.DepositMoney=DepositMoney;
        this.WithdrawlMoney=WithdrawlMoney;
    }
    public void DepositMoney(){ //Method created.
        Account_balance+=DepositMoney;
        System.out.println("Deposit is SUCCESSFULLY.  ## NEW BALANCE IS -->> " + Account_balance);
    }
    public  void  WithdrawMoney (){ //Method created'
        if((Account_balance - WithdrawlMoney) < 500 ){ // Conditional loop applied.
            System.out.println("Withdrow UNSUCCESSFULLY, you have only -->> " +  Account_balance+ " left your account :(");
        }else{
            Account_balance-=WithdrawlMoney;
            System.out.println("Withdrow money SUCCESSFULLY, now current balance is -->> " + Account_balance+" in your account :)");
        }
    }
    public String getAccount_number() { // getter method created.
        return Account_number;
    }
    public void setAccount_number(String Account_number) { // setter method created.
        this.Account_number = Account_number;
    }
    public void Method(){ // Method created.

        if(permission==true){ // Conditional loop applied.
            System.out.println("Enter deposit amount:");
            DepositMoney=sc.nextDouble();
        }
        else if(permission==false){
            System.out.println("next,");
        }
    }
    public void Method_1(){ // Method created.
        if(permission==true){ // Conditional loop applied.
            System.out.println("Enter the amount you want to withdraw:");
            WithdrawlMoney=sc.nextDouble();
        }
        else if(permission==false) {
            System.out.println("Thank you.");
        }
    }
}