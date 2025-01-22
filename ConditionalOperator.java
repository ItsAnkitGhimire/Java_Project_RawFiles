import java.util.Scanner;
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two number");
        int first = in.nextInt();
        int second = in.nextInt();
        int r = first > second ? first : second;
        System.out.println("result " + r);
        in.close();
    }
}
