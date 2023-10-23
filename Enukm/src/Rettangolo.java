public class Rettangolo extends Forma{
    private final cheForma forma = cheForma.RETTANGOLO;
    public void printForm()
    {
        System.out.println("I am a " + super.getFormString(forma));
    }
}
