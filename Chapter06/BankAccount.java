package Chapter06;

public class BankAccount {
  private double balance;
  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("余额不足，无法取款");
    }
  }

  public double getBalance() {
    return balance;
  }
}