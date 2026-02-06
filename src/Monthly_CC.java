public class Monthly_CC {
    public static void main(String[] args) {
        double balance = 5000.00;
        double interestRate = 0.17;

        double monthlyInterest = balance * interestRate;
        balance += monthlyInterest;
        System.out.println("Balance after one month is: $" + balance);
        monthlyInterest = balance * interestRate;
        balance += monthlyInterest;
        System.out.println("Balance after two months is: $" + balance);
    }
}
