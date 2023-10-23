public class Rettangolo extends Forma {
    private int a ;
    private int b;
private int area;

    public Rettangolo(int a, int b) {
        super(a,b);
        this.a= a;
        this.b = b;
    }
    @Override
    public  int getArea()
    {
        return this.area;
    }

    @Override
    public void calcoloArea () {
        this.area= this.a*this.b;
        System.out.println("L'area del rettangolo è " + this.getArea());
    }
}
