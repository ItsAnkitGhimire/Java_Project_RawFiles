//Relational Operator
import java.util.Scanner;
public class RelationalOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two number");
        int first = in.nextInt();
        int second = in.nextInt();
        boolean r = first > second;
        System.out.println(first + " > " + second + ":" + r);
        r = first < second;
        System.out.println(first + " < " + second + ":" + r);
        r = first >= second;
        System.out.println(first + " >= " + second + ":" + r);
        r = first <= second;
        System.out.println(first + " <= " + second + ":" + r);
        r = first == second;
        System.out.println(first + " == " + second + ":" + r);
        r = first != second;
        System.out.println(first + " != " + second + ":" + r);
        in.close();
    }
}
