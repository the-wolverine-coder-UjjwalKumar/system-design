package single_responsibility_principle.srp_fix;

public class CalculateInvoice {
    double discountRate = 12.0;
    double taxRate = 12.0;

    public double calcInvoice(Book book, int quantity) {
        double price = ((book.price - book.price * discountRate) * quantity);

        double priceWithTaxes = price * (1 + taxRate);

        return priceWithTaxes;
    }
}
