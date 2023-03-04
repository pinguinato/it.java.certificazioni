package variables;

public class VariabiliNonInizializzateOK {
    // il codice compila correttamente, la varibili p non viene usata
    static int i;
    int y;
    public static void main(String []args) {
        int p;
        System.out.println("Il codice compila e funziona correttamente, perché la var p non viene usata.");
    }
}