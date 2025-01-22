import java.util.Scanner;
public class AddTwoNumber{
    public static void main(String... args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter any two number");
        double a=in.nextDouble();
        double b=in.nextDouble();
        System.out.println(a+"+"+b +"="+(a+b));
    }
}