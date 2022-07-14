package compass.homework_3_2;

import compass.homework_3_2.exception.DivideByZeroException;
import compass.homework_3_2.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();
    @Test
    public void plusTest(){
        Number actual = calculatorService.plus(2,3);
        assertThat(actual).isEqualTo(5);

        actual = calculatorService.plus(-3,1);
        assertThat(actual).isEqualTo(-2);
    }
    @Test
    public void minusTest() {
        Number actual = calculatorService.minus(2, 3);
        assertThat(actual).isEqualTo(-1);

        actual = calculatorService.minus(-3, 1);
        assertThat(actual).isEqualTo(-4);
    }
    @Test
    public void miltiplyTest() {
        Number actual = calculatorService.multiply(2, 3);
        assertThat(actual).isEqualTo(6);

        actual = calculatorService.multiply(-3, 1);
        assertThat(actual).isEqualTo(-3);
    }
    @Test
    public void dividePositiveTest() {
        Number actual = calculatorService.divide(2, 3);
        assertThat(actual).isEqualTo(0.5);

        actual = calculatorService.divide(-3, 1);
        assertThat(actual).isEqualTo(-30);
    }
    @Test
    public void divideNegativeTest() {
        assertThatExceptionOfType(DivideByZeroException.class)
                .isThrownBy(() -> calculatorService.divide(1, 0))
                .withMessage("делить на 0 нельзя");

        assertThatExceptionOfType(DivideByZeroException.class)
                .isThrownBy(() -> calculatorService.divide(-1, 0))
                .withMessage("делить на 0 нельзя");
    }
}
