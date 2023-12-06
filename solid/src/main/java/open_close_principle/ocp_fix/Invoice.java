package open_close_principle.ocp_fix;

public class Invoice {
    Book book;
    InvoiceFilePersistenceImpl invoiceFilePersistence;
    InvoiceDBPersistenceImpl invoicePersistence;
    InvoicePrintImpl invoicePrint;
    CalculateInvoice calculateInvoice;


    public void perform() {
        this.book = new Book("Ujjwal Book", "UK", 2023, 1000, "yes");
        this.invoicePrint = new InvoicePrintImpl();
        this.invoicePersistence = new InvoiceDBPersistenceImpl();
        this.calculateInvoice = new CalculateInvoice();
        this.invoiceFilePersistence = new InvoiceFilePersistenceImpl();


        // call the independent classes to perform actions
        double invoice = calculateInvoice.calcInvoice(book, 4);
        invoicePrint.printInvoice();
        invoicePersistence.persistInvoice();
        invoiceFilePersistence.persistInvoice();
        System.out.println("Invoice generated for Book : "+book+", amount : "+invoice);

    }
}
