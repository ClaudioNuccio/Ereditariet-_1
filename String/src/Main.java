public class Main {
    public static   void uniCode(String stringa,int posizione ){
        int toUnicode = stringa.codePointAt(posizione);

        StringBuilder risultato = new StringBuilder("Il carattere in unicode alla posizone scelta è ");
        risultato.append(toUnicode);

        System.out.println(risultato);
    }
    public static void main (String []args){
        uniCode("Virgulini" , 5);
    }
}
