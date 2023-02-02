package Calculator;

import java.math.RoundingMode;

public class Calculator {
    public static void calculate(Operation operation) {

        switch(operation.getTypeOperation()) {
            case "SUM":
                operation.setResult(operation.getNumber1().add(operation.getNumber2()));
                return;
            case "DIF":
                operation.setResult(operation.getNumber1().subtract(operation.getNumber2()));
                return;
            case "MUL":
                operation.setResult(operation.getNumber1().multiply(operation.getNumber2()));
                return;
            case "DIV":
                operation.setResult(operation.getNumber1().divide(operation.getNumber2(), 20, RoundingMode.DOWN));
        }
    }
}
