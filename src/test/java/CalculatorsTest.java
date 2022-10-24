import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorsTest {

    @Test
    public void testCountPaymentPerMonthAnnuity() {
        // given:
        long creditAmount = 30_000;
        int loanTermInMonths = 12;
        double percentagePerYear = 5.0;

        double expected = 2568.22;

        // when:
        double result = Calculator.countPaymentPerMonthAnnuity(creditAmount, loanTermInMonths, percentagePerYear);

        // then:
        Assertions.assertEquals(expected, result, 0.5);
    }

    @Test
    public void testSumAllPaymentsPerCreditAnnuity() {
        // given:
        long creditAmount = 20_000;
        int loanTermInMonths = 24;
        double percentagePerYear = 8.5;

        double expected = 21818.72;

        // when:
        double result = Calculator.sumAllPaymentsPerCreditAnnuity(creditAmount, loanTermInMonths, percentagePerYear);

        // then:
        Assertions.assertEquals(expected, result, 0.5);
    }

    @Test
    public void testCountOverPayAmountAnnuity() {
        // given:
        long creditAmount = 40_000;
        int loanTermInMonths = 12;
        double percentagePerYear = 8.5;

        double expected = 1865.50;

        // when:
        double result = Calculator.countOverPayAmountAnnuity(creditAmount, loanTermInMonths, percentagePerYear);

        // then:
        Assertions.assertEquals(expected, result, 0.5);
    }

}
