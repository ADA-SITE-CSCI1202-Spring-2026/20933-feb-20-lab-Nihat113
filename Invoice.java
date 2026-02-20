public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = Math.max(0, quantity);
        this.pricePerItem = Math.max(0, pricePerItem);
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public void displayInvoice() {
        System.out.println("Part Number: " + partNumber);
        System.out.println("Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: " + pricePerItem);
        System.out.println("Invoice Amount: " + getInvoiceAmount());
        System.out.println("---------------------------");
    }
}