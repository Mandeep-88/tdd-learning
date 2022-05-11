
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeSuite
    public void setUp() throws Exception {
        calculator =new Calculator();
    }

    @Test
    public void multiplyTest() {
        int expectations=25;

        int outcomeMultiply = calculator.multiply(5, 5);
        Assert.assertEquals(expectations,outcomeMultiply);
    }

    @Test
    public void negativeSumValue() {
        int expectation =-2;
        int negSum = calculator.sum(4, -6);
        Assert.assertEquals(expectation,negSum);

    }

    @Test
    public void sumTest() {
        int expectation =13;
        int outcome = calculator.sum(5, 8);
        Assert.assertEquals(expectation,outcome);

    }

    @Test
    public void divideTest() {
        Assert.assertEquals(2,calculator.divide(12,6));
    }
//    @Test
//    public void divideTestWith0() {
//        Assert.assertEquals(0,calculator.divide(12,0));
//    }
}

