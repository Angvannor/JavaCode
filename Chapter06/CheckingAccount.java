package Chapter06;

public class CheckingAccount extends BankAccount {

  public CheckingAccount(double initialBalance) {
      super(initialBalance);
  }
  
  @Override
  public void deposit(double amount) {
      super.deposit(amount - 1); // 收取1元手续费
  }

  @Override
  public void withdraw(double amount) {
      super.withdraw(amount + 1); // 收取1元手续费
  }
}
