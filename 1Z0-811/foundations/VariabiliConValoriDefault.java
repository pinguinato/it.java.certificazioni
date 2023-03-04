package variables;

public class VariabiliConValoriDefault {
    // il codice compila correttamente e viene stampato -> Il valore di default per i e y Ã¨ :0 e 0
    static int i;
    int y;
    public static void main(String[]args){
        int p;
        System.out.println("Il valore di default per i e y è :"+ i + " e " + new VariabiliConValoriDefault().y);
    }
}
