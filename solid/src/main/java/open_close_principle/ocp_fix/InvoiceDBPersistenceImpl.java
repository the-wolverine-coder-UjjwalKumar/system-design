package open_close_principle.ocp_fix;

public class InvoiceDBPersistenceImpl implements InvoicePersistence {
    @Override
    public void persistInvoice() {
        System.out.println("Saved invoice in mySql DB !!");
    }
}
