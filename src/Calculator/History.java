package Calculator;

import java.util.List;

public class History {

    private static final Reader consoleReader = new ConsoleReader();
    private static final OperationStorage storage = new InMemoryOperationStorage();
    private static final Writer consoleWriter = new ConsoleWriter();

    public static void runHistory(Operation operation) {
        storage.save(operation);

        switch (consoleReader.readWord()) {
            case "1":
                break;
            case "2":
                System.out.println("The end!");
                ConsoleApplication.IsTrue = false;
                break;
            case "3":
                List<Operation> operations = storage.findAll();
                for (Operation i : operations)
                    consoleWriter.writeText(i.getNumber1(), i.getNumber2(), i.getResult(), i.getTypeOperation());
                break;
            default:
                ConsoleApplication.IsTrue = false;
        }
    }
}
