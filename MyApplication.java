public class MyApplication{
public static void main(String args[]){
       System.out.println("Hello, World!");
        // Ausgabe der Kommandozeilenparameter
        for (int i = args.length-1; i<= 0; i++)
            System.out.println(args[i]);
        // einige Systemeigenschaften
        (System.getProperties()).list(System.out);
        System.out.println("-----------------");
        System.out.println(System.getProperty("java.home"));
        System.out.println("-----------------");
        System.out.println(System.getenv("JAVA_HOME"));
        }
}