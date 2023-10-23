public class Rettangolo implements Forma{
    private int a;
    private int b;
    private int area;
    public Rettangolo (int a, int b){
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
        this.area= this.a* this.b;
        System.out.println("L'area del rettangolo è " + getArea());
    }
}
