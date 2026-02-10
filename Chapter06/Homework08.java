package Chapter06;

public class Homework08 {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(1000);
    System.out.println("初始余额: " + account.getBalance());

    account.deposit(500);
    System.out.println("存款500后余额: " + account.getBalance());

    account.withdraw(200);
    System.out.println("取款200后余额: " + account.getBalance());

    account.withdraw(2000); // 尝试取款超过余额
    System.out.println("尝试取款2000后余额: " + account.getBalance());

    CheckingAccount checkingAccount = new CheckingAccount(1000);
    System.out.println("支票账户初始余额: " + checkingAccount.getBalance());

    checkingAccount.deposit(500);
    System.out.println("支票账户存款500后余额: " + checkingAccount.getBalance());

    checkingAccount.withdraw(200);
    System.out.println("支票账户取款200后余额: " + checkingAccount.getBalance());

    SavingsAccount savingsAccount = new SavingsAccount(1000);
    System.out.println("储蓄账户初始余额: " + savingsAccount.getBalance());

    savingsAccount.earningMonthlyInterest();
    System.out.println("储蓄账户计息后余额: " + savingsAccount.getBalance());

    savingsAccount.withdraw(100);
    savingsAccount.withdraw(100);
    savingsAccount.withdraw(100);
    System.out.println("储蓄账户取款3次后余额: " + savingsAccount.getBalance());

    savingsAccount.withdraw(100); // 第4次取款，收取手续费
    System.out.println("储蓄账户第4次取款后余额: " + savingsAccount.getBalance());
  }
}
