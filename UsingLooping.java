import java.util.Scanner;
public class UsingLooping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //for loop
        System.out.println("Foor Loop");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        //while loop
        System.out.println("While Loop");
        int i = 0;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        //do while loop
        System.out.println("do While Loop");
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
        in.close();
    }
}