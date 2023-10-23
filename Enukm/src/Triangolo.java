class Triangolo extends Forma {
    private final cheForma forma = cheForma.TRIANGOLO;
    public void printForm()
    {
        System.out.println("I am a " + super.getFormString(forma));
    }
}


