package foundations;

public class OperatoriJava2 {

    public static void main(String[] args) {

        byte b = 1;
         b = b << 1; // data lossy error

        int c = b << 1;

         byte d += b; // not a statement error

        byte e = 0;
        e += b;

    }

}
