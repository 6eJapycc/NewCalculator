package Calculator;

import java.math.BigDecimal;

public class Operation {

    private BigDecimal number1;
    private BigDecimal number2;
    private BigDecimal result;
    private String typeOperation;

    public void setTypeOperation(String typeOperation){

        switch (typeOperation) {
            case "1":
                this.typeOperation = String.valueOf(TypeOperation.SUM);
                break;
            case "2":
                this.typeOperation = String.valueOf(TypeOperation.DIF);
                break;
            case "3":
                this.typeOperation = String.valueOf(TypeOperation.MUL);
                break;
            case "4":
                this.typeOperation = String.valueOf(TypeOperation.DIV);
                break;
        }
    }

    public void setNumber1(BigDecimal number1) {
        this.number1 = number1;
    }

    public void setNumber2(BigDecimal number2) {
        this.number2 = number2;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public BigDecimal getNumber1() {
        return number1;
    }

    public BigDecimal getNumber2() {
        return number2;
    }

    public BigDecimal getResult() {
        return result;
    }

    public String getTypeOperation() {
        return typeOperation;
    }
}
