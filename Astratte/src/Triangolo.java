public class Triangolo extends Forma {

    public Triangolo(int a, int b) {
        super(a, b);
    }

    @Override
    public void calculateArea() {
        this.area= (a*b)/2;
        System.out.println(this.area);
    }
}
