import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of invoices: ");
        int n = sc.nextInt();
        sc.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part Number: ");
            String partNumber = sc.nextLine();

            System.out.print("Part Description: ");
            String description = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Price per Item: ");
            double price = sc.nextDouble();
            sc.nextLine(); // clear buffer

            invoices[i] = new Invoice(partNumber, description, quantity, price);
        }

        System.out.println("\n--- Invoice Details ---");
        for (Invoice inv : invoices) {
            inv.displayInvoice();
        }

        sc.close();
    }
}