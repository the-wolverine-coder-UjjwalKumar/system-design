package single_responsibility_principle.srp_fix;

public class InvoicePrintImpl implements InvoicePrint {
    @Override
    public void printInvoice() {
        System.out.println("Printing the invoice using logic 1 !!");
    }
}
