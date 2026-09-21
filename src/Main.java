public class Main {
    public static void main(String[] args) {
        double startingBalance = 5000.00;
        double monthlyRate = 0.17;

        double interestOneMonth = startingBalance * monthlyRate;
        double balanceOneMonth = startingBalance + interestOneMonth;

        double interestTwoMonths = balanceOneMonth * monthlyRate;
        double balanceTwoMonths = balanceOneMonth + interestTwoMonths;

        System.out.println("Starting credit card balance: $" + startingBalance);
        System.out.println("Monthly interest rate: " + (monthlyRate * 100) + "%");
        System.out.println("Interest due after one month: $" + interestOneMonth);
        System.out.println("Balance after one month: $" + balanceOneMonth);
        System.out.println("Interest due after two months: $" + interestTwoMonths);
        System.out.println("Balance after two months: $" + balanceTwoMonths);
    }
}