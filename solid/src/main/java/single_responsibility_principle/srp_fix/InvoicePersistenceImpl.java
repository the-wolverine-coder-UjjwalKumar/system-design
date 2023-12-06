package single_responsibility_principle.srp_fix;

public class InvoicePersistenceImpl implements InvoicePersistence {
    @Override
    public void persistInvoice() {
        System.out.println("Saved invoice in mySql DB !!");
    }
}
