package liskov_substitution_principle.lsp_violated;

public class Test {
    static void getAreaTest(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        getAreaTest(rc); // this will work fine

        Rectangle sq = new Square();
        sq.setWidth(5); // here result is unexpected
        getAreaTest(sq);
    }
}
