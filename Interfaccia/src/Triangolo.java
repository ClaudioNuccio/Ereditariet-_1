public class Triangolo implements Forma{
    private int a;
    private int b;
    private int area;
    public Triangolo (int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getArea() {
        return area;
    }

    @Override
    public void calcoloArea() {
        this.area = (this.a*this.b)/2;
        System.out.println("L'area del triangolo è " + getArea());
    }
}
