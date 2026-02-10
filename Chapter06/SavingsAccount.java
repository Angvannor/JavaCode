package Chapter06;

public class SavingsAccount extends BankAccount {

  private int count = 3; // 每月免费取款次数
  private double rate = 0.01; // 默认利率为1%

  public SavingsAccount(double initialBalance) {
      super(initialBalance);
  }

  public void earningMonthlyInterest() {
      deposit(getBalance() * rate);
      count = 3; // 重置免费取款次数
  }

  @Override
  public void deposit(double amount) {
    if(count > 0) {
      super.deposit(amount);  
    } else {
      super.deposit(amount - 1); // 超过免费次数，收取1元手续费
    }
    count--;      
    }

  @Override
  public void withdraw(double amount) {
    if(count > 0) {
      super.withdraw(amount);  
    } else {
      super.withdraw(amount + 1); // 超过免费次数，收取1元手续费
    }
    count--;      
    }

  public void setRate(double rate) {
      this.rate = rate;
  }
}
