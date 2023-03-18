package operators;

public class OperatoriJava {
    public static void main(String[] args) {
        System.out.println("Gli operatori in java");
        System.out.println("Unari ++ e --");
        // esempio di uso di notazione prefissa e postfissa e loro comportamento
        int x = 0;
        int y = 0;

        System.out.println("x vale " + x + " e y vale " + y);
        System.out.println("Valore di x= " + x++);
        System.out.println("Valore di y=" + --y);

        // concatenazione di stringa se c'è una stringa gli altri operandi che seguono
        // sono promossi a stringa
        String str = "7" + 5 + 10; // tutto diventa stringa
        System.out.println("Stampo str che vale: " + str); // 7150
        str = 7 + 5 + "10"; // qui prima si fa l'addizione tra 7+5 e poi diventa stringa
        System.out.println("Stampo str che vale: " + str); // 1250
        str = "7" + (5 + 10);
        System.out.println("Stampo str che vale: " + str); // 715

        int m = 50;
        int n = ++m;
        System.out.println("N vale = " + n); // 51
        int o = m--;
        System.out.println("0 vale = " + o); // 51, perché ha già registrato l'incremento nell'operazione precedente
        int p = --o + m--; // 50 + 50 = 100 m vale sempre 50 quando si copia m++ o m++ si copia
                           // l'operazione non il valore di m!!
        System.out.println("P vale = " + p);
        int a = m < n ? n < o ? o < p ? p : o : n : m;
        System.out.println("A vale = " + a); // 51

        int k = 4;
        boolean flag = k++ == 5; // k++ è l'operazione postfissa per poi aggiornare a 5 ma k vale ancora 4
        System.out.println("Valore di flag = " + flag); // false
        flag = !flag;
        System.out.println("Valore di flag = " + flag); // true
    }
}