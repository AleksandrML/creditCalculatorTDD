public class Calculator {

    public static double countPaymentPerMonthAnnuity(long creditAmount, int loanTermInMonths, double percentagePerYear) {
        return 10_000;
    }

    public static double sumAllPaymentsPerCreditAnnuity(long creditAmount, int loanTermInMonths, double percentagePerYear) {
        return countPaymentPerMonthAnnuity(creditAmount, loanTermInMonths, percentagePerYear) * loanTermInMonths;
    }

    public static double countOverPayAmountAnnuity(long creditAmount, int loanTermInMonths, double percentagePerYear) {
        return sumAllPaymentsPerCreditAnnuity(creditAmount, loanTermInMonths, percentagePerYear) - creditAmount;
    }

}
