public class Triangolo extends Forma{
    public Triangolo(int a, int b) {
        super(a, b);
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public void calcoloArea () {
        this.area = (this.a* this.b)/2;
        System.out.println("L'area del triangolo è " + this.getArea());
    }
}


