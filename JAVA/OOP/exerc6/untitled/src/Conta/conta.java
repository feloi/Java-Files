package Conta;

public class conta {
    public conta(int number, String holder) {

        this.number = number;
        this.holder = holder;

    }
    public conta(int number, String holder, double initialDeposit) {

        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    private String holder;
    private int number;
    private double balance = 0.00;

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount - 5.0;
    }

    public String toString(){
        return "Account: " + number + ", Holder: " + holder + ", Balance: R$" + String.format("%.2f", balance) ;
    }
}
