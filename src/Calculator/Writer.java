package Calculator;

import java.math.BigDecimal;

public interface Writer {
    void writeResult(BigDecimal result);

    void writeText(String text);

    void writeText(BigDecimal number1, BigDecimal number2, BigDecimal result, String typeOperation);
}
