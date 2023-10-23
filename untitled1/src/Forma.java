public class Forma {
    private int a;
    private int b;
    private int area;
    public void calcoloArea () {
        this.area = (this.a* this.b)/2;
        System.out.println("L'area della forma è "+ this.getArea());
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getArea(){
        return area;
    }
    public Forma (int a, int b){
        this.a= a;
        this.b = b;
    }
}
