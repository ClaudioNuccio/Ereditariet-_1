public class Rettangolo extends Forma{
    public Rettangolo(int a, int b) {
        super(a, b);
    }

    @Override
    public void calculateArea() {
      this.area = a*b;
        System.out.println(this.area);
    }
}
