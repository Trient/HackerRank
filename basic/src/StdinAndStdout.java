import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
 * https://www.hackerrank.com/challenges/java-stdin-stdout/problem
 *
 * @author trientliao@gmail.com
 */
public class StdinAndStdout {
    /**
     * Stdin and Stdout I
     */
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }

    /**
     * Stdin and Stdout II
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        if (scan.hasNextLine()) {
            scan.nextLine();
        }
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
