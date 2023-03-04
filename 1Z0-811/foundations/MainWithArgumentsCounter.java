package foundations;
public class MainWithArgumentsCounter {
    public static void main(String[]args) {
        System.out.println("Arguments counter = " +args.length);
        for ( int i = 0; i < args.length; i++ ) {
            System.out.println("Arguments ["+i+"]: " + args[i]);
        }

        int val;
        int x = 0;
        if (x == 0) {
            val = 10;
        } else {
            val = 5;
        }

        System.out.println(val);
    }
}
