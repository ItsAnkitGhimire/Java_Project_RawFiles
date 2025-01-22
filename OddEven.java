import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("Is Even");
        } else {
            System.out.println("Is Odd");
        }
        in.close();
    }
}
