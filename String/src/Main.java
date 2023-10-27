import java.util.Scanner;

public class Main {
    public static   void uniCode(String stringa,int posizione ){


        if (posizione < 0 || posizione>= stringa.length()){
            System.out.println("Indice non valido");
        }
            else{
            StringBuilder risultato = new StringBuilder("Il carattere in unicode alla posizone scelta è ");
            int toUnicode = stringa.codePointAt(posizione);
            risultato.append(toUnicode);
            System.out.println(risultato);
        }
    }
    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Inserisci la stringa da prendere in esame");
        String test = scanner.nextLine();
        System.out.println("Inserisci l'indice da esaminare");
        int index  = scanner.nextInt();
        uniCode(test,index);
    }
}
