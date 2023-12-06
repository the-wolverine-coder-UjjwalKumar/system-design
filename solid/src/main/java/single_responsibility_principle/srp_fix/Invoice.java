package single_responsibility_principle.srp_fix;

public class Invoice {
    Book book;
    InvoicePersistenceImpl invoicePersistence;
    InvoicePrintImpl invoicePrint;
    CalculateInvoice calculateInvoice;

    public void perform() {
        this.book = new Book("Ujjwal Book", "UK", 2023, 1000, "yes");
        this.invoicePrint = new InvoicePrintImpl();
        this.invoicePersistence = new InvoicePersistenceImpl();
        this.calculateInvoice = new CalculateInvoice();


        // call the independent classes to perform actions
        double invoice = calculateInvoice.calcInvoice(book, 4);
        invoicePrint.printInvoice();
        invoicePersistence.persistInvoice();
        System.out.println("Invoice generated for Book : "+book+", amount : "+invoice);

    }
}
