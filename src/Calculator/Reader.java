package Calculator;

import java.math.BigDecimal;

public interface Reader {
    BigDecimal readNumber();

    String readTypeOperation();

    String readWord();
}
