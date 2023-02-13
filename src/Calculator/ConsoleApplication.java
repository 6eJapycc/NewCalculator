package Calculator;

public class ConsoleApplication implements Application {

    private final Operation operation = new Operation();
    private final Reader consoleReader = new ConsoleReader();
    private final Writer consoleWriter = new ConsoleWriter();
    public static boolean IsTrue = true;
    public void run() {
        while (IsTrue) {
            consoleWriter.writeText("Enter the first number: ");
            operation.setNumber1(consoleReader.readNumber());
            consoleWriter.writeText("Enter the second number:");
            operation.setNumber2(consoleReader.readNumber());
            consoleWriter.writeText("Select operation type.");
            consoleWriter.writeText("1 - summation, 2 - difference, 3 - multiplication, 4 - division:");
            operation.setTypeOperation(consoleReader.readTypeOperation());
            Calculator.calculate(operation);
            consoleWriter.writeText("Result:");
            consoleWriter.writeResult(operation.getResult());
            consoleWriter.writeText("Press 1 - if you want to continue. Press 2 - if you want to finish. Press 3 - if you want to see the history");
            History.runHistory(operation);
        }
    }
}