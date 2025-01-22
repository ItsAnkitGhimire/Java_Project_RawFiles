
public class SavingAccount extends BankAccount{
    @Override
    public void withdraw(double amt) {
        double remaining=super.balance-amt;
        if(remaining<100){
            System.out.println("Sorry Your remaining balance is less than 100 ie.: "+remaining+" Rs.");
        }else{
            balance = balance - amt;
            System.out.println("Withdrawal Amount is: "+amt);
            System.out.println("Withdrawal Successful: Remaining Balance: "+balance);
        }
    }

    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.deposit(300);
        sa.deposit(600);
        sa.deposit(300);
        sa.withdraw(500);
        sa.withdraw(251.20);
        sa.withdraw(500);
    }
}
