package foundations;
public class MainWithArgumentsCounter {
    public static void main(String[]args) {
        System.out.println("Arguments counter = " +args.length);
        for ( int i = 0; i < args.length; i++ ) {
            System.out.println("Arguments ["+i+"]: " + args[i]);
        }
    }
}
