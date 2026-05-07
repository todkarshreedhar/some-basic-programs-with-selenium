package oops.concepts;

public class Encapsulation {
    //This is where Java starts acting like enterprise code.
    //    Learn:
    //
    //    private variables
    //    getters/setters
    //    data protection

    private double balance;

    public void deposit(double amount){
        if(amount > 0)
        {
            balance = balance+amount;
        }
        else
        {
            System.out.println("Invalid amount");
        }

    }
    public void withdraw(double amount){
        if(amount <= balance)
        {
            balance = balance-amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }

    }

    public double getBalance(){
        return balance;
    }

}
