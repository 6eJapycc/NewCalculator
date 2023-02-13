package Calculator;

import java.math.BigDecimal;
import java.util.Scanner;
public class ConsoleReader implements Reader {

    private final Scanner scanner = new Scanner(System.in);

    public BigDecimal readNumber() {
        return scanner.nextBigDecimal();
    }


    public String readTypeOperation() {
        return scanner.next().toUpperCase();
    }

    public String readWord(){
        return scanner.next();
    }
}
