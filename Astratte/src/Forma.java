public abstract class Forma {
    protected int a;
    protected int b;

    protected int area;
    public abstract void calculateArea ();

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getArea() {
        return area;
    }

    public Forma (int a, int b){
        this.a = a;
        this.b = b;
    }
}
