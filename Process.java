package kissPrinciple;

public class Process {
    // Complex approach
    public void processOrder(Order order) {
        // Complex logic for processing order
        // ...
        // Hundreds of lines of code
        // ...
    }

    // Simple approach
    public void processOrder(Order order) {
        validateOrder(order);
        calculateTotal(order);
        updateInventory(order);
        generateInvoice(order);
    }
}
