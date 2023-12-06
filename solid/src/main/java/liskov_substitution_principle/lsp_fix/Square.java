package liskov_substitution_principle.lsp_fix;

public class Square implements Shapes {
    private int side;
    public Square() {}
    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public int getSide() {
        return this.side;
    }

    @Override
    public int getArea() {
        return this.side*this.side;
    }
}
