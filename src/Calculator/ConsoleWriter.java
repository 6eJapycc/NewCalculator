package Calculator;

import java.math.BigDecimal;

public class ConsoleWriter implements Writer {
    public void writeResult(BigDecimal result) {
        System.out.println(result);
    }

    public void writeText(String text) {
        System.out.println(text);
    }

    public void writeText(BigDecimal number1, BigDecimal number2, BigDecimal result, String typeOperation) {
        System.out.println(number1 + " " + typeOperation + " " + number2 + " = " + result);
    }
}
