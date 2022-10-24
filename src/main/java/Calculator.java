public class Calculator {

    public static double countPaymentPerMonthAnnuity(long creditAmount, int loanTermInMonths, double percentagePerYear) {
        double monthRate = (percentagePerYear / 12) / 100;
        return creditAmount * (monthRate * Math.pow((1 + monthRate), loanTermInMonths)) / (Math.pow((1 + monthRate), loanTermInMonths) - 1);
    }

    public static double sumAllPaymentsPerCreditAnnuity(long creditAmount, int loanTermInMonths, double percentagePerYear) {
        return countPaymentPerMonthAnnuity(creditAmount, loanTermInMonths, percentagePerYear) * loanTermInMonths;
    }

    public static double countOverPayAmountAnnuity(long creditAmount, int loanTermInMonths, double percentagePerYear) {
        return sumAllPaymentsPerCreditAnnuity(creditAmount, loanTermInMonths, percentagePerYear) - creditAmount;
    }

}
