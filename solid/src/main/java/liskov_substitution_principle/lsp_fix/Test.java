package liskov_substitution_principle.lsp_fix;

public class Test {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);

        rectangle.getArea();

        Square sq = new Square();
        sq.setSide(10);
        sq.getArea();
    }
}
