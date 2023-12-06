package open_close_principle.ocp_violated;

public class Invoice {
    Book book;
    InvoicePersistence invoicePersistence;
    InvoicePrint invoicePrint;
    CalculateInvoice calculateInvoice;

    public void perform() {
        this.book = new Book("Ujjwal Book", "UK", 2023, 1000, "yes");
        this.invoicePrint = new InvoicePrint();
        this.invoicePersistence = new InvoicePersistence();
        this.calculateInvoice = new CalculateInvoice();


        // call the independent classes to perform actions
        double invoice = calculateInvoice.calcInvoice(book, 4);
        invoicePrint.printInvoice();
        invoicePersistence.persistInvoice();
        System.out.println("Invoice generated for Book : "+book+", amount : "+invoice);

    }
}
