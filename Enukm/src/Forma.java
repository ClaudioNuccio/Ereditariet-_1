public class Forma {
     enum cheForma {
         RETTANGOLO,
         TRIANGOLO
    }
    public static String getFormString(cheForma forma)
    {
        switch(forma) {
            case RETTANGOLO:
                return "Rettangolo";
            case TRIANGOLO:
                return "Triangolo";
            default:
                return "SEMPLICE FORMA";
        }
}
}
