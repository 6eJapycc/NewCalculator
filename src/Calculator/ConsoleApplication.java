package Calculator;

public class ConsoleApplication implements Application {

    private final Operation operation = new Operation();
    private final Reader consoleReader = new ConsoleReader();
    private final Writer consoleWriter = new ConsoleWriter();
    private final OperationStorage storage = new InMemoryOperationStorage();
    private final Operation[] operations = storage.findAll();

    public void run() {
        boolean isTrue = true;
        while (isTrue) {
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
            storage.save(operation);
            consoleWriter.writeText("if you want to continue press - 1. If you want to finish this press - 2 ");
            switch (consoleReader.readWord()) {
                case "1":
                    break;
                case "2":
                    System.out.println("The end!");
                    return;
                default:
                    isTrue = false;
            }
            consoleWriter.writeText("if you want to see a history press - 1. If you want to continue press - 2");
            switch (consoleReader.readWord()) {
                case "1":
                    if (storage.getOperationsCount() < operations.length) {
                        for (Operation i : operations) {
                            consoleWriter.writeText(i.getNumber1(), i.getNumber2(), i.getResult(), i.getTypeOperation());
                        }
                    }
                    break;
                case "2":
                    break;
                default:
                    isTrue = false;

            }
        }
    }
}