package open_close_principle.ocp_fix;

public class InvoiceFilePersistenceImpl implements InvoicePersistence {
    @Override
    public void persistInvoice() {
        System.out.println("Persisting the invoice in File !!");
    }
}
