
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;




public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        int a = 10;
        int b = 5;
        int result = calculator.add(a,b);
        assertEquals(15,result);
        System.out.println(a + " + " + b + " = " +result);
    }

    @Test
    public void subTest() {
        int a = 10;
        int b = 5;
        int result = calculator.sub(a,b);
        assertEquals(5,result);
        System.out.println(a + " - " + b + " = " +result);
    }

    @Test
    public void divideTest() {
        int a = 10;
        int b = 5;
        int result = calculator.divide(a,b);
        assertEquals(2,result);
        System.out.println(a + " / " + b + " = " +result);
    }

    @Test
    public void multiplyTest() {
        int a = 10;
        int b = 5;
        int result = calculator.multiply(a,b);
        assertEquals(50,result);
        System.out.println(a + " * " + b + " = " +result);
    }
}
