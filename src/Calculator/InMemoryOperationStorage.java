package Calculator;

public class InMemoryOperationStorage implements OperationStorage {

    private final Operation[] operations = new Operation[3];
    private int operationsCount;

    public void save(Operation operation) {
        operations[operationsCount] = operation;
        operationsCount++;
        if(operationsCount == operations.length + 1){
            operationsCount = 0;
        }
    }

    public Operation[] findAll() {
        return operations;
    }

    public int getOperationsCount() {
        return operationsCount;
    }
}
